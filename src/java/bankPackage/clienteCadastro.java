/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankPackage;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author a1562711
 */
@WebService(serviceName = "clienteCadastro")
public class clienteCadastro {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "cadastraNovoCliente")
    public String cadastraNovoCliente(@WebParam(name = "nomeCliente") String nomeCliente, @WebParam(name = "contaCorrenteInicial") float contaCorrenteInicial, @WebParam(name = "contaPoupancaInicial") float contaPoupancaInicial) {
        //TODO write your implementation code here:
        return null;
    }
    
    
}
