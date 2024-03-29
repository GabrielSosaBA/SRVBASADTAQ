
package infatlan.hn.srvbasa001.servicios.expuestos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import infatlan.hn.srvbasa001.interfaces.ObjectFactory;
import infatlan.hn.srvbasa001.interfaces.PeticionSrvBasa001;
import infatlan.hn.srvbasa001.interfaces.RespuestaSrvBasa001;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioSrvBasa001Interfaz", targetNamespace = "http://interfaces.srvbasa001.hn.infatlan/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioSrvBasa001Interfaz {


    /**
     * 
     * @param peticionSrvBasa001
     * @return
     *     returns infatlan.hn.srvbasa001.interfaces.RespuestaSrvBasa001
     */
    @WebMethod
    @WebResult(name = "RespuestaSrvBasa001", targetNamespace = "")
    @RequestWrapper(localName = "ejecutarSrvBasa001", targetNamespace = "http://interfaces.srvbasa001.hn.infatlan/", className = "infatlan.hn.srvbasa001.interfaces.EjecutarSrvBasa001")
    @ResponseWrapper(localName = "ejecutarSrvBasa001Response", targetNamespace = "http://interfaces.srvbasa001.hn.infatlan/", className = "infatlan.hn.srvbasa001.interfaces.EjecutarSrvBasa001Response")
    public RespuestaSrvBasa001 ejecutarSrvBasa001(
        @WebParam(name = "PeticionSrvBasa001", targetNamespace = "")
        PeticionSrvBasa001 peticionSrvBasa001);

}
