package no.dnb.reskill.onlineretailer_try3;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.management.ConstructorParameters;

@Getter
public class Product {
    private static int nextId = 0;
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = ++nextId;
        this.name = name;
        this.price = price;
    }
}
