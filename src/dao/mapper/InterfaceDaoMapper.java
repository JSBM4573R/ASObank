package dao.mapper;

import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;

public interface InterfaceDaoMapper {

    ResponseOut MapeoSalida(LoginInt loginInt, int modelCuenta, String modelFecha);

    BankResponseOut MapeoSalidaBank(BankInsertInt bankInsertInt, int nit, Boolean active);
}
