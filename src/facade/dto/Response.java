package facade.dto;

public class Response {

    private String banco;
    private DatosCuenta datosCuenta;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public DatosCuenta getDatosCuenta() {
        return datosCuenta;
    }

    public void setDatosCuenta(DatosCuenta datosCuenta) {
        this.datosCuenta = datosCuenta;
    }

    @Override
    public String toString() {
        return "Response{" +
                "banco='" + banco + '\'' +
                ", datosCuenta=" + datosCuenta +
                '}';
    }
}
