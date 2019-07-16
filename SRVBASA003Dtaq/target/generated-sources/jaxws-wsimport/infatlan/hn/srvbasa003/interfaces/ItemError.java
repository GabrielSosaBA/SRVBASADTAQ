
package infatlan.hn.srvbasa003.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemError", propOrder = {
    "idMensajeError",
    "severidad",
    "detalleError"
})
public class ItemError {

    protected String idMensajeError;
    protected String severidad;
    protected String detalleError;

    /**
     * Obtiene el valor de la propiedad idMensajeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMensajeError() {
        return idMensajeError;
    }

    /**
     * Define el valor de la propiedad idMensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMensajeError(String value) {
        this.idMensajeError = value;
    }

    /**
     * Obtiene el valor de la propiedad severidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeveridad() {
        return severidad;
    }

    /**
     * Define el valor de la propiedad severidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeveridad(String value) {
        this.severidad = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleError() {
        return detalleError;
    }

    /**
     * Define el valor de la propiedad detalleError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleError(String value) {
        this.detalleError = value;
    }

}
