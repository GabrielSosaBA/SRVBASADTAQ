/*
 * ©Informática Atlántida 2019.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */
package hn.bancatlan.srvbasa001dtaq.dtaq;

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
import hn.bancatlan.srvbasa001dtaq.util.AtlantidaException;
import hn.bancatlan.srvbasa001dtaq.util.Util;
import infatlan.hn.srvbasa001.interfaces.ItemNotaPago;
import infatlan.hn.srvbasa001.interfaces.ItemPartidaPago;
import infatlan.hn.srvbasa001.interfaces.ItemRespuestaPartidaPago;
import infatlan.hn.srvbasa001.interfaces.PeticionSrvBasa001;
import java.beans.PropertyVetoException;
import java.io.IOException;
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
    private static final String DTAQ = "SrvBasa001DTAQ";

    /**
     * Contador de peticiones.
     */
    private static int contador = 0;

    /**
     * Constructor
     *
     * @throws hn.bancatlan.srvbasa001dtaq.util.AtlantidaException
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
        CharacterFieldDescription referenciaCanal = new CharacterFieldDescription(new AS400Text(30, as400), "referenciaCanal");
        CharacterFieldDescription sucursalOrigen = new CharacterFieldDescription(new AS400Text(3, as400), "sucursalOrigen");
        CharacterFieldDescription formaPago = new CharacterFieldDescription(new AS400Text(2, as400), "formaPago");
        CharacterFieldDescription codigoTransaccion = new CharacterFieldDescription(new AS400Text(30, as400), "codigoTransaccion");
        CharacterFieldDescription partidaDebito = new CharacterFieldDescription(new AS400Text(10, as400), "partidaDebito");
        CharacterFieldDescription monedaTransaccion = new CharacterFieldDescription(new AS400Text(3, as400), "monedaTransaccion");
        CharacterFieldDescription montoTransaccion = new CharacterFieldDescription(new AS400Text(20, as400), "montoTransaccion");
        CharacterFieldDescription impresoLibreta = new CharacterFieldDescription(new AS400Text(5, as400), "impresoLibreta");
        CharacterFieldDescription numeroCuenta = new CharacterFieldDescription(new AS400Text(25, as400), "numeroCuenta");
        CharacterFieldDescription tipoNotaPago = new CharacterFieldDescription(new AS400Text(10, as400), "tipoNotaPago");
        CharacterFieldDescription textoNotaPago = new CharacterFieldDescription(new AS400Text(40, as400), "textoNotaPago");

        //Formato del mensaje
        RecordFormat dataFormat = new RecordFormat();
        dataFormat.addFieldDescription(key);
        dataFormat.addFieldDescription(referenciaCanal);
        dataFormat.addFieldDescription(sucursalOrigen);
        dataFormat.addFieldDescription(formaPago);
        dataFormat.addFieldDescription(codigoTransaccion);
        dataFormat.addFieldDescription(partidaDebito);
        dataFormat.addFieldDescription(monedaTransaccion);
        dataFormat.addFieldDescription(montoTransaccion);
        dataFormat.addFieldDescription(impresoLibreta);
        dataFormat.addFieldDescription(numeroCuenta);
        dataFormat.addFieldDescription(tipoNotaPago);
        dataFormat.addFieldDescription(textoNotaPago);

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

            
            infatlan.hn.srvbasa001.interfaces.PeticionSrvBasa001 peticionSrvBasa001 = new infatlan.hn.srvbasa001.interfaces.PeticionSrvBasa001();   
            peticionSrvBasa001.setCodigoCanal("01");
            ItemPartidaPago itemPartidaPago = new ItemPartidaPago();            
            peticionSrvBasa001.getColeccionPartidaPago().add(itemPartidaPago);             
            itemPartidaPago.setReferenciaCanal(data.getField("referenciaCanal").toString().trim());            
            itemPartidaPago.setSucursalOrigen(data.getField("sucursalOrigen").toString().trim());
            itemPartidaPago.setFormaPago(data.getField("formaPago").toString().trim());
            itemPartidaPago.setCodigoTransaccion(data.getField("codigoTransaccion").toString().trim());
            itemPartidaPago.setPartidaDebito(data.getField("partidaDebito").toString().trim());
            itemPartidaPago.setMonedaTransaccion(data.getField("monedaTransaccion").toString().trim());
            itemPartidaPago.setMontoTransaccion(Double.parseDouble(data.getField("montoTransaccion").toString().trim()));
            itemPartidaPago.setImpresoLibreta(data.getField("impresoLibreta").toString().trim());
            itemPartidaPago.setNumeroCuenta(data.getField("numeroCuenta").toString().trim());                        
            ItemNotaPago itemNotaPago = new ItemNotaPago();
            itemPartidaPago.getColeccionNotaPago().add(itemNotaPago);
            itemNotaPago.setTipoNotaPago(data.getField("tipoNotaPago").toString().trim());
            itemNotaPago.setTextoNotaPago(data.getField("textoNotaPago").toString().trim());            
             
            
            
            
            /*
            infatlan.hn.srvbasa001.interfaces.PeticionSrvBasa001 peticionSrvBasa001 = new infatlan.hn.srvbasa001.interfaces.PeticionSrvBasa001();              
            peticionSrvBasa001.setCodigoCanal("01");
            
            ItemPartidaPago itemPartidaPago = new ItemPartidaPago();            
            peticionSrvBasa001.getColeccionPartidaPago().add(itemPartidaPago);             
            itemPartidaPago.setReferenciaCanal("11");
            itemPartidaPago.setSucursalOrigen("101");
            itemPartidaPago.setFormaPago("EF");
            itemPartidaPago.setCodigoTransaccion("1710");
            itemPartidaPago.setPartidaDebito("false");
            itemPartidaPago.setMonedaTransaccion("LPS");
            itemPartidaPago.setMontoTransaccion(new Double(100.00));
            itemPartidaPago.setImpresoLibreta("false");
            itemPartidaPago.setNumeroCuenta("1999999811");                        
            ItemNotaPago itemNotaPago = new ItemNotaPago();
            itemPartidaPago.getColeccionNotaPago().add(itemNotaPago);
            itemNotaPago.setTipoNotaPago("002");
            itemNotaPago.setTextoNotaPago("Prueba");
            */
            
            //tramaOut = dataKey + "|RESP"; //TEST
            tramaOut = dataKey + "|" + this.consultarServicio(peticionSrvBasa001); //Trama de respuesta            
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

    private String consultarServicio(PeticionSrvBasa001 peticionSrvBasa001) {
        
        String tramaOut = "";
        
        try { // Call Web Service Operation
            infatlan.hn.srvbasa001.servicios.expuestos.SrvBasa001ServiceService service = new infatlan.hn.srvbasa001.servicios.expuestos.SrvBasa001ServiceService();
            infatlan.hn.srvbasa001.servicios.expuestos.ServicioSrvBasa001Interfaz port = service.getSrvBasa001ServicePort();                        
            infatlan.hn.srvbasa001.interfaces.RespuestaSrvBasa001 respuestaSrvBasa001 = port.ejecutarSrvBasa001(peticionSrvBasa001);
            //Generando trama de respuesta
            tramaOut += respuestaSrvBasa001.getCodigoMensaje() + "|";
            tramaOut += respuestaSrvBasa001.getMensaje() + "|";            
            for(ItemRespuestaPartidaPago item : respuestaSrvBasa001.getColeccionRespuestaPartidoPago()){
                tramaOut += item.getReferenciaCanal() + "|";
                tramaOut += item.getMonedaTransaccion() + "|";
                tramaOut += item.getMontoTransaccion() + "|";
                tramaOut += item.getNumeroCuenta() + "|";
                tramaOut += item.getIdPartida() + "|";
                tramaOut += item.getDescripcionTipoPartida() + "|";
                tramaOut += item.getCodigoEstadoPartida() + "|";
                tramaOut += item.getDescripcionEstadoPartida() + "|";
                tramaOut += item.getDescripcionCodigoTransaccion() + "|";
                tramaOut += item.getFechaPosteo() + "|";
                tramaOut += item.getFechaValor() + "|";          
            }            
            tramaOut += "*";            
        } catch (Exception ex) {            
             Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR de comunicación WS", ex);
        }

        return tramaOut;
    }

}
