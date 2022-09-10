package facade.dto.methodTwo;

import java.util.List;

public class BankResponse {

    private List<Bank> banco;

    public List<Bank> getBanco() {
        return banco;
    }

    public void setBanco(List<Bank> banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "BankResponse{" +
                "banco=" + banco +
                '}';
    }
}
