
package infatlan.hn.srvbasa003.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa003Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa003Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaSrvBasa003" type="{http://interfaces.srvbasa003.hn.infatlan/}RespuestaSrvBasa003" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa003Response", propOrder = {
    "respuestaSrvBasa003"
})
public class EjecutarSrvBasa003Response {

    @XmlElement(name = "RespuestaSrvBasa003")
    protected RespuestaSrvBasa003 respuestaSrvBasa003;

    /**
     * Obtiene el valor de la propiedad respuestaSrvBasa003.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaSrvBasa003 }
     *     
     */
    public RespuestaSrvBasa003 getRespuestaSrvBasa003() {
        return respuestaSrvBasa003;
    }

    /**
     * Define el valor de la propiedad respuestaSrvBasa003.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaSrvBasa003 }
     *     
     */
    public void setRespuestaSrvBasa003(RespuestaSrvBasa003 value) {
        this.respuestaSrvBasa003 = value;
    }

}
