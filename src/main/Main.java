package main;

import interfaces.IPoblar;
import interfaces.implementacion.PoblarImpl;
import modelos.Banco;
import modelos.Cliente;
import modelos.Cuenta;
import modelos.enums.TipoCuenta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblar poblar = new PoblarImpl();

        List<Banco> bancos = poblar.CrearBancos();
        System.out.println(bancos);

        List<Cliente> clientes = poblar.CrearClientes();
        System.out.println(clientes);

        List<Cuenta> cuentas = poblar.CrearCuentas();
        System.out.println(cuentas);

        Cuenta cuenta = cuentas.get(0);
        System.out.println(cuenta);

        if (TipoCuenta.AHORROS.equals(cuenta.getTipoCuenta())) {
            System.out.println(cuenta.getCliente().getNombre() + ", Bienvenid@ al portal!");
        } else {
            System.out.println("Acceso Restringido!");
        }

    }
}
