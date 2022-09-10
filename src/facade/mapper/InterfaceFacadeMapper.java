package facade.mapper;

import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;
import facade.dto.methodOne.Login;
import facade.dto.methodOne.Response;
import facade.dto.methodTwo.BankResponse;

public interface InterfaceFacadeMapper {

    LoginInt MapeoEntrada(Login login);

    Response MapeoSalida(ResponseOut responseOut);

    BankInsertInt MapeoEntradaBank(String bank);

    BankResponse MapeoSalidaBank(BankResponseOut bankResponseOut);


}
