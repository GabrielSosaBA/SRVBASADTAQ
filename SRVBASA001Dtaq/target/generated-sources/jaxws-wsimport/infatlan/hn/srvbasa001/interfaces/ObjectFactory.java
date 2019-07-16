
package infatlan.hn.srvbasa001.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the infatlan.hn.srvbasa001.interfaces package. 
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

    private final static QName _EjecutarSrvBasa001_QNAME = new QName("http://interfaces.srvbasa001.hn.infatlan/", "ejecutarSrvBasa001");
    private final static QName _EjecutarSrvBasa001Response_QNAME = new QName("http://interfaces.srvbasa001.hn.infatlan/", "ejecutarSrvBasa001Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: infatlan.hn.srvbasa001.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa001 }
     * 
     */
    public EjecutarSrvBasa001 createEjecutarSrvBasa001() {
        return new EjecutarSrvBasa001();
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa001Response }
     * 
     */
    public EjecutarSrvBasa001Response createEjecutarSrvBasa001Response() {
        return new EjecutarSrvBasa001Response();
    }

    /**
     * Create an instance of {@link ItemRespuestaPartidaPago }
     * 
     */
    public ItemRespuestaPartidaPago createItemRespuestaPartidaPago() {
        return new ItemRespuestaPartidaPago();
    }

    /**
     * Create an instance of {@link ItemError }
     * 
     */
    public ItemError createItemError() {
        return new ItemError();
    }

    /**
     * Create an instance of {@link CargoProcesamiento }
     * 
     */
    public CargoProcesamiento createCargoProcesamiento() {
        return new CargoProcesamiento();
    }

    /**
     * Create an instance of {@link ReferenciaOriginadorPago }
     * 
     */
    public ReferenciaOriginadorPago createReferenciaOriginadorPago() {
        return new ReferenciaOriginadorPago();
    }

    /**
     * Create an instance of {@link PeticionSrvBasa001 }
     * 
     */
    public PeticionSrvBasa001 createPeticionSrvBasa001() {
        return new PeticionSrvBasa001();
    }

    /**
     * Create an instance of {@link RespuestaSrvBasa001 }
     * 
     */
    public RespuestaSrvBasa001 createRespuestaSrvBasa001() {
        return new RespuestaSrvBasa001();
    }

    /**
     * Create an instance of {@link RespuestaBase }
     * 
     */
    public RespuestaBase createRespuestaBase() {
        return new RespuestaBase();
    }

    /**
     * Create an instance of {@link PeticionBase }
     * 
     */
    public PeticionBase createPeticionBase() {
        return new PeticionBase();
    }

    /**
     * Create an instance of {@link ParametroAdicional }
     * 
     */
    public ParametroAdicional createParametroAdicional() {
        return new ParametroAdicional();
    }

    /**
     * Create an instance of {@link ItemPartidaPago }
     * 
     */
    public ItemPartidaPago createItemPartidaPago() {
        return new ItemPartidaPago();
    }

    /**
     * Create an instance of {@link ItemNotaPago }
     * 
     */
    public ItemNotaPago createItemNotaPago() {
        return new ItemNotaPago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa001 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa001.hn.infatlan/", name = "ejecutarSrvBasa001")
    public JAXBElement<EjecutarSrvBasa001> createEjecutarSrvBasa001(EjecutarSrvBasa001 value) {
        return new JAXBElement<EjecutarSrvBasa001>(_EjecutarSrvBasa001_QNAME, EjecutarSrvBasa001 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa001Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa001.hn.infatlan/", name = "ejecutarSrvBasa001Response")
    public JAXBElement<EjecutarSrvBasa001Response> createEjecutarSrvBasa001Response(EjecutarSrvBasa001Response value) {
        return new JAXBElement<EjecutarSrvBasa001Response>(_EjecutarSrvBasa001Response_QNAME, EjecutarSrvBasa001Response.class, null, value);
    }

}
