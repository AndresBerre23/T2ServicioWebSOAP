
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarReceta_QNAME = new QName("http://ws/", "buscarReceta");
    private final static QName _BuscarRecetaResponse_QNAME = new QName("http://ws/", "buscarRecetaResponse");
    private final static QName _ListarIngredientes_QNAME = new QName("http://ws/", "listarIngredientes");
    private final static QName _ListarIngredientesResponse_QNAME = new QName("http://ws/", "listarIngredientesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarReceta }
     * 
     */
    public BuscarReceta createBuscarReceta() {
        return new BuscarReceta();
    }

    /**
     * Create an instance of {@link BuscarRecetaResponse }
     * 
     */
    public BuscarRecetaResponse createBuscarRecetaResponse() {
        return new BuscarRecetaResponse();
    }

    /**
     * Create an instance of {@link ListarIngredientes }
     * 
     */
    public ListarIngredientes createListarIngredientes() {
        return new ListarIngredientes();
    }

    /**
     * Create an instance of {@link ListarIngredientesResponse }
     * 
     */
    public ListarIngredientesResponse createListarIngredientesResponse() {
        return new ListarIngredientesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarReceta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarReceta")
    public JAXBElement<BuscarReceta> createBuscarReceta(BuscarReceta value) {
        return new JAXBElement<BuscarReceta>(_BuscarReceta_QNAME, BuscarReceta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRecetaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarRecetaResponse")
    public JAXBElement<BuscarRecetaResponse> createBuscarRecetaResponse(BuscarRecetaResponse value) {
        return new JAXBElement<BuscarRecetaResponse>(_BuscarRecetaResponse_QNAME, BuscarRecetaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIngredientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarIngredientes")
    public JAXBElement<ListarIngredientes> createListarIngredientes(ListarIngredientes value) {
        return new JAXBElement<ListarIngredientes>(_ListarIngredientes_QNAME, ListarIngredientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarIngredientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarIngredientesResponse")
    public JAXBElement<ListarIngredientesResponse> createListarIngredientesResponse(ListarIngredientesResponse value) {
        return new JAXBElement<ListarIngredientesResponse>(_ListarIngredientesResponse_QNAME, ListarIngredientesResponse.class, null, value);
    }

}
