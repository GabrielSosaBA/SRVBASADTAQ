
package infatlan.hn.srvbasa007.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa007Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa007Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaSrvBasa007" type="{http://interfaces.srvbasa007.hn.infatlan/}RespuestaSrvBasa007" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa007Response", propOrder = {
    "respuestaSrvBasa007"
})
public class EjecutarSrvBasa007Response {

    @XmlElement(name = "RespuestaSrvBasa007")
    protected RespuestaSrvBasa007 respuestaSrvBasa007;

    /**
     * Obtiene el valor de la propiedad respuestaSrvBasa007.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaSrvBasa007 }
     *     
     */
    public RespuestaSrvBasa007 getRespuestaSrvBasa007() {
        return respuestaSrvBasa007;
    }

    /**
     * Define el valor de la propiedad respuestaSrvBasa007.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaSrvBasa007 }
     *     
     */
    public void setRespuestaSrvBasa007(RespuestaSrvBasa007 value) {
        this.respuestaSrvBasa007 = value;
    }

}
