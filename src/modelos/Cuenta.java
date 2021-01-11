package modelos;

public class Cuenta {
    private Banco banco;
    private Cliente cliente;
    private Tarjeta tarjeta;
    private String TipoCuenta;

    public Cuenta(Banco banco, Cliente cliente, Tarjeta tarjeta, String tipoCuenta) {
        this.banco = banco;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        TipoCuenta = tipoCuenta;
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

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        TipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "banco=" + banco +
                ", cliente=" + cliente +
                ", tarjeta=" + tarjeta +
                ", TipoCuenta='" + TipoCuenta + '\'' +
                '}';
    }
}

