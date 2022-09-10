package facade.impl;

import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;
import business.impl.ImplementacionBusiness;
import facade.InterfaceFacade;
import facade.dto.methodOne.Login;
import facade.dto.methodOne.Response;
import facade.dto.methodTwo.BankResponse;
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

    @Override
    public BankResponse generateResponseBank(String bank) {

        BankInsertInt bankInsertInt = implementacionFacadeMapper.MapeoEntradaBank(bank);
        BankResponseOut bankResponseOut = implementacionBusiness.generateResponseBankOut(bankInsertInt);
        BankResponse bankResponse = implementacionFacadeMapper.MapeoSalidaBank(bankResponseOut);

        return bankResponse;
    }
}
