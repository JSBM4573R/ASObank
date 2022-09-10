import facade.dto.methodOne.Login;
import facade.dto.methodOne.Response;
import facade.dto.methodTwo.BankResponse;
import facade.impl.ImplementacionFacade;

public class main {

    public static void main(String[] args) {

        ImplementacionFacade implementacionFacade = new ImplementacionFacade();
        
        Response response = implementacionFacade.generateResponse(generateLogin());
        System.out.println(response);

        BankResponse bankResponse = implementacionFacade.generateResponseBank(generateString());
        System.out.println(bankResponse);
    }

    public static Login generateLogin() {
        Login login = new Login();
        login.setUsuario("Juan Sebastian");
        login.setContraseña("0000");
        return login;
    }

    public static String generateString() {
        return "BBVA";
    }
}
