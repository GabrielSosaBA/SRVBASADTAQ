
package infatlan.hn.srvbasa002.servicios.expuestos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import infatlan.hn.srvbasa002.interfaces.ObjectFactory;
import infatlan.hn.srvbasa002.interfaces.PeticionSrvBasa002;
import infatlan.hn.srvbasa002.interfaces.RespuestaSrvBasa002;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioSrvBasa002Interfaz", targetNamespace = "http://interfaces.srvbasa002.hn.infatlan/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioSrvBasa002Interfaz {


    /**
     * 
     * @param peticionSrvBasa002
     * @return
     *     returns infatlan.hn.srvbasa002.interfaces.RespuestaSrvBasa002
     */
    @WebMethod
    @WebResult(name = "RespuestaSrvBasa002", targetNamespace = "")
    @RequestWrapper(localName = "ejecutarSrvBasa002", targetNamespace = "http://interfaces.srvbasa002.hn.infatlan/", className = "infatlan.hn.srvbasa002.interfaces.EjecutarSrvBasa002")
    @ResponseWrapper(localName = "ejecutarSrvBasa002Response", targetNamespace = "http://interfaces.srvbasa002.hn.infatlan/", className = "infatlan.hn.srvbasa002.interfaces.EjecutarSrvBasa002Response")
    public RespuestaSrvBasa002 ejecutarSrvBasa002(
        @WebParam(name = "PeticionSrvBasa002", targetNamespace = "")
        PeticionSrvBasa002 peticionSrvBasa002);

}
