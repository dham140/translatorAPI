
package yodawsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "http://www.yodaspeak.co.uk/webservice/yodatalkPortType", targetNamespace = "urn:http://www.yodaspeak.co.uk/webservice/yodatalk")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface YodatalkPortType {


    /**
     * Pass any string and it will be returned as Yoda-Speak.
     * 
     * @param inputText
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "uri:http://www.yodaspeak.co.uk/webservice/yodatalk#yodaTalk")
    @WebResult(partName = "return")
    public String yodaTalk(
        @WebParam(name = "inputText", partName = "inputText")
        String inputText);

}