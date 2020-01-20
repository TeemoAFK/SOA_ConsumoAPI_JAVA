
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conversor_ropa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conversor_ropa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="talla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversor_ropa", propOrder = {
    "talla"
})
public class ConversorRopa {

    protected String talla;

    /**
     * Obtiene el valor de la propiedad talla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Define el valor de la propiedad talla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalla(String value) {
        this.talla = value;
    }

}
