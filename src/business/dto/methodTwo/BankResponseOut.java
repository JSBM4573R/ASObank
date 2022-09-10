package business.dto.methodTwo;

import facade.dto.methodTwo.Bank;

import java.util.List;

public class BankResponseOut {


   private List<BankInt> bank;

    public List<BankInt> getBank() {
        return bank;
    }

    public void setBank(List<BankInt> bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "BankResponseOut{" +
                "bank=" + bank +
                '}';
    }
}
