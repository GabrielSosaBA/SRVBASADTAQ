
package infatlan.hn.srvbasa007.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the infatlan.hn.srvbasa007.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EjecutarSrvBasa007_QNAME = new QName("http://interfaces.srvbasa007.hn.infatlan/", "ejecutarSrvBasa007");
    private final static QName _EjecutarSrvBasa007Response_QNAME = new QName("http://interfaces.srvbasa007.hn.infatlan/", "ejecutarSrvBasa007Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: infatlan.hn.srvbasa007.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa007 }
     * 
     */
    public EjecutarSrvBasa007 createEjecutarSrvBasa007() {
        return new EjecutarSrvBasa007();
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa007Response }
     * 
     */
    public EjecutarSrvBasa007Response createEjecutarSrvBasa007Response() {
        return new EjecutarSrvBasa007Response();
    }

    /**
     * Create an instance of {@link PeticionBase }
     * 
     */
    public PeticionBase createPeticionBase() {
        return new PeticionBase();
    }

    /**
     * Create an instance of {@link RespuestaSrvBasa007 }
     * 
     */
    public RespuestaSrvBasa007 createRespuestaSrvBasa007() {
        return new RespuestaSrvBasa007();
    }

    /**
     * Create an instance of {@link PeticionSrvBasa007 }
     * 
     */
    public PeticionSrvBasa007 createPeticionSrvBasa007() {
        return new PeticionSrvBasa007();
    }

    /**
     * Create an instance of {@link ItemError }
     * 
     */
    public ItemError createItemError() {
        return new ItemError();
    }

    /**
     * Create an instance of {@link ParametroAdicional }
     * 
     */
    public ParametroAdicional createParametroAdicional() {
        return new ParametroAdicional();
    }

    /**
     * Create an instance of {@link ItemTransaccionOrdenPagoRespuesta }
     * 
     */
    public ItemTransaccionOrdenPagoRespuesta createItemTransaccionOrdenPagoRespuesta() {
        return new ItemTransaccionOrdenPagoRespuesta();
    }

    /**
     * Create an instance of {@link NotaPago }
     * 
     */
    public NotaPago createNotaPago() {
        return new NotaPago();
    }

    /**
     * Create an instance of {@link ItemTransaccionOrdenPago }
     * 
     */
    public ItemTransaccionOrdenPago createItemTransaccionOrdenPago() {
        return new ItemTransaccionOrdenPago();
    }

    /**
     * Create an instance of {@link ComprobacionEjecucionFallida }
     * 
     */
    public ComprobacionEjecucionFallida createComprobacionEjecucionFallida() {
        return new ComprobacionEjecucionFallida();
    }

    /**
     * Create an instance of {@link RespuestaBase }
     * 
     */
    public RespuestaBase createRespuestaBase() {
        return new RespuestaBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa007 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa007.hn.infatlan/", name = "ejecutarSrvBasa007")
    public JAXBElement<EjecutarSrvBasa007> createEjecutarSrvBasa007(EjecutarSrvBasa007 value) {
        return new JAXBElement<EjecutarSrvBasa007>(_EjecutarSrvBasa007_QNAME, EjecutarSrvBasa007 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa007Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa007.hn.infatlan/", name = "ejecutarSrvBasa007Response")
    public JAXBElement<EjecutarSrvBasa007Response> createEjecutarSrvBasa007Response(EjecutarSrvBasa007Response value) {
        return new JAXBElement<EjecutarSrvBasa007Response>(_EjecutarSrvBasa007Response_QNAME, EjecutarSrvBasa007Response.class, null, value);
    }

}
