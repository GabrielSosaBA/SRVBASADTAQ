
package infatlan.hn.srvbasa001.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemRespuestaPartidaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemRespuestaPartidaPago">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa001.hn.infatlan/}ItemPartidaPago">
 *       &lt;sequence>
 *         &lt;element name="idPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionTipoPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEstadoPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionEstadoPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionCodigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPosteo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRespuestaPartidaPago", propOrder = {
    "idPartida",
    "descripcionTipoPartida",
    "codigoEstadoPartida",
    "descripcionEstadoPartida",
    "descripcionCodigoTransaccion",
    "fechaPosteo",
    "fechaValor"
})
public class ItemRespuestaPartidaPago
    extends ItemPartidaPago
{

    protected String idPartida;
    protected String descripcionTipoPartida;
    protected String codigoEstadoPartida;
    protected String descripcionEstadoPartida;
    protected String descripcionCodigoTransaccion;
    protected String fechaPosteo;
    protected String fechaValor;

    /**
     * Obtiene el valor de la propiedad idPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPartida() {
        return idPartida;
    }

    /**
     * Define el valor de la propiedad idPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPartida(String value) {
        this.idPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionTipoPartida() {
        return descripcionTipoPartida;
    }

    /**
     * Define el valor de la propiedad descripcionTipoPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionTipoPartida(String value) {
        this.descripcionTipoPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstadoPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstadoPartida() {
        return codigoEstadoPartida;
    }

    /**
     * Define el valor de la propiedad codigoEstadoPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstadoPartida(String value) {
        this.codigoEstadoPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstadoPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstadoPartida() {
        return descripcionEstadoPartida;
    }

    /**
     * Define el valor de la propiedad descripcionEstadoPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstadoPartida(String value) {
        this.descripcionEstadoPartida = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCodigoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCodigoTransaccion() {
        return descripcionCodigoTransaccion;
    }

    /**
     * Define el valor de la propiedad descripcionCodigoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCodigoTransaccion(String value) {
        this.descripcionCodigoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPosteo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPosteo() {
        return fechaPosteo;
    }

    /**
     * Define el valor de la propiedad fechaPosteo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPosteo(String value) {
        this.fechaPosteo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaValor() {
        return fechaValor;
    }

    /**
     * Define el valor de la propiedad fechaValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaValor(String value) {
        this.fechaValor = value;
    }

}
