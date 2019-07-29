
package infatlan.hn.srvbasa007.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaSrvBasa007 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaSrvBasa007">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa007.hn.infatlan/}RespuestaBase">
 *       &lt;sequence>
 *         &lt;element name="idOrdenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoFormaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionFormaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoOrdenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionTipoOrdenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPrioridadEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionPrioridadEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstadoEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstadoEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEjecucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorSolicitudNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivoRetiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorDebitoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaOrdenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoTotalOrdenPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalRegistroOrdenPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idClaveConciliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuentaAfectar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coleccionNotaPago" type="{http://interfaces.srvbasa007.hn.infatlan/}NotaPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coleccionComprobacionEjecucionFallida" type="{http://interfaces.srvbasa007.hn.infatlan/}ComprobacionEjecucionFallida" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coleccionItemTransaccionOrdenPagoRespuesta" type="{http://interfaces.srvbasa007.hn.infatlan/}ItemTransaccionOrdenPagoRespuesta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaSrvBasa007", propOrder = {
    "idOrdenPago",
    "referenciaCanal",
    "codigoFormaPago",
    "descripcionFormaPago",
    "codigoTipoOrdenPago",
    "descripcionTipoOrdenPago",
    "codigoPrioridadEjecucion",
    "descripcionPrioridadEjecucion",
    "codigoEstadoEjecucion",
    "descripcionEstadoEjecucion",
    "fechaEjecucion",
    "indicadorSolicitudNotificacion",
    "motivoRetiro",
    "indicadorDebitoCuenta",
    "monedaOrdenPago",
    "montoTotalOrdenPago",
    "totalRegistroOrdenPago",
    "idClaveConciliacion",
    "numeroCuentaAfectar",
    "coleccionNotaPago",
    "coleccionComprobacionEjecucionFallida",
    "coleccionItemTransaccionOrdenPagoRespuesta"
})
public class RespuestaSrvBasa007
    extends RespuestaBase
{

    @XmlElement(defaultValue = "")
    protected String idOrdenPago;
    @XmlElement(defaultValue = "")
    protected String referenciaCanal;
    @XmlElement(defaultValue = "")
    protected String codigoFormaPago;
    @XmlElement(defaultValue = "")
    protected String descripcionFormaPago;
    @XmlElement(defaultValue = "")
    protected String codigoTipoOrdenPago;
    @XmlElement(defaultValue = "")
    protected String descripcionTipoOrdenPago;
    @XmlElement(defaultValue = "")
    protected String codigoPrioridadEjecucion;
    @XmlElement(defaultValue = "")
    protected String descripcionPrioridadEjecucion;
    @XmlElement(defaultValue = "")
    protected String codigoEstadoEjecucion;
    @XmlElement(defaultValue = "")
    protected String descripcionEstadoEjecucion;
    @XmlElement(defaultValue = "")
    protected String fechaEjecucion;
    @XmlElement(defaultValue = "")
    protected String indicadorSolicitudNotificacion;
    @XmlElement(defaultValue = "")
    protected String motivoRetiro;
    @XmlElement(defaultValue = "")
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
    protected List<ComprobacionEjecucionFallida> coleccionComprobacionEjecucionFallida;
    protected List<ItemTransaccionOrdenPagoRespuesta> coleccionItemTransaccionOrdenPagoRespuesta;

    /**
     * Obtiene el valor de la propiedad idOrdenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrdenPago() {
        return idOrdenPago;
    }

    /**
     * Define el valor de la propiedad idOrdenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrdenPago(String value) {
        this.idOrdenPago = value;
    }

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
     * Obtiene el valor de la propiedad codigoFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFormaPago() {
        return codigoFormaPago;
    }

    /**
     * Define el valor de la propiedad codigoFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFormaPago(String value) {
        this.codigoFormaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionFormaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionFormaPago() {
        return descripcionFormaPago;
    }

    /**
     * Define el valor de la propiedad descripcionFormaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionFormaPago(String value) {
        this.descripcionFormaPago = value;
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
     * Obtiene el valor de la propiedad descripcionTipoOrdenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoOrdenPago() {
        return descripcionTipoOrdenPago;
    }

    /**
     * Define el valor de la propiedad descripcionTipoOrdenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoOrdenPago(String value) {
        this.descripcionTipoOrdenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPrioridadEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrioridadEjecucion() {
        return codigoPrioridadEjecucion;
    }

    /**
     * Define el valor de la propiedad codigoPrioridadEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrioridadEjecucion(String value) {
        this.codigoPrioridadEjecucion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionPrioridadEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPrioridadEjecucion() {
        return descripcionPrioridadEjecucion;
    }

    /**
     * Define el valor de la propiedad descripcionPrioridadEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPrioridadEjecucion(String value) {
        this.descripcionPrioridadEjecucion = value;
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
     * Obtiene el valor de la propiedad fechaEjecucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEjecucion() {
        return fechaEjecucion;
    }

    /**
     * Define el valor de la propiedad fechaEjecucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEjecucion(String value) {
        this.fechaEjecucion = value;
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

    /**
     * Gets the value of the coleccionItemTransaccionOrdenPagoRespuesta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionItemTransaccionOrdenPagoRespuesta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionItemTransaccionOrdenPagoRespuesta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTransaccionOrdenPagoRespuesta }
     * 
     * 
     */
    public List<ItemTransaccionOrdenPagoRespuesta> getColeccionItemTransaccionOrdenPagoRespuesta() {
        if (coleccionItemTransaccionOrdenPagoRespuesta == null) {
            coleccionItemTransaccionOrdenPagoRespuesta = new ArrayList<ItemTransaccionOrdenPagoRespuesta>();
        }
        return this.coleccionItemTransaccionOrdenPagoRespuesta;
    }

}
