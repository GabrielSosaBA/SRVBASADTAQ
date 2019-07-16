
package infatlan.hn.srvbasa001.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemNotaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemNotaPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoNotaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textoNotaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNotaPago", propOrder = {
    "tipoNotaPago",
    "textoNotaPago"
})
public class ItemNotaPago {

    protected String tipoNotaPago;
    protected String textoNotaPago;

    /**
     * Obtiene el valor de la propiedad tipoNotaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNotaPago() {
        return tipoNotaPago;
    }

    /**
     * Define el valor de la propiedad tipoNotaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNotaPago(String value) {
        this.tipoNotaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad textoNotaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoNotaPago() {
        return textoNotaPago;
    }

    /**
     * Define el valor de la propiedad textoNotaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoNotaPago(String value) {
        this.textoNotaPago = value;
    }

}
