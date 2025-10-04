
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarIngredientes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarIngredientes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarIngredientes", propOrder = {
    "receta"
})
public class ListarIngredientes {

    protected String receta;

    /**
     * Obtiene el valor de la propiedad receta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceta() {
        return receta;
    }

    /**
     * Define el valor de la propiedad receta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceta(String value) {
        this.receta = value;
    }

}
