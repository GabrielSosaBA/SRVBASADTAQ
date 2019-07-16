
package infatlan.hn.srvbasa003.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PeticionSrvBasa003 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PeticionSrvBasa003">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa003.hn.infatlan/}PeticionBase">
 *       &lt;sequence>
 *         &lt;element name="tipoBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeticionSrvBasa003", propOrder = {
    "tipoBusqueda",
    "valorBusqueda"
})
public class PeticionSrvBasa003
    extends PeticionBase
{

    protected String tipoBusqueda;
    protected String valorBusqueda;

    /**
     * Obtiene el valor de la propiedad tipoBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBusqueda() {
        return tipoBusqueda;
    }

    /**
     * Define el valor de la propiedad tipoBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBusqueda(String value) {
        this.tipoBusqueda = value;
    }

    /**
     * Obtiene el valor de la propiedad valorBusqueda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorBusqueda() {
        return valorBusqueda;
    }

    /**
     * Define el valor de la propiedad valorBusqueda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorBusqueda(String value) {
        this.valorBusqueda = value;
    }

}
