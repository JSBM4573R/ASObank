package business;

import business.dto.LoginInt;
import business.dto.ResponseOut;

public interface InterfaceBusiness {

    ResponseOut generateResponseOut(LoginInt loginInt);
}
