
package infatlan.hn.srvbasa007.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotaPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoNotaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorNotaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaPago", propOrder = {
    "codigoNotaPago",
    "valorNotaPago"
})
public class NotaPago {

    @XmlElement(defaultValue = "")
    protected String codigoNotaPago;
    @XmlElement(defaultValue = "")
    protected String valorNotaPago;

    /**
     * Obtiene el valor de la propiedad codigoNotaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNotaPago() {
        return codigoNotaPago;
    }

    /**
     * Define el valor de la propiedad codigoNotaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNotaPago(String value) {
        this.codigoNotaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad valorNotaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorNotaPago() {
        return valorNotaPago;
    }

    /**
     * Define el valor de la propiedad valorNotaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorNotaPago(String value) {
        this.valorNotaPago = value;
    }

}
