
package Proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://example.org/", className = "Proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://example.org/", className = "Proxy.ConvertResponse")
    @Action(input = "http://example.org/BanqueService/ConvertRequest", output = "http://example.org/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "Montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns Proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComte", targetNamespace = "http://example.org/", className = "Proxy.GetComte")
    @ResponseWrapper(localName = "getComteResponse", targetNamespace = "http://example.org/", className = "Proxy.GetComteResponse")
    @Action(input = "http://example.org/BanqueService/getComteRequest", output = "http://example.org/BanqueService/getComteResponse")
    public Compte getComte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<Proxy.Compte>
     */
    @WebMethod(operationName = "ListComptes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListComptes", targetNamespace = "http://example.org/", className = "Proxy.ListComptes")
    @ResponseWrapper(localName = "ListComptesResponse", targetNamespace = "http://example.org/", className = "Proxy.ListComptesResponse")
    @Action(input = "http://example.org/BanqueService/ListComptesRequest", output = "http://example.org/BanqueService/ListComptesResponse")
    public List<Compte> listComptes();

}
