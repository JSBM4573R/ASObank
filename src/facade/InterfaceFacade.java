package facade;

import facade.dto.methodOne.Login;
import facade.dto.methodOne.Response;
import facade.dto.methodTwo.BankResponse;

public interface InterfaceFacade {

    Response generateResponse(Login login);

    BankResponse generateResponseBank(String bank);

}
