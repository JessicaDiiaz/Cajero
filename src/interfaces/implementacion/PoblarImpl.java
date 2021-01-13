package interfaces.implementacion;

import interfaces.IPoblar;
import modelos.Banco;
import modelos.Cliente;
import modelos.Cuenta;
import modelos.Tarjeta;
import modelos.enums.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

public class PoblarImpl implements IPoblar {
    @Override
    public List<Banco> CrearBancos() {
        List<Banco> bancos = new ArrayList<>();

        Banco bbva = new Banco("BBVA");
        Banco banamex = new Banco("BANAMEX");

        bancos.add(bbva);
        bancos.add(banamex);

        return bancos;
    }

    @Override
    public List<Cliente> CrearClientes() {
        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente("Ilahi", "Chavez",2014,123456789);
        Cliente cliente2 = new Cliente("Maddie", "Chavez",2019,1234567810);
        Cliente cliente3 = new Cliente("Luis", "Chavez",2014,1234567811);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        return clientes;
    }

    @Override
    public List<Cuenta> CrearCuentas() {
        List<Cuenta> cuentas = new ArrayList<>();
        Banco bbva = new Banco("BBVA");
        Cliente cliente1 = new Cliente("Ilahi", "Chavez",2014,123456789);
        Tarjeta tarjeta = new Tarjeta(1000, 1000, 100, "");
        Cuenta cuenta1 = new Cuenta(bbva, cliente1, tarjeta, null);

        cuentas.add(cuenta1);

        return cuentas;
    }

    @Override
    public List<Tarjeta> CrearTarjetas() {
        return null;
    }
}
