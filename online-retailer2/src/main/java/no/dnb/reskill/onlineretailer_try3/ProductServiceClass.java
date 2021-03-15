package no.dnb.reskill.onlineretailer_try3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.NoSuchElementException;

//We mark beans with @Service to indicate that it's holding the business logic. So there's not any other specialty except using it in the service layer.
@Service("productService")
//@Component
//We can use @Component across the application to mark the beans as Spring's managed components. Simple Bean
// Spring only pick up and registers beans with @Component  and doesn't look for @Service and @Repository in general.
//@Repository’s job is to catch persistence specific exceptions and rethrow them as one of Spring’s unified unchecked exception.

public class ProductServiceClass implements ProductService {
    private final ProductRepository productRepository;


    //The @Autowired annotation allows you to skip configurations elsewhere of what to inject and just does it for you.
    @Autowired
    public ProductServiceClass(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void addToStock(String name, double price ) {
        productRepository.addProduct(new Product(name, price));
        System.out.println("Service: Product added");
    }

    @Override
    public void deleteFromStock(int productId) {
        if (productRepository.deleteProduct(productId)) {
            System.out.println("Service: Product deleted");
        }
        else {
            System.out.println("Service: Product NOT deleted");
        }
    }

    @Override
    public void updateStock(Product product) {
        if (productRepository.updateProduct(product)) {
            System.out.println("Service: Product updated");
        } else {
            System.out.println("Service: Product NOT updated");
        }
    }

    @Override
    public Collection<Product> findAllInStock() {
        return productRepository.findAllProducts();
    }

    @Override
    public Product findProductByName(String productName) {
        for (Product p : productRepository.findAllProducts()) {
            if (p.getName().equalsIgnoreCase(productName)) {
                return p;
            }
        }
        // FROM ANDY: Or maybe just return null, it's not so serious as to throw an exception...
        throw new NoSuchElementException("Product name not found in stock");
    }
}
