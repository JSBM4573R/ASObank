package business.dto.methodTwo;

public class BankInsertInt {
    private String banco;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "BankInsertInt{" +
                "banco='" + banco + '\'' +
                '}';
    }
}
