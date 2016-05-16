package watphasom.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import watphasom.repository.ProductRepository;

import java.util.List;

/**
 * Created by TheNurse on 16/5/2559.
 */
@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product delete(Product product) {
        product.setId(null);
        productRepository.delete(product);
        return product;
    }
}
