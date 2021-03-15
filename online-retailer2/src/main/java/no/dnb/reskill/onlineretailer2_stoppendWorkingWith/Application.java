package no.dnb.reskill.onlineretailer2_stoppendWorkingWith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(Application.class, args);

        BankRepository bankRepository = ctx.getBean(BankRepository.class);
        BankService bankService = ctx.getBean(BankService.class);
        ProductRepository productRepository = ctx.getBean(ProductRepository.class);
        ProductService productService = ctx.getBean(ProductService.class);

        //BankDetail.addBankDetail(1, "Ola Nordmann", 0);

        bankRepository.doDeposit(1, 50);
        bankRepository.doWithdraw(1, 40);
    }

}
