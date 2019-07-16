
package infatlan.hn.srvbasa001.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PeticionBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PeticionBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoPeticionUnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioPeticion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionIPPeticion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCoreBanking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametroAdicionalColeccion" type="{http://interfaces.srvbasa001.hn.infatlan/}ParametroAdicional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeticionBase", propOrder = {
    "codigoPeticionUnica",
    "codigoTransaccion",
    "codigoCanal",
    "usuarioPeticion",
    "direccionIPPeticion",
    "codigoPais",
    "codigoBanco",
    "codigoCoreBanking",
    "parametroAdicionalColeccion"
})
@XmlSeeAlso({
    PeticionSrvBasa001 .class
})
public class PeticionBase {

    @XmlElement(defaultValue = "")
    protected String codigoPeticionUnica;
    @XmlElement(defaultValue = "000")
    protected String codigoTransaccion;
    @XmlElement(defaultValue = "1")
    protected String codigoCanal;
    protected String usuarioPeticion;
    protected String direccionIPPeticion;
    @XmlElement(defaultValue = "HN")
    protected String codigoPais;
    @XmlElement(defaultValue = "01")
    protected String codigoBanco;
    @XmlElement(defaultValue = "")
    protected String codigoCoreBanking;
    protected List<ParametroAdicional> parametroAdicionalColeccion;

    /**
     * Obtiene el valor de la propiedad codigoPeticionUnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPeticionUnica() {
        return codigoPeticionUnica;
    }

    /**
     * Define el valor de la propiedad codigoPeticionUnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPeticionUnica(String value) {
        this.codigoPeticionUnica = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    /**
     * Define el valor de la propiedad codigoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransaccion(String value) {
        this.codigoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCanal() {
        return codigoCanal;
    }

    /**
     * Define el valor de la propiedad codigoCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCanal(String value) {
        this.codigoCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioPeticion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioPeticion() {
        return usuarioPeticion;
    }

    /**
     * Define el valor de la propiedad usuarioPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioPeticion(String value) {
        this.usuarioPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionIPPeticion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionIPPeticion() {
        return direccionIPPeticion;
    }

    /**
     * Define el valor de la propiedad direccionIPPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionIPPeticion(String value) {
        this.direccionIPPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBanco() {
        return codigoBanco;
    }

    /**
     * Define el valor de la propiedad codigoBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBanco(String value) {
        this.codigoBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCoreBanking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCoreBanking() {
        return codigoCoreBanking;
    }

    /**
     * Define el valor de la propiedad codigoCoreBanking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCoreBanking(String value) {
        this.codigoCoreBanking = value;
    }

    /**
     * Gets the value of the parametroAdicionalColeccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroAdicionalColeccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroAdicionalColeccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroAdicional }
     * 
     * 
     */
    public List<ParametroAdicional> getParametroAdicionalColeccion() {
        if (parametroAdicionalColeccion == null) {
            parametroAdicionalColeccion = new ArrayList<ParametroAdicional>();
        }
        return this.parametroAdicionalColeccion;
    }

}
