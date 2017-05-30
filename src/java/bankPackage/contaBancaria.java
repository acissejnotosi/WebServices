/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankPackage;

/**
 *
 * @author a1562711
 */
public class  contaBancaria  {
    
    public String cliente;
    public Float clienteID;
    public Float contaCorrente;
    public Float contaPoupanca;

    public contaBancaria(String cliente, Float clienteID, Float contaCorrente, Float contaPoupanca) {
        this.cliente = cliente;
        this.clienteID = clienteID;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setClienteID(Float clienteID) {
        this.clienteID = clienteID;
    }

    public void setContaCorrente(Float contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void setContaPoupanca(Float contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public String getCliente() {
        return cliente;
    }

    public Float getClienteID() {
        return clienteID;
    }

    public Float getContaCorrente() {
        return contaCorrente;
    }

    public Float getContaPoupanca() {
        return contaPoupanca;
    }
    
    
    
    
    
}
