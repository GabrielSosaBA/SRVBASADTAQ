
package infatlan.hn.srvbasa003.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa003 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa003">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeticionSrvBasa003" type="{http://interfaces.srvbasa003.hn.infatlan/}PeticionSrvBasa003" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa003", propOrder = {
    "peticionSrvBasa003"
})
public class EjecutarSrvBasa003 {

    @XmlElement(name = "PeticionSrvBasa003")
    protected PeticionSrvBasa003 peticionSrvBasa003;

    /**
     * Obtiene el valor de la propiedad peticionSrvBasa003.
     * 
     * @return
     *     possible object is
     *     {@link PeticionSrvBasa003 }
     *     
     */
    public PeticionSrvBasa003 getPeticionSrvBasa003() {
        return peticionSrvBasa003;
    }

    /**
     * Define el valor de la propiedad peticionSrvBasa003.
     * 
     * @param value
     *     allowed object is
     *     {@link PeticionSrvBasa003 }
     *     
     */
    public void setPeticionSrvBasa003(PeticionSrvBasa003 value) {
        this.peticionSrvBasa003 = value;
    }

}
