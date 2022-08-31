package dao.impl;

import business.dto.LoginInt;
import business.dto.ResponseOut;
import dao.InterfaceDao;
import dao.mapper.impl.ImplementacionDaoMapper;

import java.util.Date;

public class ImplementacionDAO implements InterfaceDao {

    ImplementacionDaoMapper implementacionDaoMapper = new ImplementacionDaoMapper();

    @Override
    public ResponseOut generateResponseOut(LoginInt loginInt) {

        ResponseOut responseOut = implementacionDaoMapper.MapeoSalida(loginInt,modelCuenta(),modelFecha());

        return responseOut;
    }

    public static String modelFecha() {
        Date fechaActual = new Date();
        return  fechaActual.toString();
    }


    public static int modelCuenta() {
        return 9898;
    }

}
