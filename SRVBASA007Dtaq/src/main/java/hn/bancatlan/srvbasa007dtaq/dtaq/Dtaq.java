/*
 * ©Informática Atlántida 2019.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */

package hn.bancatlan.srvbasa007dtaq.dtaq;

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
import hn.bancatlan.srvbasa007dtaq.util.Util;
import infatlan.hn.srvbasa007.interfaces.ComprobacionEjecucionFallida;
import infatlan.hn.srvbasa007.interfaces.ItemTransaccionOrdenPago;
import infatlan.hn.srvbasa007.interfaces.ItemTransaccionOrdenPagoRespuesta;
import infatlan.hn.srvbasa007.interfaces.NotaPago;
import infatlan.hn.srvbasa007.interfaces.PeticionSrvBasa007;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controlador de cola de datos.
 * @author Erick Fabricio Martínez Castellanos
 * @version 1.0.0 03-jul-2019
 */
public class Dtaq extends Thread {
    
    /**
     * Cola de datos.
     */
    public static final String DTAQ = "SrvBasa007DTAQ";
    
    /**
     * Contador de peticiones.
     */
    public static int contador = 0;
    
    /**
     * Contador de hilos de ejecución.
     */
    public static int hilo = 0;
    
    /**
     * Constructor.
     */
    public Dtaq(){
        super();
        super.setName(DTAQ + "-Thread-" + hilo++);
    }
                
    /**
     * Inicia el hilo de procesamiento.
     */
    @Override
    public void run(){        
        this.iniciar();        
    }
    
    /**
     * Bucle de procesamiento.
     */
    private void iniciar() {      
        Util.printLog("Inicio de procesamiento de cola " + DTAQ + " --> " + super.getName());
        while (Util.properties.getProperty(DTAQ + ".estado").equals("A")) {
            this.procesar();
            Util.cargarPropiedades();
        }
        Util.printLog("Fin de procesamiento de cola " + DTAQ + " --> " + super.getName());
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
        CharacterFieldDescription referenciaCanal = new CharacterFieldDescription(new AS400Text(15, as400), "referenciaCanal");
        //CharacterFieldDescription codigoTipoOrdenPago = new CharacterFieldDescription(new AS400Text(8, as400), "codigoTipoOrdenPago");
        //CharacterFieldDescription prioridadEjecucion = new CharacterFieldDescription(new AS400Text(2, as400), "prioridadEjecucion");
       // CharacterFieldDescription indicadorSolicitudNotificacion = new CharacterFieldDescription(new AS400Text(5, as400), "indicadorSolicitudNotificacion");
       // CharacterFieldDescription indicadorDebitoCuenta = new CharacterFieldDescription(new AS400Text(5, as400), "indicadorDebitoCuenta");
        CharacterFieldDescription monedaOrdenPago = new CharacterFieldDescription(new AS400Text(4, as400), "monedaOrdenPago");
        CharacterFieldDescription montoTotalOrdenPago = new CharacterFieldDescription(new AS400Text(25, as400), "montoTotalOrdenPago");
        CharacterFieldDescription totalRegistroOrdenPago = new CharacterFieldDescription(new AS400Text(3, as400), "totalRegistroOrdenPago");
        CharacterFieldDescription idClaveConciliacion = new CharacterFieldDescription(new AS400Text(15, as400), "idClaveConciliacion");
        CharacterFieldDescription numeroCuentaAfectar = new CharacterFieldDescription(new AS400Text(20, as400), "numeroCuentaAfectar");
        CharacterFieldDescription coleccionNotaPago = new CharacterFieldDescription(new AS400Text(10, as400), "coleccionNotaPago");
        CharacterFieldDescription coleccionItemTransaccionOrdenPago = new CharacterFieldDescription(new AS400Text(30, as400), "coleccionItemTransaccionOrdenPago");
        
        //Formato del mensaje
        RecordFormat dataFormat = new RecordFormat();
        dataFormat.addFieldDescription(key);
        dataFormat.addFieldDescription(referenciaCanal);
        //dataFormat.addFieldDescription(codigoTipoOrdenPago);
        //dataFormat.addFieldDescription(prioridadEjecucion);
       // dataFormat.addFieldDescription(indicadorSolicitudNotificacion);
       // dataFormat.addFieldDescription(indicadorDebitoCuenta);
        dataFormat.addFieldDescription(monedaOrdenPago);
        dataFormat.addFieldDescription(montoTotalOrdenPago);
        dataFormat.addFieldDescription(totalRegistroOrdenPago);
        dataFormat.addFieldDescription(idClaveConciliacion);
        dataFormat.addFieldDescription(numeroCuentaAfectar);
        dataFormat.addFieldDescription(coleccionNotaPago);
        dataFormat.addFieldDescription(coleccionItemTransaccionOrdenPago);
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
            for(int i = 0; i < data.getNumberOfFields(); i++){
                tramaIn += data.getField(i).toString();
            }
            
           
            Util.printLog("Petición # " + contador + " -> IN: " + tramaIn);
            
            //***************** INICIO Procesamiento *****************//
            
            //Procesamiento            
            String dataKey = data.getField("key").toString().trim(); 
            PeticionSrvBasa007 peticionSrvBasa007 = new PeticionSrvBasa007();
            peticionSrvBasa007.setCodigoCanal("1");
            peticionSrvBasa007.setCodigoCoreBanking("SAP");
            peticionSrvBasa007.setReferenciaCanal(data.getField("referenciaCanal").toString().trim());
            peticionSrvBasa007.setCodigoTipoOrdenPago("2");
            peticionSrvBasa007.setPrioridadEjecucion("2");
           // peticionSrvBasa007.setIndicadorSolicitudNotificacion(data.getField("indicadorSolicitudNotificacion").toString().trim());
            //peticionSrvBasa007.setIndicadorDebitoCuenta(data.getField("indicadorDebitoCuenta").toString().trim());
            peticionSrvBasa007.setIndicadorSolicitudNotificacion("true");
            peticionSrvBasa007.setIndicadorDebitoCuenta("true");
            peticionSrvBasa007.setMonedaOrdenPago(data.getField("monedaOrdenPago").toString().trim());
            peticionSrvBasa007.setMontoTotalOrdenPago(Double.parseDouble(data.getField("montoTotalOrdenPago").toString().trim()));
            //peticionSrvBasa007.setMontoTotalOrdenPago(100.00);
            peticionSrvBasa007.setTotalRegistroOrdenPago(Integer.parseInt(data.getField("totalRegistroOrdenPago").toString().trim()));
            peticionSrvBasa007.setIdClaveConciliacion(data.getField("idClaveConciliacion").toString().trim());
            peticionSrvBasa007.setNumeroCuentaAfectar(data.getField("numeroCuentaAfectar").toString().trim());
            
            List<NotaPago> colecionNotaPago = peticionSrvBasa007.getColeccionNotaPago();
            String[] coleccion = data.getField("coleccionNotaPago").toString().trim().split("\\|");
            
            for (String item: coleccion){
                String[] campos = item.split("\\;");
                if(campos.length == 2){//verifcando 
                    NotaPago notapago = new NotaPago();
                    notapago.setCodigoNotaPago(campos[0]);
                    notapago.setValorNotaPago(campos[1]);
                    colecionNotaPago.add(notapago);
                }
            }
            
            List<ItemTransaccionOrdenPago> colecionOrdenPago = peticionSrvBasa007.getColeccionItemTransaccionOrdenPago();
            String[] coleccionOrden = data.getField("coleccionItemTransaccionOrdenPago").toString().trim().split("\\|");
            
            for (String item: coleccionOrden){
                String[] campos = item.split("\\;");
                if(campos.length == 4){//verifcando 
                    ItemTransaccionOrdenPago itemTransaccionOrdenPago = new ItemTransaccionOrdenPago();
                    itemTransaccionOrdenPago.setMoneda(campos[0]);
                    itemTransaccionOrdenPago.setMonto(Double.parseDouble(campos[1]));
                    itemTransaccionOrdenPago.setNumeroCuenta(campos[2]);
                    colecionOrdenPago.add(itemTransaccionOrdenPago);
                    
                    List<NotaPago> colecionnotapago = itemTransaccionOrdenPago.getColeccionNotaPago();
                    String[] coleccionnota = campos[3].trim().split("\\&");
                     for (String itemcolecion: coleccionnota){
                        String[] camposcoleccion = itemcolecion.split("\\*");
                        if(camposcoleccion.length == 2){//verifcando 
                            NotaPago notapago = new NotaPago();
                            notapago.setCodigoNotaPago(camposcoleccion[0]);
                            notapago.setValorNotaPago(camposcoleccion[1]);
                            colecionnotapago.add(notapago);
                        }
                    }
                    
                }
            }
            
            String trama = consultarServicio(tramaIn, peticionSrvBasa007);
            //String respuesta = peticionSrvBasa007.getColeccionItemTransaccionOrdenPago().get(0).getColeccionNotaPago().get(0).getCodigoNotaPago();
            //String trama = "|RESP" + respuesta.toString();
            tramaOut = dataKey + trama; //Trama de respuesta
            
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
    
    /**
     * Conexión WS realiza la petición al microservicio.
     * @param tramaIn
     * @param peticionSrvBasa011
     * @return tramaOut
     */
    /**/
    private String consultarServicio(String tramaIn, PeticionSrvBasa007 peticionSrvBasa007){
        
        String tramaOut = "|";
        try { // Call Web Service Operation
            infatlan.hn.srvbasa007.servicios.expuestos.SrvBasa007ServiceService service = new infatlan.hn.srvbasa007.servicios.expuestos.SrvBasa007ServiceService();
            infatlan.hn.srvbasa007.servicios.expuestos.ServicioSrvBasa007Interfaz port = service.getSrvBasa007ServicePort();
            infatlan.hn.srvbasa007.interfaces.RespuestaSrvBasa007 respuestaSrvBasa007 = port.ejecutarSrvBasa007(peticionSrvBasa007);
            
            //Generando trama de respuesta
            tramaOut += respuestaSrvBasa007.getCodigoMensaje() + "|";
            tramaOut += respuestaSrvBasa007.getMensaje() + "|";
            tramaOut += respuestaSrvBasa007.getIdReferenciaSAP() + "|";
            tramaOut += respuestaSrvBasa007.getFechaHoraCreacionSAP() + "|";
            tramaOut += respuestaSrvBasa007.getEstadoTransaccionSAP() + "|";
            tramaOut += respuestaSrvBasa007.getIdOrdenPago() + "|";
            tramaOut += respuestaSrvBasa007.getReferenciaCanal() + "|";
            tramaOut += respuestaSrvBasa007.getCodigoFormaPago() + "|";
            tramaOut += respuestaSrvBasa007.getDescripcionFormaPago() + "|";
            tramaOut += respuestaSrvBasa007.getCodigoTipoOrdenPago() + "|";
            tramaOut += respuestaSrvBasa007.getDescripcionTipoOrdenPago() + "|";
            tramaOut += respuestaSrvBasa007.getCodigoPrioridadEjecucion() + "|";
            tramaOut += respuestaSrvBasa007.getCodigoEstadoEjecucion() + "|";
            tramaOut += respuestaSrvBasa007.getDescripcionEstadoEjecucion() + "|";
            tramaOut += respuestaSrvBasa007.getFechaEjecucion() + "|";
            tramaOut += respuestaSrvBasa007.getIndicadorSolicitudNotificacion() + "|";
            tramaOut += respuestaSrvBasa007.getMotivoRetiro() + "|";
            tramaOut += respuestaSrvBasa007.getIndicadorDebitoCuenta() + "|";
            tramaOut += respuestaSrvBasa007.getMonedaOrdenPago() + "|";
            tramaOut += respuestaSrvBasa007.getMontoTotalOrdenPago() + "|";
            tramaOut += respuestaSrvBasa007.getTotalRegistroOrdenPago() + "|";
            tramaOut += respuestaSrvBasa007.getIdClaveConciliacion() + "|";
            tramaOut += respuestaSrvBasa007.getNumeroCuentaAfectar() + "|";
            
            List<NotaPago> coleccionNota = respuestaSrvBasa007.getColeccionNotaPago();
            tramaOut += "NOTA:" + coleccionNota.size() + "|";
            
            for(NotaPago itemNotaPago : coleccionNota){
                tramaOut += itemNotaPago.getCodigoNotaPago() + "|";
                tramaOut += itemNotaPago.getValorNotaPago() + "|";
            }
            
            List<ComprobacionEjecucionFallida> coleccionComprobacion = respuestaSrvBasa007.getColeccionComprobacionEjecucionFallida();
            tramaOut += "COMP:" + coleccionComprobacion.size() + "|";
            
            for(ComprobacionEjecucionFallida itemComprobacion : coleccionComprobacion){
                tramaOut += itemComprobacion.getCodigo() + "|";
                tramaOut += itemComprobacion.getNombre() + "|";
                tramaOut += itemComprobacion.getDescripcion() + "|";
            }
            
            List<ItemTransaccionOrdenPagoRespuesta> colecionItemPago = respuestaSrvBasa007.getColeccionItemTransaccionOrdenPagoRespuesta();
            tramaOut +=  "TRANS:" + colecionItemPago.size() + "|";
            
            for(ItemTransaccionOrdenPagoRespuesta itemTransaccionOrden : colecionItemPago){
                tramaOut += itemTransaccionOrden.getIdItemTransaccionOP() + "|";
                tramaOut += itemTransaccionOrden.getCodigoEstadoEjecucion() + "|";
                tramaOut += itemTransaccionOrden.getDescripcionEstadoEjecucion() + "|";
                tramaOut += itemTransaccionOrden.getMotivoRetiro() + "|";
                tramaOut += itemTransaccionOrden.getMoneda() + "|";
                tramaOut += itemTransaccionOrden.getMonto() + "|";
                tramaOut += itemTransaccionOrden.getNumeroCuenta() + "|";
                
                List<ComprobacionEjecucionFallida> colecionComprobacionFallida = itemTransaccionOrden.getColeccionComprobacionEjecucionFallida();
                tramaOut +=  "&COMPRO:" + colecionComprobacionFallida.size() + "|";
                
                for(ComprobacionEjecucionFallida itemComprobacionFallida : colecionComprobacionFallida){
                    tramaOut += itemComprobacionFallida.getCodigo() + "|";
                    tramaOut += itemComprobacionFallida.getNombre() + "|";
                    tramaOut += itemComprobacionFallida.getDescripcion() + "|";
                   
                }
            }
            
            //Verificacion la longitud de trama e inserta la respuesta en la tabla
            if (tramaOut.length() > 256) {
                
                tramaOut += "*";
                
                Util.printLog("Petición Original# " + contador + " -> OUT: " + tramaOut); //Salida original  
                String UUID = respuestaSrvBasa007.getCodigoPeticionUnica();
                Util.insertar(UUID, tramaIn, tramaOut);
                
                tramaOut = "|";
                //solo datos esenciales
                tramaOut += respuestaSrvBasa007.getCodigoMensaje() + "|";
                tramaOut += respuestaSrvBasa007.getMensaje() + "|";
                tramaOut += respuestaSrvBasa007.getIdReferenciaSAP() + "|";
                tramaOut += respuestaSrvBasa007.getCodigoFormaPago() + "|";
                tramaOut += respuestaSrvBasa007.getDescripcionFormaPago() + "|";
                tramaOut += respuestaSrvBasa007.getCodigoTipoOrdenPago() + "|";
                tramaOut += respuestaSrvBasa007.getDescripcionTipoOrdenPago() + "|";
                tramaOut += respuestaSrvBasa007.getCodigoPrioridadEjecucion() + "|";
                tramaOut += respuestaSrvBasa007.getIndicadorSolicitudNotificacion() + "|";
                tramaOut += respuestaSrvBasa007.getMotivoRetiro() + "|";
                tramaOut += respuestaSrvBasa007.getIndicadorDebitoCuenta() + "|";
                tramaOut += respuestaSrvBasa007.getMonedaOrdenPago() + "|";
                tramaOut += respuestaSrvBasa007.getMontoTotalOrdenPago() + "|";
                tramaOut += respuestaSrvBasa007.getTotalRegistroOrdenPago() + "|";
                tramaOut += respuestaSrvBasa007.getIdClaveConciliacion() + "|";
                tramaOut += respuestaSrvBasa007.getNumeroCuentaAfectar() + "|";

                
                tramaOut += "UUID:" + UUID + "|";
            }
            
            tramaOut += "*";
            
            
        } catch (Exception ex) {
            Logger.getLogger(Dtaq.class.getName()).log(Level.SEVERE, "ERROR de comunicación WS", ex);
        }

      return tramaOut;
    }
    
    
}
