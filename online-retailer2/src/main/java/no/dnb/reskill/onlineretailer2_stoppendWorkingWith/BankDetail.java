package no.dnb.reskill.onlineretailer2_stoppendWorkingWith;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Component
public class BankDetail{
    private Map<Integer, BankDetail> bankDetails = new HashMap<>();
    private int accountId;
    private String name;
    private int amount;

    //Could not autowire. Not beans of 'int' type found
    public BankDetail(int accountId, String name, int amount) {
        this.accountId = accountId;
        this.name = name;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addBankDetail(int acountId, String name, int amount) {
        bankDetails.put(acountId, new BankDetail(acountId, name, amount));
    }

    public boolean doDeposit(int accountId, double amount) {
        return true;
    }

    public boolean doWithdraw(int accountId, double amount) {
        return true;
    }

    @Override
    public String toString() {
        return "BankDetail{" +
                "accountNumber=" + accountId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
