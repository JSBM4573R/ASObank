package dao.impl;

import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;
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

    @Override
    public BankResponseOut generateResponseBankOut(BankInsertInt bankInsertInt) {
        BankResponseOut bankResponseOut = implementacionDaoMapper.MapeoSalidaBank(bankInsertInt,modelInt(),modelActive());
        return bankResponseOut;
    }


    public static String modelFecha() {
        Date fechaActual = new Date();
        return  fechaActual.toString();
    }


    public static int modelCuenta() {
        return 9898;
    }

    public static int modelInt() {
        return 1234;
    }

    public static Boolean modelActive() {
        return true;
    }

}
