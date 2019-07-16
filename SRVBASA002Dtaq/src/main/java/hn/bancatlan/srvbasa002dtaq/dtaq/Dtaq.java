/*
 * ©Informática Atlántida 2019.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */
package hn.bancatlan.srvbasa002dtaq.dtaq;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.AS400Text;
import com.ibm.as400.access.CharacterFieldDescription;
import com.ibm.as400.access.DataQueue;
import com.ibm.as400.access.DataQueueEntry;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.IllegalObjectTypeException;
import com.ibm.as400.access.KeyedDataQueue;
import com.ibm.as400.access.ObjectDoesNotExistException;
import com.ibm.as400.access.QSYSObjectPathName;
import com.ibm.as400.access.Record;
import com.ibm.as400.access.RecordFormat;
import hn.bancatlan.srvbasa002dtaq.util.AtlantidaException;
import hn.bancatlan.srvbasa002dtaq.util.Util;
import infatlan.hn.srvbasa002.interfaces.BusinessPartnerEmpresa;
import infatlan.hn.srvbasa002.interfaces.BusinessPartnerRol;
import infatlan.hn.srvbasa002.interfaces.PeticionSrvBasa002;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controlador de cola de datos.
 *
 * @author Erick Fabricio Martínez Castellanos
 * @version 1.0.0 03-jul-2019
 */
public class Dtaq {

    /**
     * Cola de datos.
     */
    public static final String DTAQ = "SrvBasa002DTAQ";

    /**
     * Contador de peticiones.
     */
    private static int contador = 0;

    /**
     * Constructor
     *
     * @throws hn.bancatlan.srvbasa002dtaq.util.AtlantidaException
     * caonfiguración fallida
     */
    public Dtaq() throws AtlantidaException {
        if (init()) {
            iniciar();
        } else {
            throw new AtlantidaException("Error al iniciar procesamineto de la cola de datos " + DTAQ);
        }
    }

    /**
     * Prepara la ejecución de la aplicación.
     *
     * @return config
     */
    private boolean init() {
        String ruta = System.getProperty("user.dir");
        Util.FILE_CONFIG = ruta + "/configs/" + DTAQ + ".properties";
        Util.FILE_LOG = ruta + "/logs/AppLog-" + Util.getFechaHoraActual("yyyyMMdd-HH-mm-ss") + ".log";
        return Util.cargarPropiedades();
    }

    /**
     * Bucle de procesamiento.
     */
    private void iniciar() {
        Util.printLog("Inicio de procesamiento de cola " + DTAQ);
        while (Util.properties.getProperty(DTAQ + ".estado").equals("A")) {
            procesar();
            Util.cargarPropiedades();
        }
        Util.printLog("Fin de procesamiento de cola " + DTAQ);
    }

    /**
     * Procesamiento de cola, contiene la llama del miecroservicio.
     */
    private void procesar() {

        //CONEXION
        AS400 as400 = new AS400(Util.properties.getProperty(DTAQ + ".sistema"));
        try {
            as400.setUserId(Util.properties.getProperty(DTAQ + ".usuario"));
            as400.setPassword(Util.properties.getProperty(DTAQ + ".password"));
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR de autenticación de usuario", ex);
        }

        //***************** INICIO Mensaje *****************//        
        //Definición de la estructura de la cola de entrada
        CharacterFieldDescription key = new CharacterFieldDescription(new AS400Text(16, as400), "key");
        CharacterFieldDescription tipoBusqueda = new CharacterFieldDescription(new AS400Text(3, as400), "tipoBusqueda");
        CharacterFieldDescription numeroCliente = new CharacterFieldDescription(new AS400Text(10, as400), "numeroCliente");
        //Formato del mensaje
        RecordFormat dataFormat = new RecordFormat();
        dataFormat.addFieldDescription(key);
        dataFormat.addFieldDescription(tipoBusqueda);
        dataFormat.addFieldDescription(numeroCliente);
        //***************** FIN Mensaje *****************//

        //DTAQ
        DataQueue dqInt = new DataQueue(as400, Util.properties.getProperty(DTAQ + ".rutacola")); //Crea el objeto DataQueue, cola de entrada   
        DataQueueEntry dqInData;
        try {
            dqInData = dqInt.read(-1); //Lea datos de la cola   
            Record data = dataFormat.getNewRecord(dqInData.getData()); //Obtine el mensaje   
            contador++; //Contador de mensajes
            String tramaIn = "";
            String tramaOut = "";

            //Registro de petición IN
            for (int i = 0; i < data.getNumberOfFields(); i++) {
                tramaIn += data.getField(i).toString();
            }
            Util.printLog("Petición # " + contador + " -> IN: " + tramaIn);

            //***************** INICIO Procesamiento *****************//
            //Procesamiento            
            String dataKey = data.getField("key").toString().trim();

            PeticionSrvBasa002 peticionSrvBasa002 = new PeticionSrvBasa002();
            peticionSrvBasa002.setCodigoCanal("1");
            peticionSrvBasa002.setTipoBusqueda(data.getField("tipoBusqueda").toString().trim());
            peticionSrvBasa002.setNumeroCliente(new Long(data.getField("numeroCliente").toString().trim()));

            //tramaOut = dataKey + "|RESP"; //Trama de respuesta
            String trama = consultarServicio(tramaIn, peticionSrvBasa002);
            tramaOut = dataKey + "|" + trama; //Trama de respuesta
            //***************** FIN Procesamiento *****************//       
            //Registro de procesamineto OUT
            Util.printLog("Petición # " + contador + " -> OUT: " + tramaOut);
            //Respuesta            
            QSYSObjectPathName name = new QSYSObjectPathName(Util.properties.getProperty(DTAQ + ".libreria"), Util.properties.getProperty(DTAQ + ".colasalida"), "DTAQ");
            KeyedDataQueue dqOut = new KeyedDataQueue(as400, name.getPath());
            dqOut.write(dataKey, tramaOut);
        } catch (AS400SecurityException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR: AS400SecurityException", ex);
        } catch (ErrorCompletingRequestException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR: ErrorCompletingRequestException", ex);
        } catch (IOException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "EEROR: IOException", ex);
        } catch (IllegalObjectTypeException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR: IllegalObjectTypeException", ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR: InterruptedException", ex);
        } catch (ObjectDoesNotExistException ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR: ObjectDoesNotExistException", ex);
        }
    }

    private String consultarServicio(String tramaIn, PeticionSrvBasa002 peticionSrvBasa002) {
        String tramaOut = "";

        try { // Call Web Service Operation
            infatlan.hn.srvbasa002.servicios.expuestos.SrvBasa002ServiceService service = new infatlan.hn.srvbasa002.servicios.expuestos.SrvBasa002ServiceService();
            infatlan.hn.srvbasa002.servicios.expuestos.ServicioSrvBasa002Interfaz port = service.getSrvBasa002ServicePort();
            infatlan.hn.srvbasa002.interfaces.RespuestaSrvBasa002 respuestaSrvBasa002 = port.ejecutarSrvBasa002(peticionSrvBasa002);

            //Generando trama de respuesta
            tramaOut += respuestaSrvBasa002.getCodigoMensaje() + "|";
            tramaOut += respuestaSrvBasa002.getMensaje() + "|";
            tramaOut += respuestaSrvBasa002.getCodigoUnicoEjecucionSAP() + "|";
            tramaOut += respuestaSrvBasa002.getIdReferenciaSAP() + "|";
                                    
            tramaOut += respuestaSrvBasa002.getFechaHoraCreacionSAP() + "|";
            tramaOut += respuestaSrvBasa002.getEstadoTransaccionSAP() + "|";
            tramaOut += respuestaSrvBasa002.getIdentificadorUnicoClienteSAP() + "|";
            tramaOut += respuestaSrvBasa002.getCodigoClienteSAP() + "|";
            tramaOut += respuestaSrvBasa002.getCodigoCategoriaCliente() + "|";
            tramaOut += respuestaSrvBasa002.getDescripcionCategoriaCliente() + "|";
            tramaOut += respuestaSrvBasa002.getCodigoEstadoCliente() + "|";
            tramaOut += respuestaSrvBasa002.getDescripcionEstadoCliente() + "|";
            tramaOut += respuestaSrvBasa002.getIndicadorPersonaNatural() + "|";
            tramaOut += respuestaSrvBasa002.getIndicadorClienteVIP() + "|";
            tramaOut += respuestaSrvBasa002.getIndicadorClienteIndeseable() + "|";
            tramaOut += respuestaSrvBasa002.getNombreCompletoCliente() + "|";
            
            BusinessPartnerEmpresa businessPartnerEmpresa = respuestaSrvBasa002.getBusinessPartnerEmpresa();
            tramaOut += businessPartnerEmpresa.getNombreComercial() + "|";
            tramaOut += businessPartnerEmpresa.getCodigoFormaJuridica() + "|";
            tramaOut += businessPartnerEmpresa.getDescripcionFormaJuridica() + "|";
            tramaOut += businessPartnerEmpresa.getFechaConstitucionEmpresa() + "|";
            tramaOut += businessPartnerEmpresa.getTipoEntidadJuridica() + "|";
            
            tramaOut += respuestaSrvBasa002.getNombreDireccionCliente() + "|";
            tramaOut += respuestaSrvBasa002.getCodigoPais() + "|";
            tramaOut += respuestaSrvBasa002.getNombrePais() + "|";
            tramaOut += respuestaSrvBasa002.getNombreCiudad() + "|";
            tramaOut += respuestaSrvBasa002.getDireccionCompleta() + "|";
            
            List<BusinessPartnerRol> businessPartnerRoles = respuestaSrvBasa002.getBusinessPartnerRoles();
            tramaOut += "BPR: " + businessPartnerRoles.size() + "|";
            for(BusinessPartnerRol businessPartnerRol : businessPartnerRoles){
                tramaOut += businessPartnerRol.getCodigoRol() + "|";
                tramaOut += businessPartnerRol.getNombreRol() + "|";
                tramaOut += businessPartnerRol.getFechaInicio() + "|";
                tramaOut += businessPartnerRol.getFechaFin() + "|";                
            }
            
            tramaOut += respuestaSrvBasa002.getIdentificacionPrincipal() + "|";
            
            //Verificacion la longitud de trama e inserta la respuesta en la tabla
            if (tramaOut.length() > 256) {
                Util.printLog("Petición # " + contador + " -> OUT: " + tramaOut); //Salida original                                
                String UUID = respuestaSrvBasa002.getCodigoPeticionUnica();
                Util.insertar(UUID, tramaIn, tramaOut);
                //Solo datos esenciales
                tramaOut = respuestaSrvBasa002.getCodigoMensaje() + "|";
                tramaOut += respuestaSrvBasa002.getMensaje() + "|";                
                tramaOut += respuestaSrvBasa002.getNombreCompletoCliente() + "|";
                tramaOut += respuestaSrvBasa002.getCodigoPais() + "|";
                tramaOut += respuestaSrvBasa002.getNombrePais() + "|";
                tramaOut += respuestaSrvBasa002.getNombreCiudad() + "|";
                tramaOut += respuestaSrvBasa002.getDireccionCompleta() + "|";                
                tramaOut += "UUID:" + UUID + "|";
            }
            
            tramaOut += "*";
            
        } catch (Exception ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR de comunicación WS", ex);
        }

        return tramaOut;
    }

}
