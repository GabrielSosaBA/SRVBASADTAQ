
package infatlan.hn.srvbasa002.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa002 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa002">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeticionSrvBasa002" type="{http://interfaces.srvbasa002.hn.infatlan/}PeticionSrvBasa002" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa002", propOrder = {
    "peticionSrvBasa002"
})
public class EjecutarSrvBasa002 {

    @XmlElement(name = "PeticionSrvBasa002")
    protected PeticionSrvBasa002 peticionSrvBasa002;

    /**
     * Obtiene el valor de la propiedad peticionSrvBasa002.
     * 
     * @return
     *     possible object is
     *     {@link PeticionSrvBasa002 }
     *     
     */
    public PeticionSrvBasa002 getPeticionSrvBasa002() {
        return peticionSrvBasa002;
    }

    /**
     * Define el valor de la propiedad peticionSrvBasa002.
     * 
     * @param value
     *     allowed object is
     *     {@link PeticionSrvBasa002 }
     *     
     */
    public void setPeticionSrvBasa002(PeticionSrvBasa002 value) {
        this.peticionSrvBasa002 = value;
    }

}
