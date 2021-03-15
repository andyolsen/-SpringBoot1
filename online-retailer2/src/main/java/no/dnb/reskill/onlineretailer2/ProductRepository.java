package no.dnb.reskill.onlineretailer2;

// Represent logic to save (DB or
public interface ProductRepository {
    void addProduct(int productId, String productName, double price);
    boolean deleteProduct(int productId);
    void updateProduct(int productId, String productName, double price);
    int findProductId(String productName);
}
