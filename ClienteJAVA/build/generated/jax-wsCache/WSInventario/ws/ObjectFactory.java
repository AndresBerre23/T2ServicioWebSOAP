
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

    private final static QName _CalcularTotal_QNAME = new QName("http://ws/", "calcularTotal");
    private final static QName _CalcularTotalResponse_QNAME = new QName("http://ws/", "calcularTotalResponse");
    private final static QName _ConsultarProducto_QNAME = new QName("http://ws/", "consultarProducto");
    private final static QName _ConsultarProductoResponse_QNAME = new QName("http://ws/", "consultarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularTotal }
     * 
     */
    public CalcularTotal createCalcularTotal() {
        return new CalcularTotal();
    }

    /**
     * Create an instance of {@link CalcularTotalResponse }
     * 
     */
    public CalcularTotalResponse createCalcularTotalResponse() {
        return new CalcularTotalResponse();
    }

    /**
     * Create an instance of {@link ConsultarProducto }
     * 
     */
    public ConsultarProducto createConsultarProducto() {
        return new ConsultarProducto();
    }

    /**
     * Create an instance of {@link ConsultarProductoResponse }
     * 
     */
    public ConsultarProductoResponse createConsultarProductoResponse() {
        return new ConsultarProductoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "calcularTotal")
    public JAXBElement<CalcularTotal> createCalcularTotal(CalcularTotal value) {
        return new JAXBElement<CalcularTotal>(_CalcularTotal_QNAME, CalcularTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "calcularTotalResponse")
    public JAXBElement<CalcularTotalResponse> createCalcularTotalResponse(CalcularTotalResponse value) {
        return new JAXBElement<CalcularTotalResponse>(_CalcularTotalResponse_QNAME, CalcularTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarProducto")
    public JAXBElement<ConsultarProducto> createConsultarProducto(ConsultarProducto value) {
        return new JAXBElement<ConsultarProducto>(_ConsultarProducto_QNAME, ConsultarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarProductoResponse")
    public JAXBElement<ConsultarProductoResponse> createConsultarProductoResponse(ConsultarProductoResponse value) {
        return new JAXBElement<ConsultarProductoResponse>(_ConsultarProductoResponse_QNAME, ConsultarProductoResponse.class, null, value);
    }

}
