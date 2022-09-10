package business.dto.methodOne;

public class LoginInt {


    private DatosUsuario datosUsuario;

    public DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    @Override
    public String toString() {
        return "LoginInt{" +
                "datosUsuario=" + datosUsuario +
                '}';
    }
}
