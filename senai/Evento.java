package br.com.senai;

import java.util.ArrayList;
import br.com.senai.Cliente;

public class Evento {
    private String nome;
    private String data;
    private ArrayList<Cliente> clientes;

    public Evento() {
        clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente ){
        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' + clientes +
                '}';
    }
}
