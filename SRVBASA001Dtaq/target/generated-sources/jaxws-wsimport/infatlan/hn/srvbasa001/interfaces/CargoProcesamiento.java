
package infatlan.hn.srvbasa001.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CargoProcesamiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CargoProcesamiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monedaCargoProcesamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoCargoProcesamiento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codigoTransaccionCargoProcesamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoProcesamiento", propOrder = {
    "monedaCargoProcesamiento",
    "montoCargoProcesamiento",
    "codigoTransaccionCargoProcesamiento"
})
public class CargoProcesamiento {

    @XmlElement(defaultValue = "")
    protected String monedaCargoProcesamiento;
    @XmlElement(defaultValue = "0.00")
    protected Double montoCargoProcesamiento;
    @XmlElement(defaultValue = "")
    protected String codigoTransaccionCargoProcesamiento;

    /**
     * Obtiene el valor de la propiedad monedaCargoProcesamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaCargoProcesamiento() {
        return monedaCargoProcesamiento;
    }

    /**
     * Define el valor de la propiedad monedaCargoProcesamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaCargoProcesamiento(String value) {
        this.monedaCargoProcesamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCargoProcesamiento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoCargoProcesamiento() {
        return montoCargoProcesamiento;
    }

    /**
     * Define el valor de la propiedad montoCargoProcesamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoCargoProcesamiento(Double value) {
        this.montoCargoProcesamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransaccionCargoProcesamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransaccionCargoProcesamiento() {
        return codigoTransaccionCargoProcesamiento;
    }

    /**
     * Define el valor de la propiedad codigoTransaccionCargoProcesamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransaccionCargoProcesamiento(String value) {
        this.codigoTransaccionCargoProcesamiento = value;
    }

}
