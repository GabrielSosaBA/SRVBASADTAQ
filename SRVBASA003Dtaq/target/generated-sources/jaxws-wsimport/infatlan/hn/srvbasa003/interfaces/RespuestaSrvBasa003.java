
package infatlan.hn.srvbasa003.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaSrvBasa003 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaSrvBasa003">
 *   &lt;complexContent>
 *     &lt;extension base="{http://interfaces.srvbasa003.hn.infatlan/}RespuestaBase">
 *       &lt;sequence>
 *         &lt;element name="coleccionCuenta" type="{http://interfaces.srvbasa003.hn.infatlan/}ItemCuenta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaSrvBasa003", propOrder = {
    "coleccionCuenta"
})
public class RespuestaSrvBasa003
    extends RespuestaBase
{

    protected List<ItemCuenta> coleccionCuenta;

    /**
     * Gets the value of the coleccionCuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coleccionCuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColeccionCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCuenta }
     * 
     * 
     */
    public List<ItemCuenta> getColeccionCuenta() {
        if (coleccionCuenta == null) {
            coleccionCuenta = new ArrayList<ItemCuenta>();
        }
        return this.coleccionCuenta;
    }

}
