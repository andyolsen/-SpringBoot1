package no.dnb.reskill.onlineretailer_try3;

import java.util.Collection;

// Represent logic to save (DB or memory)
public interface ProductRepository {
    void addProduct(Product product);
    boolean deleteProduct(int productId);
    boolean updateProduct(Product product);
    Collection<Product> findAllProducts();
}
