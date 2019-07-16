
package infatlan.hn.srvbasa001.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa001">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeticionSrvBasa001" type="{http://interfaces.srvbasa001.hn.infatlan/}PeticionSrvBasa001" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa001", propOrder = {
    "peticionSrvBasa001"
})
public class EjecutarSrvBasa001 {

    @XmlElement(name = "PeticionSrvBasa001")
    protected PeticionSrvBasa001 peticionSrvBasa001;

    /**
     * Obtiene el valor de la propiedad peticionSrvBasa001.
     * 
     * @return
     *     possible object is
     *     {@link PeticionSrvBasa001 }
     *     
     */
    public PeticionSrvBasa001 getPeticionSrvBasa001() {
        return peticionSrvBasa001;
    }

    /**
     * Define el valor de la propiedad peticionSrvBasa001.
     * 
     * @param value
     *     allowed object is
     *     {@link PeticionSrvBasa001 }
     *     
     */
    public void setPeticionSrvBasa001(PeticionSrvBasa001 value) {
        this.peticionSrvBasa001 = value;
    }

}
