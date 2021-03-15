package no.dnb.reskill.onlineretailer2;

// Represent business logic
public interface ProductService {
    void addToStock();
    void deleteFromStock();
    void updateStock();
    Product findInStock(int productId);
    Product findInStock(String productName);
}
