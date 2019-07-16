
package infatlan.hn.srvbasa001.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaSrvBasa001 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaSrvBasa001">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa001.hn.infatlan/}RespuestaBase">
 *       &lt;sequence>
 *         &lt;element name="coleccionRespuestaPartidoPago" type="{http://interfaces.srvbasa001.hn.infatlan/}ItemRespuestaPartidaPago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaSrvBasa001", propOrder = {
    "coleccionRespuestaPartidoPago"
})
public class RespuestaSrvBasa001
    extends RespuestaBase
{

    protected List<ItemRespuestaPartidaPago> coleccionRespuestaPartidoPago;

    /**
     * Gets the value of the coleccionRespuestaPartidoPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionRespuestaPartidoPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionRespuestaPartidoPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemRespuestaPartidaPago }
     * 
     * 
     */
    public List<ItemRespuestaPartidaPago> getColeccionRespuestaPartidoPago() {
        if (coleccionRespuestaPartidoPago == null) {
            coleccionRespuestaPartidoPago = new ArrayList<ItemRespuestaPartidaPago>();
        }
        return this.coleccionRespuestaPartidoPago;
    }

}
