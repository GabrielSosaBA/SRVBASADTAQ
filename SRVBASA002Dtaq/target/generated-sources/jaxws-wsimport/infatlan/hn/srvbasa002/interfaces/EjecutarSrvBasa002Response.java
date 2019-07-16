
package infatlan.hn.srvbasa002.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ejecutarSrvBasa002Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ejecutarSrvBasa002Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaSrvBasa002" type="{http://interfaces.srvbasa002.hn.infatlan/}RespuestaSrvBasa002" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarSrvBasa002Response", propOrder = {
    "respuestaSrvBasa002"
})
public class EjecutarSrvBasa002Response {

    @XmlElement(name = "RespuestaSrvBasa002")
    protected RespuestaSrvBasa002 respuestaSrvBasa002;

    /**
     * Obtiene el valor de la propiedad respuestaSrvBasa002.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaSrvBasa002 }
     *     
     */
    public RespuestaSrvBasa002 getRespuestaSrvBasa002() {
        return respuestaSrvBasa002;
    }

    /**
     * Define el valor de la propiedad respuestaSrvBasa002.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaSrvBasa002 }
     *     
     */
    public void setRespuestaSrvBasa002(RespuestaSrvBasa002 value) {
        this.respuestaSrvBasa002 = value;
    }

}
