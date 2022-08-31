package facade.mapper;

import business.dto.LoginInt;
import business.dto.ResponseOut;
import facade.dto.Login;
import facade.dto.Response;

public interface InterfaceFacadeMapper {

    LoginInt MapeoEntrada(Login login);

    Response MapeoSalida(ResponseOut responseOut);

}
