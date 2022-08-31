package facade;

import facade.dto.Login;
import facade.dto.Response;

public interface InterfaceFacade {

    Response generateResponse(Login login);

}
