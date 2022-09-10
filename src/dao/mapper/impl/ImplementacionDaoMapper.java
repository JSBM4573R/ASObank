package dao.mapper.impl;

import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankInt;
import business.dto.methodTwo.BankResponseOut;
import dao.mapper.InterfaceDaoMapper;
import facade.dto.methodOne.DatosCuenta;

import java.util.ArrayList;
import java.util.List;

public class ImplementacionDaoMapper implements InterfaceDaoMapper {


    @Override
    public ResponseOut MapeoSalida(LoginInt loginInt, int modelCuenta, String modelFecha) {
        ResponseOut responseOut = new ResponseOut();

        responseOut.setBanco(loginInt.getDatosUsuario().getBanco());

        DatosCuenta datosCuenta = new DatosCuenta();

        datosCuenta.setNumeroCuenta(modelCuenta);
        datosCuenta.setUsuario(loginInt.getDatosUsuario().getUsuario());
        datosCuenta.setFechaCreacion(modelFecha);
        responseOut.setDatosCuenta(datosCuenta);

        return responseOut;
    }

    @Override
    public BankResponseOut MapeoSalidaBank(BankInsertInt bankInsertInt, int nit, Boolean active) {
        BankResponseOut bankResponseOut = new BankResponseOut();

        List<BankInt> bankIntList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            BankInt bankInt = new BankInt();
            bankInt.setName(bankInsertInt.getBanco());
            bankInt.setNit(nit+i);
            bankInt.setActive(active);
            bankIntList.add(bankInt);
            bankResponseOut.setBank(bankIntList);
        }


        return bankResponseOut;
    }

}
