package facade.mapper.impl;

import business.dto.methodOne.DatosUsuario;
import business.dto.methodOne.LoginInt;
import business.dto.methodOne.ResponseOut;
import business.dto.methodTwo.BankInsertInt;
import business.dto.methodTwo.BankResponseOut;
import facade.dto.methodOne.DatosCuenta;
import facade.dto.methodOne.Login;
import facade.dto.methodOne.Response;
import facade.dto.methodTwo.Bank;
import facade.dto.methodTwo.BankResponse;
import facade.mapper.InterfaceFacadeMapper;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public BankInsertInt MapeoEntradaBank(String bank) {
        BankInsertInt bankInsertInt = new BankInsertInt();
        bankInsertInt.setBanco(bank);
        return bankInsertInt;
    }

    @Override
    public BankResponse MapeoSalidaBank(BankResponseOut bankResponseOut) {
        BankResponse bankResponse = new BankResponse();

        List<Bank> bankListFacade = new ArrayList<>();
        for (int i = 0; i < bankResponseOut.getBank().size(); i++) {
            Bank bank = new Bank();
            bank.setActivo(bankResponseOut.getBank().get(i).getActive());
            bank.setNit(bankResponseOut.getBank().get(i).getNit());
            bank.setNombre(bankResponseOut.getBank().get(i).getName());
            bankListFacade.add(bank);
            bankResponse.setBanco(bankListFacade);
        }

        return bankResponse;
    }




}
