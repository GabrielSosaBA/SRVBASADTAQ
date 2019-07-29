
package infatlan.hn.srvbasa007.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa007 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa007">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeticionSrvBasa007" type="{http://interfaces.srvbasa007.hn.infatlan/}PeticionSrvBasa007" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa007", propOrder = {
    "peticionSrvBasa007"
})
public class EjecutarSrvBasa007 {

    @XmlElement(name = "PeticionSrvBasa007")
    protected PeticionSrvBasa007 peticionSrvBasa007;

    /**
     * Obtiene el valor de la propiedad peticionSrvBasa007.
     * 
     * @return
     *     possible object is
     *     {@link PeticionSrvBasa007 }
     *     
     */
    public PeticionSrvBasa007 getPeticionSrvBasa007() {
        return peticionSrvBasa007;
    }

    /**
     * Define el valor de la propiedad peticionSrvBasa007.
     * 
     * @param value
     *     allowed object is
     *     {@link PeticionSrvBasa007 }
     *     
     */
    public void setPeticionSrvBasa007(PeticionSrvBasa007 value) {
        this.peticionSrvBasa007 = value;
    }

}
