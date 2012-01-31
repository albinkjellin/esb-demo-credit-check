package org.mulesoft.samples.loan;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2011-12-16T16:39:30.877-08:00
 * Generated source version: 2.3.3
 * 
 */
 
@WebService(targetNamespace = "http://www.mulesoft.org/demo/LoanRequest/", name = "LoanRequest")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoanRequest {

    @WebResult(name = "LoanResp", targetNamespace = "http://www.mulesoft.org/demo/LoanRequest/", partName = "parameters")
    @WebMethod(operationName = "LoanRequest", action = "http://www.mulesoft.org/demo/LoanRequest/LoanRequest")
    public LoanResp loanRequest(
        @WebParam(partName = "parameters", name = "LoanReq", targetNamespace = "http://www.mulesoft.org/demo/LoanRequest/")
        LoanReq parameters
    );
}
