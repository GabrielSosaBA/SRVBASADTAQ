
package infatlan.hn.srvbasa002.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PeticionSrvBasa002 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PeticionSrvBasa002">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa002.hn.infatlan/}PeticionBase">
 *       &lt;sequence>
 *         &lt;element name="tipoBusqueda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeticionSrvBasa002", propOrder = {
    "tipoBusqueda",
    "numeroCliente"
})
public class PeticionSrvBasa002
    extends PeticionBase
{

    protected String tipoBusqueda;
    protected long numeroCliente;

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
     * Obtiene el valor de la propiedad numeroCliente.
     * 
     */
    public long getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * Define el valor de la propiedad numeroCliente.
     * 
     */
    public void setNumeroCliente(long value) {
        this.numeroCliente = value;
    }

}
