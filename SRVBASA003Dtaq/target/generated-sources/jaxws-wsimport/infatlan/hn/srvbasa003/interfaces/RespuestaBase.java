
package infatlan.hn.srvbasa003.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPeticionUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUnicoEjecucionSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idReferenciaSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraCreacionSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoTransaccionSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coleccionErrorSAP" type="{http://interfaces.srvbasa003.hn.infatlan/}ItemError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaBase", propOrder = {
    "codigoPeticionUnica",
    "codigoMensaje",
    "mensaje",
    "codigoUnicoEjecucionSAP",
    "idReferenciaSAP",
    "fechaHoraCreacionSAP",
    "estadoTransaccionSAP",
    "coleccionErrorSAP"
})
@XmlSeeAlso({
    RespuestaSrvBasa003 .class
})
public class RespuestaBase {

    @XmlElement(defaultValue = "")
    protected String codigoPeticionUnica;
    protected String codigoMensaje;
    protected String mensaje;
    protected String codigoUnicoEjecucionSAP;
    protected String idReferenciaSAP;
    protected String fechaHoraCreacionSAP;
    protected String estadoTransaccionSAP;
    @XmlElement(nillable = true)
    protected List<ItemError> coleccionErrorSAP;

    /**
     * Obtiene el valor de la propiedad codigoPeticionUnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPeticionUnica() {
        return codigoPeticionUnica;
    }

    /**
     * Define el valor de la propiedad codigoPeticionUnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPeticionUnica(String value) {
        this.codigoPeticionUnica = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUnicoEjecucionSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnicoEjecucionSAP() {
        return codigoUnicoEjecucionSAP;
    }

    /**
     * Define el valor de la propiedad codigoUnicoEjecucionSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnicoEjecucionSAP(String value) {
        this.codigoUnicoEjecucionSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad idReferenciaSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReferenciaSAP() {
        return idReferenciaSAP;
    }

    /**
     * Define el valor de la propiedad idReferenciaSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReferenciaSAP(String value) {
        this.idReferenciaSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraCreacionSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraCreacionSAP() {
        return fechaHoraCreacionSAP;
    }

    /**
     * Define el valor de la propiedad fechaHoraCreacionSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraCreacionSAP(String value) {
        this.fechaHoraCreacionSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoTransaccionSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoTransaccionSAP() {
        return estadoTransaccionSAP;
    }

    /**
     * Define el valor de la propiedad estadoTransaccionSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoTransaccionSAP(String value) {
        this.estadoTransaccionSAP = value;
    }

    /**
     * Gets the value of the coleccionErrorSAP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionErrorSAP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionErrorSAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemError }
     * 
     * 
     */
    public List<ItemError> getColeccionErrorSAP() {
        if (coleccionErrorSAP == null) {
            coleccionErrorSAP = new ArrayList<ItemError>();
        }
        return this.coleccionErrorSAP;
    }

}
