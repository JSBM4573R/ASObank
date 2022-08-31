package dao.mapper.impl;

import business.dto.LoginInt;
import business.dto.ResponseOut;
import dao.mapper.InterfaceDaoMapper;
import facade.dto.DatosCuenta;
import facade.dto.Response;

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
}
