
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
    private final static QName _ConversorZapatos_QNAME = new QName("http://UDDI/", "conversor_zapatos");
    private final static QName _ConversorRopa_QNAME = new QName("http://UDDI/", "conversor_ropa");
    private final static QName _ConversorRopaResponse_QNAME = new QName("http://UDDI/", "conversor_ropaResponse");
    private final static QName _Hello_QNAME = new QName("http://UDDI/", "hello");
    private final static QName _ConversorZapatosResponse_QNAME = new QName("http://UDDI/", "conversor_zapatosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversorRopa }
     * 
     */
    public ConversorRopa createConversorRopa() {
        return new ConversorRopa();
    }

    /**
     * Create an instance of {@link ConversorZapatos }
     * 
     */
    public ConversorZapatos createConversorZapatos() {
        return new ConversorZapatos();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ConversorZapatosResponse }
     * 
     */
    public ConversorZapatosResponse createConversorZapatosResponse() {
        return new ConversorZapatosResponse();
    }

    /**
     * Create an instance of {@link ConversorRopaResponse }
     * 
     */
    public ConversorRopaResponse createConversorRopaResponse() {
        return new ConversorRopaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorZapatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "conversor_zapatos")
    public JAXBElement<ConversorZapatos> createConversorZapatos(ConversorZapatos value) {
        return new JAXBElement<ConversorZapatos>(_ConversorZapatos_QNAME, ConversorZapatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorRopa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "conversor_ropa")
    public JAXBElement<ConversorRopa> createConversorRopa(ConversorRopa value) {
        return new JAXBElement<ConversorRopa>(_ConversorRopa_QNAME, ConversorRopa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorRopaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "conversor_ropaResponse")
    public JAXBElement<ConversorRopaResponse> createConversorRopaResponse(ConversorRopaResponse value) {
        return new JAXBElement<ConversorRopaResponse>(_ConversorRopaResponse_QNAME, ConversorRopaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorZapatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "conversor_zapatosResponse")
    public JAXBElement<ConversorZapatosResponse> createConversorZapatosResponse(ConversorZapatosResponse value) {
        return new JAXBElement<ConversorZapatosResponse>(_ConversorZapatosResponse_QNAME, ConversorZapatosResponse.class, null, value);
    }

}
