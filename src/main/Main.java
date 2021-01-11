package main;

import interfaces.IPoblar;
import interfaces.implementacion.PoblarImpl;
import modelos.Banco;
import modelos.Cliente;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblar poblar = new PoblarImpl();

        List<Banco> bancos = poblar.CrearBancos();
        System.out.println(bancos);

        List<Cliente> clientes = poblar.CrearClientes();
        System.out.println(clientes);

    }
}
