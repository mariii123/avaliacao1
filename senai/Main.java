package br.com.senai;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando efetuação");
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Joazinho");
        cliente1.setCpf("123.456.999-78");
        cliente1.setEmail("joazinho@gmail.com");
        cliente1.setTelefone(1234-5678);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Marcelinho");
        cliente2.setCpf("123.456.999-78");
        cliente2.setEmail("marcelinho@gmail.com");
        cliente2.setTelefone(1234-3333);

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Marquinhos");
        cliente3.setCpf("123.456.765-78");
        cliente3.setEmail("marquinhos@gmail.com");
        cliente3.setTelefone(1234-4444);

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Mateuszinho");
        cliente4.setCpf("123.456.864-78");
        cliente4.setEmail("mateuszinho@gmail.com");
        cliente4.setTelefone(1234-7777);

        Cliente cliente5 = new Cliente();
        cliente5.setNome("Marianinha");
        cliente5.setCpf("123.456.543-78");
        cliente5.setEmail("marianinha@gmail.com");
        cliente5.setTelefone(1234-0000);

        Evento evento1 = new Evento();
        evento1.setData("08/09/2022");
        evento1.setNome("aniversario da marizinha");
        evento1.setCliente(cliente1);
        evento1.setCliente(cliente2);
        evento1.setCliente(cliente3);
        evento1.setCliente(cliente4);
        evento1.setCliente(cliente5);

        Evento evento2 = new Evento();
        evento2.setData("07/07/2022");
        evento2.setNome("aniversario do joazinho");
        evento2.setCliente(cliente1);
        evento2.setCliente(cliente5);
        evento2.setCliente(cliente2);
        evento2.setCliente(cliente3);
        evento2.setCliente(cliente4);

        Evento evento3 = new Evento();
        evento3.setData("17/07/2022");
        evento3.setNome("aniversario do marcelinho");
        evento3.setCliente(cliente1);
        evento3.setCliente(cliente2);
        evento3.setCliente(cliente3);
        evento3.setCliente(cliente4);
        evento3.setCliente(cliente5);


        System.out.println(evento1);
        System.out.println(evento2);
        System.out.println(evento3);

    }
}
