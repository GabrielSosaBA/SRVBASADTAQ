
package infatlan.hn.srvbasa001.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa001Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa001Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaSrvBasa001" type="{http://interfaces.srvbasa001.hn.infatlan/}RespuestaSrvBasa001" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa001Response", propOrder = {
    "respuestaSrvBasa001"
})
public class EjecutarSrvBasa001Response {

    @XmlElement(name = "RespuestaSrvBasa001")
    protected RespuestaSrvBasa001 respuestaSrvBasa001;

    /**
     * Obtiene el valor de la propiedad respuestaSrvBasa001.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaSrvBasa001 }
     *     
     */
    public RespuestaSrvBasa001 getRespuestaSrvBasa001() {
        return respuestaSrvBasa001;
    }

    /**
     * Define el valor de la propiedad respuestaSrvBasa001.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaSrvBasa001 }
     *     
     */
    public void setRespuestaSrvBasa001(RespuestaSrvBasa001 value) {
        this.respuestaSrvBasa001 = value;
    }

}
