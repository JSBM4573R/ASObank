package facade.dto.methodTwo;

public class Bank {

    private String nombre;
    private int nit;
    private Boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", activo=" + activo +
                '}';
    }
}


