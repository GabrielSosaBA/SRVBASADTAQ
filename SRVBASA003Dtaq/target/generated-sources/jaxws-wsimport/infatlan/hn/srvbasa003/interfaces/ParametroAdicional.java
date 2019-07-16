
package infatlan.hn.srvbasa003.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParametroAdicional complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParametroAdicional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLinea" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descripcionValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroAdicional", propOrder = {
    "numeroLinea",
    "descripcionValor",
    "valor"
})
public class ParametroAdicional {

    @XmlElement(defaultValue = "0")
    protected long numeroLinea;
    @XmlElement(defaultValue = "")
    protected String descripcionValor;
    @XmlElement(defaultValue = "")
    protected String valor;

    /**
     * Obtiene el valor de la propiedad numeroLinea.
     * 
     */
    public long getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Define el valor de la propiedad numeroLinea.
     * 
     */
    public void setNumeroLinea(long value) {
        this.numeroLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionValor() {
        return descripcionValor;
    }

    /**
     * Define el valor de la propiedad descripcionValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionValor(String value) {
        this.descripcionValor = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
