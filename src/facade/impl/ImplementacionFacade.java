package facade.impl;

import business.dto.LoginInt;
import business.dto.ResponseOut;
import business.impl.ImplementacionBusiness;
import facade.InterfaceFacade;
import facade.dto.Login;
import facade.dto.Response;
import facade.mapper.impl.ImplementacionFacadeMapper;

public class ImplementacionFacade implements InterfaceFacade {

    ImplementacionFacadeMapper implementacionFacadeMapper = new ImplementacionFacadeMapper();

    ImplementacionBusiness implementacionBusiness = new ImplementacionBusiness();

    @Override
    public Response generateResponse(Login login) {

        LoginInt loginInt = implementacionFacadeMapper.MapeoEntrada(login);

        ResponseOut responseOut = implementacionBusiness.generateResponseOut(loginInt);

        Response response = implementacionFacadeMapper.MapeoSalida(responseOut);

        return response;
    }
}
