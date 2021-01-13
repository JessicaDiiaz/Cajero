package modelos;

import modelos.enums.TipoCuenta;

public class Cuenta {
    private Banco banco;
    private Cliente cliente;
    private Tarjeta tarjeta;
    private TipoCuenta tipoCuenta;

    public Cuenta(Banco banco, Cliente cliente, Tarjeta tarjeta, TipoCuenta tipoCuenta) {
        this.banco = banco;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.tipoCuenta = tipoCuenta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "banco=" + banco +
                ", cliente=" + cliente +
                ", tarjeta=" + tarjeta +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }
}

