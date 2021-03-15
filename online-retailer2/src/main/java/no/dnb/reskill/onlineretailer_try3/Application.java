package no.dnb.reskill.onlineretailer_try3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(Application.class, args);
        ProductService productService = ctx.getBean(ProductService.class);

        productService.addToStock("Shoes", 1249.00);
        productService.addToStock("Glasses", 399.00);
        productService.addToStock("Pants", 789.00);

        productService.deleteFromStock(productService.findProductByName("Pants").getId());

        for (Product p : productService.findAllInStock()) {
            System.out.println(p.toString());
        }

    }
}
