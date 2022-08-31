import facade.dto.Login;
import facade.dto.Response;
import facade.impl.ImplementacionFacade;

public class main {

    public static void main(String[] args) {

        ImplementacionFacade implementacionFacade = new ImplementacionFacade();
        Response response = implementacionFacade.generateResponse(generateLogin());
        System.out.println(response);
    }

    public static Login generateLogin() {
        Login login = new Login();
        login.setUsuario("Juan Sebastian2");
        login.setContraseña("0000");
        return login;
    }
}
