package business.impl;

import business.InterfaceBusiness;
import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;
import dao.impl.ImplementacionDAO;

public class ImplementacionBusiness implements InterfaceBusiness {

    ImplementacionDAO implementacionDAO = new ImplementacionDAO();

    @Override
    public ResponseOut generateResponseOut(LoginInt loginInt) {
        ResponseOut responseOut = implementacionDAO.generateResponseOut(loginInt);
        return responseOut;
    }

    @Override
    public BankResponseOut generateResponseBankOut(BankInsertInt bankInsertInt) {
        BankResponseOut bankResponseOut = implementacionDAO.generateResponseBankOut(bankInsertInt);
        return bankResponseOut;
    }


}
