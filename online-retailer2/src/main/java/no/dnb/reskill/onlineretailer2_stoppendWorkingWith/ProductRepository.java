package no.dnb.reskill.onlineretailer2_stoppendWorkingWith;

import java.util.Collection;

// Represent logic to save (DB or memory)
public interface ProductRepository {
    //void addProduct(int productId, String productName, double price);
    void addProduct(Product product);
    boolean deleteProduct(int productId);
    //void updateProduct(int productId, String productName, double price);
    void updateProduct(Product product);
    int findProductId(String productName);
    Collection<Product> findAllProducts();
}
