
package uddi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Tallas", targetNamespace = "http://UDDI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Tallas {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://UDDI/", className = "uddi.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://UDDI/", className = "uddi.HelloResponse")
    @Action(input = "http://UDDI/Tallas/helloRequest", output = "http://UDDI/Tallas/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param talla
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "tallas_conversor")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "tallas_conversor", targetNamespace = "http://UDDI/", className = "uddi.TallasConversor")
    @ResponseWrapper(localName = "tallas_conversorResponse", targetNamespace = "http://UDDI/", className = "uddi.TallasConversorResponse")
    @Action(input = "http://UDDI/Tallas/tallas_conversorRequest", output = "http://UDDI/Tallas/tallas_conversorResponse")
    public String tallasConversor(
        @WebParam(name = "talla", targetNamespace = "")
        String talla);

    /**
     * 
     * @param talla
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "conversor_numeros")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversor_numeros", targetNamespace = "http://UDDI/", className = "uddi.ConversorNumeros")
    @ResponseWrapper(localName = "conversor_numerosResponse", targetNamespace = "http://UDDI/", className = "uddi.ConversorNumerosResponse")
    @Action(input = "http://UDDI/Tallas/conversor_numerosRequest", output = "http://UDDI/Tallas/conversor_numerosResponse")
    public String conversorNumeros(
        @WebParam(name = "talla", targetNamespace = "")
        String talla);

}
