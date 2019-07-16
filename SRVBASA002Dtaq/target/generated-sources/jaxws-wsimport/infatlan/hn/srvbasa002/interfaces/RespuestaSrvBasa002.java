
package infatlan.hn.srvbasa002.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaSrvBasa002 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaSrvBasa002">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa002.hn.infatlan/}RespuestaBase">
 *       &lt;sequence>
 *         &lt;element name="identificadorUnicoClienteSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoClienteSAP" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoCategoriaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionCategoriaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstadoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstadoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorPersonaNatural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorClienteVIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorClienteIndeseable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCompletoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPartnerEmpresa" type="{http://interfaces.srvbasa002.hn.infatlan/}BusinessPartnerEmpresa" minOccurs="0"/>
 *         &lt;element name="businessPartnerPersona" type="{http://interfaces.srvbasa002.hn.infatlan/}BusinessPartnerPersona" minOccurs="0"/>
 *         &lt;element name="nombreDireccionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionCompleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movil1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movil2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPartnerRoles" type="{http://interfaces.srvbasa002.hn.infatlan/}BusinessPartnerRol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identificacionPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPartnerIdentificaciones" type="{http://interfaces.srvbasa002.hn.infatlan/}BusinessPartnerIdentificacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoClienteExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaSrvBasa002", propOrder = {
    "identificadorUnicoClienteSAP",
    "codigoClienteSAP",
    "codigoCategoriaCliente",
    "descripcionCategoriaCliente",
    "codigoEstadoCliente",
    "descripcionEstadoCliente",
    "indicadorPersonaNatural",
    "indicadorClienteVIP",
    "indicadorClienteIndeseable",
    "nombreCompletoCliente",
    "businessPartnerEmpresa",
    "businessPartnerPersona",
    "nombreDireccionCliente",
    "codigoPais",
    "nombrePais",
    "nombreCiudad",
    "direccionCompleta",
    "telefono1",
    "telefono2",
    "movil1",
    "movil2",
    "correoElectronico",
    "businessPartnerRoles",
    "identificacionPrincipal",
    "businessPartnerIdentificaciones",
    "codigoClienteExterno"
})
public class RespuestaSrvBasa002
    extends RespuestaBase
{

    protected String identificadorUnicoClienteSAP;
    protected long codigoClienteSAP;
    protected String codigoCategoriaCliente;
    protected String descripcionCategoriaCliente;
    protected String codigoEstadoCliente;
    protected String descripcionEstadoCliente;
    protected String indicadorPersonaNatural;
    protected String indicadorClienteVIP;
    protected String indicadorClienteIndeseable;
    protected String nombreCompletoCliente;
    protected BusinessPartnerEmpresa businessPartnerEmpresa;
    protected BusinessPartnerPersona businessPartnerPersona;
    protected String nombreDireccionCliente;
    protected String codigoPais;
    protected String nombrePais;
    protected String nombreCiudad;
    protected String direccionCompleta;
    protected String telefono1;
    protected String telefono2;
    protected String movil1;
    protected String movil2;
    protected String correoElectronico;
    protected List<BusinessPartnerRol> businessPartnerRoles;
    protected String identificacionPrincipal;
    protected List<BusinessPartnerIdentificacion> businessPartnerIdentificaciones;
    protected String codigoClienteExterno;

    /**
     * Obtiene el valor de la propiedad identificadorUnicoClienteSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorUnicoClienteSAP() {
        return identificadorUnicoClienteSAP;
    }

    /**
     * Define el valor de la propiedad identificadorUnicoClienteSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorUnicoClienteSAP(String value) {
        this.identificadorUnicoClienteSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoClienteSAP.
     * 
     */
    public long getCodigoClienteSAP() {
        return codigoClienteSAP;
    }

    /**
     * Define el valor de la propiedad codigoClienteSAP.
     * 
     */
    public void setCodigoClienteSAP(long value) {
        this.codigoClienteSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCategoriaCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCategoriaCliente() {
        return codigoCategoriaCliente;
    }

    /**
     * Define el valor de la propiedad codigoCategoriaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCategoriaCliente(String value) {
        this.codigoCategoriaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCategoriaCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCategoriaCliente() {
        return descripcionCategoriaCliente;
    }

    /**
     * Define el valor de la propiedad descripcionCategoriaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCategoriaCliente(String value) {
        this.descripcionCategoriaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoCliente() {
        return codigoEstadoCliente;
    }

    /**
     * Define el valor de la propiedad codigoEstadoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoCliente(String value) {
        this.codigoEstadoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoCliente() {
        return descripcionEstadoCliente;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoCliente(String value) {
        this.descripcionEstadoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorPersonaNatural.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPersonaNatural() {
        return indicadorPersonaNatural;
    }

    /**
     * Define el valor de la propiedad indicadorPersonaNatural.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPersonaNatural(String value) {
        this.indicadorPersonaNatural = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorClienteVIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorClienteVIP() {
        return indicadorClienteVIP;
    }

    /**
     * Define el valor de la propiedad indicadorClienteVIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorClienteVIP(String value) {
        this.indicadorClienteVIP = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorClienteIndeseable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorClienteIndeseable() {
        return indicadorClienteIndeseable;
    }

    /**
     * Define el valor de la propiedad indicadorClienteIndeseable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorClienteIndeseable(String value) {
        this.indicadorClienteIndeseable = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCompletoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    /**
     * Define el valor de la propiedad nombreCompletoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompletoCliente(String value) {
        this.nombreCompletoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerEmpresa }
     *     
     */
    public BusinessPartnerEmpresa getBusinessPartnerEmpresa() {
        return businessPartnerEmpresa;
    }

    /**
     * Define el valor de la propiedad businessPartnerEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerEmpresa }
     *     
     */
    public void setBusinessPartnerEmpresa(BusinessPartnerEmpresa value) {
        this.businessPartnerEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerPersona.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerPersona }
     *     
     */
    public BusinessPartnerPersona getBusinessPartnerPersona() {
        return businessPartnerPersona;
    }

    /**
     * Define el valor de la propiedad businessPartnerPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerPersona }
     *     
     */
    public void setBusinessPartnerPersona(BusinessPartnerPersona value) {
        this.businessPartnerPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDireccionCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDireccionCliente() {
        return nombreDireccionCliente;
    }

    /**
     * Define el valor de la propiedad nombreDireccionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDireccionCliente(String value) {
        this.nombreDireccionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePais() {
        return nombrePais;
    }

    /**
     * Define el valor de la propiedad nombrePais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePais(String value) {
        this.nombrePais = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /**
     * Define el valor de la propiedad nombreCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCiudad(String value) {
        this.nombreCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCompleta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    /**
     * Define el valor de la propiedad direccionCompleta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCompleta(String value) {
        this.direccionCompleta = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * Define el valor de la propiedad telefono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono1(String value) {
        this.telefono1 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * Define el valor de la propiedad telefono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono2(String value) {
        this.telefono2 = value;
    }

    /**
     * Obtiene el valor de la propiedad movil1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovil1() {
        return movil1;
    }

    /**
     * Define el valor de la propiedad movil1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovil1(String value) {
        this.movil1 = value;
    }

    /**
     * Obtiene el valor de la propiedad movil2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovil2() {
        return movil2;
    }

    /**
     * Define el valor de la propiedad movil2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovil2(String value) {
        this.movil2 = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

    /**
     * Gets the value of the businessPartnerRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessPartnerRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessPartnerRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessPartnerRol }
     * 
     * 
     */
    public List<BusinessPartnerRol> getBusinessPartnerRoles() {
        if (businessPartnerRoles == null) {
            businessPartnerRoles = new ArrayList<BusinessPartnerRol>();
        }
        return this.businessPartnerRoles;
    }

    /**
     * Obtiene el valor de la propiedad identificacionPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionPrincipal() {
        return identificacionPrincipal;
    }

    /**
     * Define el valor de la propiedad identificacionPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionPrincipal(String value) {
        this.identificacionPrincipal = value;
    }

    /**
     * Gets the value of the businessPartnerIdentificaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessPartnerIdentificaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessPartnerIdentificaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessPartnerIdentificacion }
     * 
     * 
     */
    public List<BusinessPartnerIdentificacion> getBusinessPartnerIdentificaciones() {
        if (businessPartnerIdentificaciones == null) {
            businessPartnerIdentificaciones = new ArrayList<BusinessPartnerIdentificacion>();
        }
        return this.businessPartnerIdentificaciones;
    }

    /**
     * Obtiene el valor de la propiedad codigoClienteExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClienteExterno() {
        return codigoClienteExterno;
    }

    /**
     * Define el valor de la propiedad codigoClienteExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClienteExterno(String value) {
        this.codigoClienteExterno = value;
    }

}
