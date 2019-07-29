
package infatlan.hn.srvbasa007.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemTransaccionOrdenPagoRespuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemTransaccionOrdenPagoRespuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idItemTransaccionOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstadoEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstadoEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoRetiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coleccionComprobacionEjecucionFallida" type="{http://interfaces.srvbasa007.hn.infatlan/}ComprobacionEjecucionFallida" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTransaccionOrdenPagoRespuesta", propOrder = {
    "idItemTransaccionOP",
    "codigoEstadoEjecucion",
    "descripcionEstadoEjecucion",
    "motivoRetiro",
    "moneda",
    "monto",
    "numeroCuenta",
    "coleccionComprobacionEjecucionFallida"
})
public class ItemTransaccionOrdenPagoRespuesta {

    @XmlElement(defaultValue = "")
    protected String idItemTransaccionOP;
    @XmlElement(defaultValue = "")
    protected String codigoEstadoEjecucion;
    @XmlElement(defaultValue = "")
    protected String descripcionEstadoEjecucion;
    @XmlElement(defaultValue = "")
    protected String motivoRetiro;
    @XmlElement(defaultValue = "")
    protected String moneda;
    @XmlElement(defaultValue = "0.00")
    protected double monto;
    @XmlElement(defaultValue = "")
    protected String numeroCuenta;
    protected List<ComprobacionEjecucionFallida> coleccionComprobacionEjecucionFallida;

    /**
     * Obtiene el valor de la propiedad idItemTransaccionOP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItemTransaccionOP() {
        return idItemTransaccionOP;
    }

    /**
     * Define el valor de la propiedad idItemTransaccionOP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItemTransaccionOP(String value) {
        this.idItemTransaccionOP = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoEjecucion() {
        return codigoEstadoEjecucion;
    }

    /**
     * Define el valor de la propiedad codigoEstadoEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoEjecucion(String value) {
        this.codigoEstadoEjecucion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoEjecucion() {
        return descripcionEstadoEjecucion;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoEjecucion(String value) {
        this.descripcionEstadoEjecucion = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoRetiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoRetiro() {
        return motivoRetiro;
    }

    /**
     * Define el valor de la propiedad motivoRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoRetiro(String value) {
        this.motivoRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Gets the value of the coleccionComprobacionEjecucionFallida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionComprobacionEjecucionFallida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionComprobacionEjecucionFallida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComprobacionEjecucionFallida }
     * 
     * 
     */
    public List<ComprobacionEjecucionFallida> getColeccionComprobacionEjecucionFallida() {
        if (coleccionComprobacionEjecucionFallida == null) {
            coleccionComprobacionEjecucionFallida = new ArrayList<ComprobacionEjecucionFallida>();
        }
        return this.coleccionComprobacionEjecucionFallida;
    }

}
