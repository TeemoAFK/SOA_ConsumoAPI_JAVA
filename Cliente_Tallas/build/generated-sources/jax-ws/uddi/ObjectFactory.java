
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://UDDI/", "helloResponse");
    private final static QName _TallasConversorResponse_QNAME = new QName("http://UDDI/", "tallas_conversorResponse");
    private final static QName _ConversorNumerosResponse_QNAME = new QName("http://UDDI/", "conversor_numerosResponse");
    private final static QName _TallasConversor_QNAME = new QName("http://UDDI/", "tallas_conversor");
    private final static QName _ConversorNumeros_QNAME = new QName("http://UDDI/", "conversor_numeros");
    private final static QName _Hello_QNAME = new QName("http://UDDI/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversorNumerosResponse }
     * 
     */
    public ConversorNumerosResponse createConversorNumerosResponse() {
        return new ConversorNumerosResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link TallasConversorResponse }
     * 
     */
    public TallasConversorResponse createTallasConversorResponse() {
        return new TallasConversorResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ConversorNumeros }
     * 
     */
    public ConversorNumeros createConversorNumeros() {
        return new ConversorNumeros();
    }

    /**
     * Create an instance of {@link TallasConversor }
     * 
     */
    public TallasConversor createTallasConversor() {
        return new TallasConversor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TallasConversorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "tallas_conversorResponse")
    public JAXBElement<TallasConversorResponse> createTallasConversorResponse(TallasConversorResponse value) {
        return new JAXBElement<TallasConversorResponse>(_TallasConversorResponse_QNAME, TallasConversorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorNumerosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "conversor_numerosResponse")
    public JAXBElement<ConversorNumerosResponse> createConversorNumerosResponse(ConversorNumerosResponse value) {
        return new JAXBElement<ConversorNumerosResponse>(_ConversorNumerosResponse_QNAME, ConversorNumerosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TallasConversor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "tallas_conversor")
    public JAXBElement<TallasConversor> createTallasConversor(TallasConversor value) {
        return new JAXBElement<TallasConversor>(_TallasConversor_QNAME, TallasConversor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorNumeros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "conversor_numeros")
    public JAXBElement<ConversorNumeros> createConversorNumeros(ConversorNumeros value) {
        return new JAXBElement<ConversorNumeros>(_ConversorNumeros_QNAME, ConversorNumeros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
