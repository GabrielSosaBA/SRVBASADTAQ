
package infatlan.hn.srvbasa002.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusinessPartnerEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerEmpresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoFormaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionFormaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaConstitucionEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEntidadJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEntidadJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerEmpresa", propOrder = {
    "nombreEmpresa",
    "nombreComercial",
    "codigoFormaJuridica",
    "descripcionFormaJuridica",
    "fechaConstitucionEmpresa",
    "tipoEntidadJuridica",
    "descripcionEntidadJuridica"
})
public class BusinessPartnerEmpresa {

    protected String nombreEmpresa;
    protected String nombreComercial;
    protected String codigoFormaJuridica;
    protected String descripcionFormaJuridica;
    protected String fechaConstitucionEmpresa;
    protected String tipoEntidadJuridica;
    protected String descripcionEntidadJuridica;

    /**
     * Obtiene el valor de la propiedad nombreEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpresa(String value) {
        this.nombreEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoFormaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFormaJuridica() {
        return codigoFormaJuridica;
    }

    /**
     * Define el valor de la propiedad codigoFormaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFormaJuridica(String value) {
        this.codigoFormaJuridica = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionFormaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionFormaJuridica() {
        return descripcionFormaJuridica;
    }

    /**
     * Define el valor de la propiedad descripcionFormaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionFormaJuridica(String value) {
        this.descripcionFormaJuridica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaConstitucionEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConstitucionEmpresa() {
        return fechaConstitucionEmpresa;
    }

    /**
     * Define el valor de la propiedad fechaConstitucionEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConstitucionEmpresa(String value) {
        this.fechaConstitucionEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEntidadJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEntidadJuridica() {
        return tipoEntidadJuridica;
    }

    /**
     * Define el valor de la propiedad tipoEntidadJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEntidadJuridica(String value) {
        this.tipoEntidadJuridica = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEntidadJuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEntidadJuridica() {
        return descripcionEntidadJuridica;
    }

    /**
     * Define el valor de la propiedad descripcionEntidadJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEntidadJuridica(String value) {
        this.descripcionEntidadJuridica = value;
    }

}
