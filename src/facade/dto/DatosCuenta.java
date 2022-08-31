package facade.dto;

public class DatosCuenta {

    private String usuario;
    private int numeroCuenta;
    private String fechaCreacion;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "datosCuenta{" +
                "usuario='" + usuario + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }
}
