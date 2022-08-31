package facade.mapper.impl;

import business.dto.DatosUsuario;
import business.dto.LoginInt;
import business.dto.ResponseOut;
import facade.dto.DatosCuenta;
import facade.dto.Login;
import facade.dto.Response;
import facade.mapper.InterfaceFacadeMapper;

public class ImplementacionFacadeMapper implements InterfaceFacadeMapper {


    @Override
    public LoginInt MapeoEntrada(Login login) {
        LoginInt loginInt = new LoginInt();

        DatosUsuario datosUsuario = new DatosUsuario();
        datosUsuario.setUsuario(login.getUsuario());
        datosUsuario.setContraseña(login.getContraseña());
        datosUsuario.setBanco("BBVA");
        loginInt.setDatosUsuario(datosUsuario);

        return loginInt;
    }

    @Override
    public Response MapeoSalida(ResponseOut responseOut) {

        Response response = new Response();

        response.setBanco(responseOut.getBanco());

        DatosCuenta datosCuenta = new DatosCuenta();

        datosCuenta.setNumeroCuenta(responseOut.getDatosCuenta().getNumeroCuenta());
        datosCuenta.setUsuario(responseOut.getDatosCuenta().getUsuario());
        datosCuenta.setFechaCreacion(responseOut.getDatosCuenta().getFechaCreacion());
        response.setDatosCuenta(datosCuenta);

        return response;
    }
}
