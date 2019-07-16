
package infatlan.hn.srvbasa003.interfaces;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemCuenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCuentaEstandarSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionTipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstadoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstadoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessPartnerTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCuentaInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saldoContable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saldoRetenidoDebitos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saldoRetenidoCreditos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saldoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codigoSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLibreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCuenta", propOrder = {
    "numeroCuentaEstandarSAP",
    "codigoTipoCuenta",
    "descripcionTipoCuenta",
    "monedaCuenta",
    "codigoEstadoCuenta",
    "descripcionEstadoCuenta",
    "businessPartnerTitular",
    "codigoProducto",
    "descripcionProducto",
    "numeroCuenta",
    "numeroCuentaInterno",
    "codigoBanco",
    "codigoPais",
    "nombrePais",
    "saldoContable",
    "saldoRetenidoDebitos",
    "saldoRetenidoCreditos",
    "saldoDisponible",
    "saldoMinimo",
    "codigoSucursal",
    "numeroLibreta"
})
public class ItemCuenta {

    protected String numeroCuentaEstandarSAP;
    protected String codigoTipoCuenta;
    protected String descripcionTipoCuenta;
    protected String monedaCuenta;
    protected String codigoEstadoCuenta;
    protected String descripcionEstadoCuenta;
    protected String businessPartnerTitular;
    protected String codigoProducto;
    protected String descripcionProducto;
    protected String numeroCuenta;
    protected String numeroCuentaInterno;
    protected String codigoBanco;
    protected String codigoPais;
    protected String nombrePais;
    protected BigDecimal saldoContable;
    protected BigDecimal saldoRetenidoDebitos;
    protected BigDecimal saldoRetenidoCreditos;
    protected BigDecimal saldoDisponible;
    protected BigDecimal saldoMinimo;
    protected String codigoSucursal;
    protected String numeroLibreta;

    /**
     * Obtiene el valor de la propiedad numeroCuentaEstandarSAP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuentaEstandarSAP() {
        return numeroCuentaEstandarSAP;
    }

    /**
     * Define el valor de la propiedad numeroCuentaEstandarSAP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuentaEstandarSAP(String value) {
        this.numeroCuentaEstandarSAP = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoCuenta() {
        return codigoTipoCuenta;
    }

    /**
     * Define el valor de la propiedad codigoTipoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoCuenta(String value) {
        this.codigoTipoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoCuenta() {
        return descripcionTipoCuenta;
    }

    /**
     * Define el valor de la propiedad descripcionTipoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoCuenta(String value) {
        this.descripcionTipoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaCuenta() {
        return monedaCuenta;
    }

    /**
     * Define el valor de la propiedad monedaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaCuenta(String value) {
        this.monedaCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoCuenta() {
        return codigoEstadoCuenta;
    }

    /**
     * Define el valor de la propiedad codigoEstadoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoCuenta(String value) {
        this.codigoEstadoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoCuenta() {
        return descripcionEstadoCuenta;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoCuenta(String value) {
        this.descripcionEstadoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerTitular() {
        return businessPartnerTitular;
    }

    /**
     * Define el valor de la propiedad businessPartnerTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerTitular(String value) {
        this.businessPartnerTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProducto(String value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Define el valor de la propiedad descripcionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProducto(String value) {
        this.descripcionProducto = value;
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
     * Obtiene el valor de la propiedad numeroCuentaInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuentaInterno() {
        return numeroCuentaInterno;
    }

    /**
     * Define el valor de la propiedad numeroCuentaInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuentaInterno(String value) {
        this.numeroCuentaInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBanco() {
        return codigoBanco;
    }

    /**
     * Define el valor de la propiedad codigoBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBanco(String value) {
        this.codigoBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePais() {
        return nombrePais;
    }

    /**
     * Define el valor de la propiedad nombrePais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePais(String value) {
        this.nombrePais = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoContable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoContable() {
        return saldoContable;
    }

    /**
     * Define el valor de la propiedad saldoContable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoContable(BigDecimal value) {
        this.saldoContable = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoRetenidoDebitos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoRetenidoDebitos() {
        return saldoRetenidoDebitos;
    }

    /**
     * Define el valor de la propiedad saldoRetenidoDebitos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoRetenidoDebitos(BigDecimal value) {
        this.saldoRetenidoDebitos = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoRetenidoCreditos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoRetenidoCreditos() {
        return saldoRetenidoCreditos;
    }

    /**
     * Define el valor de la propiedad saldoRetenidoCreditos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoRetenidoCreditos(BigDecimal value) {
        this.saldoRetenidoCreditos = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoDisponible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Define el valor de la propiedad saldoDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoDisponible(BigDecimal value) {
        this.saldoDisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoMinimo() {
        return saldoMinimo;
    }

    /**
     * Define el valor de la propiedad saldoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoMinimo(BigDecimal value) {
        this.saldoMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * Define el valor de la propiedad codigoSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSucursal(String value) {
        this.codigoSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroLibreta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLibreta() {
        return numeroLibreta;
    }

    /**
     * Define el valor de la propiedad numeroLibreta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLibreta(String value) {
        this.numeroLibreta = value;
    }

}
