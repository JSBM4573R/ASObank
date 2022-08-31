package business.dto;

public class DatosUsuario {

    private String Usuario;
    private String Contraseña;
    private String banco;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "datosUsuario{" +
                "Usuario='" + Usuario + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                ", banco='" + banco + '\'' +
                '}';
    }
}
