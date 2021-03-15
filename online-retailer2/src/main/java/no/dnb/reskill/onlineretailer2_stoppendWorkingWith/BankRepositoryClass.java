package no.dnb.reskill.onlineretailer2_stoppendWorkingWith;

import org.springframework.beans.factory.annotation.Autowired;

//@Service("BankRepositoryClass")
//@Qualifier("BankRepositoryClass")
public class BankRepositoryClass implements  BankRepository{
    @Autowired
    BankRepository bankRepository;
    BankDetail bankDetail;

    public void doDeposit(int accountId, double amount) {
        String message = String.format("Trying to deposit %.2f into account %d ....", amount, accountId);
        System.out.println(message);
        if(bankDetail.doDeposit(accountId, amount)) System.out.println("Success");
        else System.out.println("Failed");
    }
    
    public void doWithdraw(int accountId, double amount) {
        String message = String.format("Trying to withdraw %.2f from account %d ....", amount, accountId);
        System.out.println(message);
        if(bankDetail.doWithdraw(accountId, amount)) System.out.println("Success");
        else System.out.println("Failed");
    }
}
