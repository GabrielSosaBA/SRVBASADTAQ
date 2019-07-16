
package infatlan.hn.srvbasa001.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemPartidaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemPartidaPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenciaCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sucursalOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partidaDebito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoTransaccion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="impresoLibreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaAdicional2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoProcesamiento" type="{http://interfaces.srvbasa001.hn.infatlan/}CargoProcesamiento" minOccurs="0"/>
 *         &lt;element name="referenciaOriginadorPago" type="{http://interfaces.srvbasa001.hn.infatlan/}ReferenciaOriginadorPago" minOccurs="0"/>
 *         &lt;element name="referenciaEntradaPrenota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenciaCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coleccionNotaPago" type="{http://interfaces.srvbasa001.hn.infatlan/}ItemNotaPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coleccionParametroAdicinal" type="{http://interfaces.srvbasa001.hn.infatlan/}ParametroAdicional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPartidaPago", propOrder = {
    "referenciaCanal",
    "sucursalOrigen",
    "formaPago",
    "codigoTransaccion",
    "partidaDebito",
    "monedaTransaccion",
    "montoTransaccion",
    "impresoLibreta",
    "referenciaAdicional",
    "referenciaAdicional2",
    "numeroCuenta",
    "cargoProcesamiento",
    "referenciaOriginadorPago",
    "referenciaEntradaPrenota",
    "referenciaCheque",
    "coleccionNotaPago",
    "coleccionParametroAdicinal"
})
@XmlSeeAlso({
    ItemRespuestaPartidaPago.class
})
public class ItemPartidaPago {

    @XmlElement(defaultValue = "")
    protected String referenciaCanal;
    @XmlElement(defaultValue = "")
    protected String sucursalOrigen;
    @XmlElement(defaultValue = "")
    protected String formaPago;
    @XmlElement(defaultValue = "")
    protected String codigoTransaccion;
    @XmlElement(defaultValue = "")
    protected String partidaDebito;
    @XmlElement(defaultValue = "")
    protected String monedaTransaccion;
    @XmlElement(defaultValue = "0.00")
    protected Double montoTransaccion;
    @XmlElement(defaultValue = "")
    protected String impresoLibreta;
    @XmlElement(defaultValue = "")
    protected String referenciaAdicional;
    @XmlElement(defaultValue = "")
    protected String referenciaAdicional2;
    @XmlElement(defaultValue = "")
    protected String numeroCuenta;
    protected CargoProcesamiento cargoProcesamiento;
    protected ReferenciaOriginadorPago referenciaOriginadorPago;
    @XmlElement(defaultValue = "")
    protected String referenciaEntradaPrenota;
    protected String referenciaCheque;
    protected List<ItemNotaPago> coleccionNotaPago;
    protected List<ParametroAdicional> coleccionParametroAdicinal;

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
     * Obtiene el valor de la propiedad sucursalOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursalOrigen() {
        return sucursalOrigen;
    }

    /**
     * Define el valor de la propiedad sucursalOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursalOrigen(String value) {
        this.sucursalOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    /**
     * Define el valor de la propiedad codigoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransaccion(String value) {
        this.codigoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad partidaDebito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartidaDebito() {
        return partidaDebito;
    }

    /**
     * Define el valor de la propiedad partidaDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartidaDebito(String value) {
        this.partidaDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaTransaccion() {
        return monedaTransaccion;
    }

    /**
     * Define el valor de la propiedad monedaTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaTransaccion(String value) {
        this.monedaTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTransaccion() {
        return montoTransaccion;
    }

    /**
     * Define el valor de la propiedad montoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTransaccion(Double value) {
        this.montoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad impresoLibreta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresoLibreta() {
        return impresoLibreta;
    }

    /**
     * Define el valor de la propiedad impresoLibreta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresoLibreta(String value) {
        this.impresoLibreta = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaAdicional() {
        return referenciaAdicional;
    }

    /**
     * Define el valor de la propiedad referenciaAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaAdicional(String value) {
        this.referenciaAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaAdicional2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaAdicional2() {
        return referenciaAdicional2;
    }

    /**
     * Define el valor de la propiedad referenciaAdicional2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaAdicional2(String value) {
        this.referenciaAdicional2 = value;
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
     * Obtiene el valor de la propiedad cargoProcesamiento.
     * 
     * @return
     *     possible object is
     *     {@link CargoProcesamiento }
     *     
     */
    public CargoProcesamiento getCargoProcesamiento() {
        return cargoProcesamiento;
    }

    /**
     * Define el valor de la propiedad cargoProcesamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoProcesamiento }
     *     
     */
    public void setCargoProcesamiento(CargoProcesamiento value) {
        this.cargoProcesamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaOriginadorPago.
     * 
     * @return
     *     possible object is
     *     {@link ReferenciaOriginadorPago }
     *     
     */
    public ReferenciaOriginadorPago getReferenciaOriginadorPago() {
        return referenciaOriginadorPago;
    }

    /**
     * Define el valor de la propiedad referenciaOriginadorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenciaOriginadorPago }
     *     
     */
    public void setReferenciaOriginadorPago(ReferenciaOriginadorPago value) {
        this.referenciaOriginadorPago = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaEntradaPrenota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaEntradaPrenota() {
        return referenciaEntradaPrenota;
    }

    /**
     * Define el valor de la propiedad referenciaEntradaPrenota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaEntradaPrenota(String value) {
        this.referenciaEntradaPrenota = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaCheque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCheque() {
        return referenciaCheque;
    }

    /**
     * Define el valor de la propiedad referenciaCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCheque(String value) {
        this.referenciaCheque = value;
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
     * {@link ItemNotaPago }
     * 
     * 
     */
    public List<ItemNotaPago> getColeccionNotaPago() {
        if (coleccionNotaPago == null) {
            coleccionNotaPago = new ArrayList<ItemNotaPago>();
        }
        return this.coleccionNotaPago;
    }

    /**
     * Gets the value of the coleccionParametroAdicinal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionParametroAdicinal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionParametroAdicinal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroAdicional }
     * 
     * 
     */
    public List<ParametroAdicional> getColeccionParametroAdicinal() {
        if (coleccionParametroAdicinal == null) {
            coleccionParametroAdicinal = new ArrayList<ParametroAdicional>();
        }
        return this.coleccionParametroAdicinal;
    }

}
