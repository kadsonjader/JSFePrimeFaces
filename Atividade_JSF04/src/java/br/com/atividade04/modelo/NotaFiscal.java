
package br.com.atividade04.modelo;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private String numero;
    private String cliente;
    private String cpf;
    private List<Item> itens;
    
    //contrutor
    public NotaFiscal(){
        itens = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
