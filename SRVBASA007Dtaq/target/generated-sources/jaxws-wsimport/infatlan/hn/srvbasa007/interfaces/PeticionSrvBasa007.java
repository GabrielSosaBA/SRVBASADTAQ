
package infatlan.hn.srvbasa007.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PeticionSrvBasa007 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PeticionSrvBasa007">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa007.hn.infatlan/}PeticionBase">
 *       &lt;sequence>
 *         &lt;element name="referenciaCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoOrdenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prioridadEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorSolicitudNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorDebitoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaOrdenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoTotalOrdenPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalRegistroOrdenPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idClaveConciliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuentaAfectar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coleccionNotaPago" type="{http://interfaces.srvbasa007.hn.infatlan/}NotaPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coleccionItemTransaccionOrdenPago" type="{http://interfaces.srvbasa007.hn.infatlan/}ItemTransaccionOrdenPago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeticionSrvBasa007", propOrder = {
    "referenciaCanal",
    "codigoTipoOrdenPago",
    "prioridadEjecucion",
    "indicadorSolicitudNotificacion",
    "indicadorDebitoCuenta",
    "monedaOrdenPago",
    "montoTotalOrdenPago",
    "totalRegistroOrdenPago",
    "idClaveConciliacion",
    "numeroCuentaAfectar",
    "coleccionNotaPago",
    "coleccionItemTransaccionOrdenPago"
})
public class PeticionSrvBasa007
    extends PeticionBase
{

    @XmlElement(defaultValue = "")
    protected String referenciaCanal;
    @XmlElement(defaultValue = "2")
    protected String codigoTipoOrdenPago;
    @XmlElement(defaultValue = "2")
    protected String prioridadEjecucion;
    @XmlElement(defaultValue = "true")
    protected String indicadorSolicitudNotificacion;
    @XmlElement(defaultValue = "true")
    protected String indicadorDebitoCuenta;
    @XmlElement(defaultValue = "")
    protected String monedaOrdenPago;
    @XmlElement(defaultValue = "0.00")
    protected double montoTotalOrdenPago;
    @XmlElement(defaultValue = "0")
    protected int totalRegistroOrdenPago;
    @XmlElement(defaultValue = "")
    protected String idClaveConciliacion;
    @XmlElement(defaultValue = "")
    protected String numeroCuentaAfectar;
    protected List<NotaPago> coleccionNotaPago;
    protected List<ItemTransaccionOrdenPago> coleccionItemTransaccionOrdenPago;

    /**
     * Obtiene el valor de la propiedad referenciaCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCanal() {
        return referenciaCanal;
    }

    /**
     * Define el valor de la propiedad referenciaCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCanal(String value) {
        this.referenciaCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoOrdenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoOrdenPago() {
        return codigoTipoOrdenPago;
    }

    /**
     * Define el valor de la propiedad codigoTipoOrdenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoOrdenPago(String value) {
        this.codigoTipoOrdenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad prioridadEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrioridadEjecucion() {
        return prioridadEjecucion;
    }

    /**
     * Define el valor de la propiedad prioridadEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrioridadEjecucion(String value) {
        this.prioridadEjecucion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorSolicitudNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorSolicitudNotificacion() {
        return indicadorSolicitudNotificacion;
    }

    /**
     * Define el valor de la propiedad indicadorSolicitudNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorSolicitudNotificacion(String value) {
        this.indicadorSolicitudNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorDebitoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorDebitoCuenta() {
        return indicadorDebitoCuenta;
    }

    /**
     * Define el valor de la propiedad indicadorDebitoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorDebitoCuenta(String value) {
        this.indicadorDebitoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaOrdenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaOrdenPago() {
        return monedaOrdenPago;
    }

    /**
     * Define el valor de la propiedad monedaOrdenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaOrdenPago(String value) {
        this.monedaOrdenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalOrdenPago.
     * 
     */
    public double getMontoTotalOrdenPago() {
        return montoTotalOrdenPago;
    }

    /**
     * Define el valor de la propiedad montoTotalOrdenPago.
     * 
     */
    public void setMontoTotalOrdenPago(double value) {
        this.montoTotalOrdenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRegistroOrdenPago.
     * 
     */
    public int getTotalRegistroOrdenPago() {
        return totalRegistroOrdenPago;
    }

    /**
     * Define el valor de la propiedad totalRegistroOrdenPago.
     * 
     */
    public void setTotalRegistroOrdenPago(int value) {
        this.totalRegistroOrdenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad idClaveConciliacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdClaveConciliacion() {
        return idClaveConciliacion;
    }

    /**
     * Define el valor de la propiedad idClaveConciliacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdClaveConciliacion(String value) {
        this.idClaveConciliacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuentaAfectar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuentaAfectar() {
        return numeroCuentaAfectar;
    }

    /**
     * Define el valor de la propiedad numeroCuentaAfectar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuentaAfectar(String value) {
        this.numeroCuentaAfectar = value;
    }

    /**
     * Gets the value of the coleccionNotaPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionNotaPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionNotaPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaPago }
     * 
     * 
     */
    public List<NotaPago> getColeccionNotaPago() {
        if (coleccionNotaPago == null) {
            coleccionNotaPago = new ArrayList<NotaPago>();
        }
        return this.coleccionNotaPago;
    }

    /**
     * Gets the value of the coleccionItemTransaccionOrdenPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionItemTransaccionOrdenPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionItemTransaccionOrdenPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTransaccionOrdenPago }
     * 
     * 
     */
    public List<ItemTransaccionOrdenPago> getColeccionItemTransaccionOrdenPago() {
        if (coleccionItemTransaccionOrdenPago == null) {
            coleccionItemTransaccionOrdenPago = new ArrayList<ItemTransaccionOrdenPago>();
        }
        return this.coleccionItemTransaccionOrdenPago;
    }

}
