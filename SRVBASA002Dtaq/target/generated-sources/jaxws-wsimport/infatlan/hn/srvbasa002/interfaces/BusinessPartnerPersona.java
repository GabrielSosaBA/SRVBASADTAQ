
package infatlan.hn.srvbasa002.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusinessPartnerPersona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombrePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionGenero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerPersona", propOrder = {
    "nombrePersona",
    "apellidoPersona",
    "codigoGenero",
    "descripcionGenero",
    "fechaNacimiento",
    "codigoEstadoCivil",
    "descripcionEstadoCivil",
    "codigoNacionalidad",
    "descripcionNacionalidad",
    "indicadorEmpleado"
})
public class BusinessPartnerPersona {

    protected String nombrePersona;
    protected String apellidoPersona;
    protected String codigoGenero;
    protected String descripcionGenero;
    protected String fechaNacimiento;
    protected String codigoEstadoCivil;
    protected String descripcionEstadoCivil;
    protected String codigoNacionalidad;
    protected String descripcionNacionalidad;
    protected String indicadorEmpleado;

    /**
     * Obtiene el valor de la propiedad nombrePersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Define el valor de la propiedad nombrePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersona(String value) {
        this.nombrePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPersona() {
        return apellidoPersona;
    }

    /**
     * Define el valor de la propiedad apellidoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPersona(String value) {
        this.apellidoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGenero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGenero() {
        return codigoGenero;
    }

    /**
     * Define el valor de la propiedad codigoGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGenero(String value) {
        this.codigoGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionGenero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionGenero() {
        return descripcionGenero;
    }

    /**
     * Define el valor de la propiedad descripcionGenero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionGenero(String value) {
        this.descripcionGenero = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoCivil() {
        return codigoEstadoCivil;
    }

    /**
     * Define el valor de la propiedad codigoEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoCivil(String value) {
        this.codigoEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoCivil() {
        return descripcionEstadoCivil;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoCivil(String value) {
        this.descripcionEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNacionalidad() {
        return codigoNacionalidad;
    }

    /**
     * Define el valor de la propiedad codigoNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNacionalidad(String value) {
        this.codigoNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionNacionalidad() {
        return descripcionNacionalidad;
    }

    /**
     * Define el valor de la propiedad descripcionNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionNacionalidad(String value) {
        this.descripcionNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorEmpleado() {
        return indicadorEmpleado;
    }

    /**
     * Define el valor de la propiedad indicadorEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorEmpleado(String value) {
        this.indicadorEmpleado = value;
    }

}
