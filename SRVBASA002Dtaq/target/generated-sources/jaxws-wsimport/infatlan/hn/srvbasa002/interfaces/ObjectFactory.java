
package infatlan.hn.srvbasa002.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the infatlan.hn.srvbasa002.interfaces package. 
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

    private final static QName _EjecutarSrvBasa002_QNAME = new QName("http://interfaces.srvbasa002.hn.infatlan/", "ejecutarSrvBasa002");
    private final static QName _EjecutarSrvBasa002Response_QNAME = new QName("http://interfaces.srvbasa002.hn.infatlan/", "ejecutarSrvBasa002Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: infatlan.hn.srvbasa002.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa002Response }
     * 
     */
    public EjecutarSrvBasa002Response createEjecutarSrvBasa002Response() {
        return new EjecutarSrvBasa002Response();
    }

    /**
     * Create an instance of {@link EjecutarSrvBasa002 }
     * 
     */
    public EjecutarSrvBasa002 createEjecutarSrvBasa002() {
        return new EjecutarSrvBasa002();
    }

    /**
     * Create an instance of {@link PeticionBase }
     * 
     */
    public PeticionBase createPeticionBase() {
        return new PeticionBase();
    }

    /**
     * Create an instance of {@link BusinessPartnerPersona }
     * 
     */
    public BusinessPartnerPersona createBusinessPartnerPersona() {
        return new BusinessPartnerPersona();
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
     * Create an instance of {@link BusinessPartnerEmpresa }
     * 
     */
    public BusinessPartnerEmpresa createBusinessPartnerEmpresa() {
        return new BusinessPartnerEmpresa();
    }

    /**
     * Create an instance of {@link BusinessPartnerRol }
     * 
     */
    public BusinessPartnerRol createBusinessPartnerRol() {
        return new BusinessPartnerRol();
    }

    /**
     * Create an instance of {@link PeticionSrvBasa002 }
     * 
     */
    public PeticionSrvBasa002 createPeticionSrvBasa002() {
        return new PeticionSrvBasa002();
    }

    /**
     * Create an instance of {@link BusinessPartnerIdentificacion }
     * 
     */
    public BusinessPartnerIdentificacion createBusinessPartnerIdentificacion() {
        return new BusinessPartnerIdentificacion();
    }

    /**
     * Create an instance of {@link RespuestaSrvBasa002 }
     * 
     */
    public RespuestaSrvBasa002 createRespuestaSrvBasa002() {
        return new RespuestaSrvBasa002();
    }

    /**
     * Create an instance of {@link RespuestaBase }
     * 
     */
    public RespuestaBase createRespuestaBase() {
        return new RespuestaBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa002 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa002.hn.infatlan/", name = "ejecutarSrvBasa002")
    public JAXBElement<EjecutarSrvBasa002> createEjecutarSrvBasa002(EjecutarSrvBasa002 value) {
        return new JAXBElement<EjecutarSrvBasa002>(_EjecutarSrvBasa002_QNAME, EjecutarSrvBasa002 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarSrvBasa002Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.srvbasa002.hn.infatlan/", name = "ejecutarSrvBasa002Response")
    public JAXBElement<EjecutarSrvBasa002Response> createEjecutarSrvBasa002Response(EjecutarSrvBasa002Response value) {
        return new JAXBElement<EjecutarSrvBasa002Response>(_EjecutarSrvBasa002Response_QNAME, EjecutarSrvBasa002Response.class, null, value);
    }

}
