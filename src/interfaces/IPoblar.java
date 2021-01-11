package interfaces;

import modelos.Banco;
import modelos.Cliente;
import modelos.Cuenta;
import modelos.Tarjeta;

import java.util.List;

public interface IPoblar {
    List<Banco> CrearBancos();
    List<Cliente> CrearClientes();
    List<Cuenta> CrearCuentas();
    List<Tarjeta> CrearTarjetas();}