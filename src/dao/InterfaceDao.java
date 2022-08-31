package dao;

import business.dto.LoginInt;
import business.dto.ResponseOut;

public interface InterfaceDao {

    ResponseOut generateResponseOut(LoginInt loginInt);
}
