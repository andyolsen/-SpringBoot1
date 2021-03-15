package no.dnb.reskill.onlineretailer_try3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryClass implements ProductRepository {
    private Map<Integer, Product> productMap = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        if (productMap.containsKey(product.getId())) {
            //productMap.replace(product.getId(), product);
            System.out.println("Repository: Already exists");
        } else {
            productMap.put(product.getId(), product);
            System.out.printf("Repository: %i Added", product.getId());
        }
    }

    @Override
    public boolean deleteProduct(int productId) {
        if (productMap.remove(productId) != null) {
            System.out.printf("Repository: %i is deleted", productId);
            return true;
        } else {
            System.out.println("Didn't exist");
            return false;
        }
    }

    @Override
    public boolean updateProduct(Product product) {
        if (productMap.replace(product.getId(), product) != null) {
            System.out.printf("Repository: Product %i updated", product.getId());
            return true;
        } else {
            System.out.println("Repository: Not found");
            return false;
        }
    }

    @Override
    public Collection<Product> findAllProducts() {
        return productMap.values();
    }
}
