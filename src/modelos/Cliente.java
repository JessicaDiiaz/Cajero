package modelos;

public class Cliente {
    private String Nombre;
    private String Apellido;
    private int INE;
    private int NoCuenta;

    public Cliente(String nombre, String apellido, int INE, int noCuenta) {
        Nombre = nombre;
        Apellido = apellido;
        this.INE = INE;
        NoCuenta = noCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getINE() {
        return INE;
    }

    public void setINE(int INE) {
        this.INE = INE;
    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        NoCuenta = noCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", INE=" + INE +
                ", NoCuenta=" + NoCuenta +
                '}';
    }
}