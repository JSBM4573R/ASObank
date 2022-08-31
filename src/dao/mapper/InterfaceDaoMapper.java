package dao.mapper;

import business.dto.LoginInt;
import business.dto.ResponseOut;

public interface InterfaceDaoMapper {

    ResponseOut MapeoSalida(LoginInt loginInt, int modelCuenta, String modelFecha);
}
