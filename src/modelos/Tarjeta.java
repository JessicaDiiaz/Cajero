package modelos;

public class Tarjeta {

    private int Saldo;
    private int Abonos;
    private int Retiros;
    private String Movimientos;

    public Tarjeta(int saldo, int abonos, int retiros, String movimientos) {
        Saldo = saldo;
        Abonos = abonos;
        Retiros = retiros;
        Movimientos = movimientos;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public int getAbonos() {
        return Abonos;
    }

    public void setAbonos(int abonos) {
        Abonos = abonos;
    }

    public int getRetiros() {
        return Retiros;
    }

    public void setRetiros(int retiros) {
        Retiros = retiros;
    }

    public String getMovimientos() {
        return Movimientos;
    }

    public void setMovimientos(String movimientos) {
        Movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "Saldo=" + Saldo +
                ", Abonos=" + Abonos +
                ", Retiros=" + Retiros +
                ", Movimientos='" + Movimientos + '\'' +
                '}';
    }
}
