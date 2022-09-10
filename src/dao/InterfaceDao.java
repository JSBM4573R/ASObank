package dao;

import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;

public interface InterfaceDao {

    ResponseOut generateResponseOut(LoginInt loginInt);

    BankResponseOut generateResponseBankOut(BankInsertInt bankInsertInt);
}
