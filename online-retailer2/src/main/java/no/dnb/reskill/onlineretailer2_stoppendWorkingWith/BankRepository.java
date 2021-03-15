package no.dnb.reskill.onlineretailer2_stoppendWorkingWith;

//@Repository
public interface BankRepository {
        //Startet with void as return type
        void doDeposit(int accountId, double amount);
        void doWithdraw(int accountId, double amount);
    }
