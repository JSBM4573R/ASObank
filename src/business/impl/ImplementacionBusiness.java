package business.impl;

import business.InterfaceBusiness;
import business.dto.LoginInt;
import business.dto.ResponseOut;
import dao.impl.ImplementacionDAO;

public class ImplementacionBusiness implements InterfaceBusiness {

    ImplementacionDAO implementacionDAO = new ImplementacionDAO();

    @Override
    public ResponseOut generateResponseOut(LoginInt loginInt) {
        ResponseOut responseOut = implementacionDAO.generateResponseOut(loginInt);
        return responseOut;
    }
}
