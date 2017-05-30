/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankPackage;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author a1562711
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    
   

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
    @WebMethod(operationName = "ConsultarContaPoupança")
    public Float ConsultarContaPoupança(@WebParam(name = "cliente") String cliente, @WebParam(name = "clienteID") float clienteID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "consultaContaCorrete")
    public Float consultaContaCorrete(@WebParam(name = "cliente") String cliente, @WebParam(name = "clienteID") float clienteID) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "transferenciaEntreContasCorrentes")
    public String transferenciaEntreContasCorrentes(@WebParam(name = "cliente1") String cliente1, @WebParam(name = "cliente2") String cliente2, @WebParam(name = "cliente1ID") float cliente1ID, @WebParam(name = "cliente2ID") float cliente2ID, @WebParam(name = "valorTransferir") float valorTransferir) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "transferirEntreContaCorrentePraPoupan\u00e7a")
    public String transferirEntreContaCorrentePraPoupança(@WebParam(name = "cliente1") String cliente1, @WebParam(name = "cliente2") String cliente2, @WebParam(name = "cliente1ID") float cliente1ID, @WebParam(name = "cliente2ID") float cliente2ID, @WebParam(name = "valorTrasferir") float valorTrasferir) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "saque")
    public String saque(@WebParam(name = "cliente") String cliente, @WebParam(name = "clienteID") float clienteID, @WebParam(name = "valor") float valor) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "deposito")
    public String deposito(@WebParam(name = "cliente") String cliente, @WebParam(name = "clienteID") float clienteID, @WebParam(name = "valor") float valor) {
        //TODO write your implementation code here:
        return null;
    }


}
