
package infatlan.hn.srvbasa003.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the infatlan.hn.srvbasa003.interfaces package. 
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

    private final static QName _EjecutarSrvBasa003Response_QNAME = new QName("http://interfaces.srvbasa003.hn.infatlan/", "ejecutarSrvBasa003Response");
    private final static QName _EjecutarSrvBasa003_QNAME = new QName("http://interfaces.srvbasa003.hn.infatlan/", "ejecutarSrvBasa003");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: infatlan.hn.srvbasa003.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa003Response }
     * 
     */
    public EjecutarSrvBasa003Response createEjecutarSrvBasa003Response() {
        return new EjecutarSrvBasa003Response();
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa003 }
     * 
     */
    public EjecutarSrvBasa003 createEjecutarSrvBasa003() {
        return new EjecutarSrvBasa003();
    }

    /**
     * Create an instance of {@link PeticionBase }
     * 
     */
    public PeticionBase createPeticionBase() {
        return new PeticionBase();
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
     * Create an instance of {@link PeticionSrvBasa003 }
     * 
     */
    public PeticionSrvBasa003 createPeticionSrvBasa003() {
        return new PeticionSrvBasa003();
    }

    /**
     * Create an instance of {@link RespuestaSrvBasa003 }
     * 
     */
    public RespuestaSrvBasa003 createRespuestaSrvBasa003() {
        return new RespuestaSrvBasa003();
    }

    /**
     * Create an instance of {@link ItemCuenta }
     * 
     */
    public ItemCuenta createItemCuenta() {
        return new ItemCuenta();
    }

    /**
     * Create an instance of {@link RespuestaBase }
     * 
     */
    public RespuestaBase createRespuestaBase() {
        return new RespuestaBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa003Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa003.hn.infatlan/", name = "ejecutarSrvBasa003Response")
    public JAXBElement<EjecutarSrvBasa003Response> createEjecutarSrvBasa003Response(EjecutarSrvBasa003Response value) {
        return new JAXBElement<EjecutarSrvBasa003Response>(_EjecutarSrvBasa003Response_QNAME, EjecutarSrvBasa003Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa003 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa003.hn.infatlan/", name = "ejecutarSrvBasa003")
    public JAXBElement<EjecutarSrvBasa003> createEjecutarSrvBasa003(EjecutarSrvBasa003 value) {
        return new JAXBElement<EjecutarSrvBasa003>(_EjecutarSrvBasa003_QNAME, EjecutarSrvBasa003 .class, null, value);
    }

}
