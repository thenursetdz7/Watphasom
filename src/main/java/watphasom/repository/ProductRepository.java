package watphasom.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import watphasom.product.Product;

import java.util.List;

/**
 * Created by TheNurse on 16/5/2559.
 */
public interface ProductRepository extends MongoRepository<Product,String> {
    List<Product> findByNameContaining(String name);
    Product findOne(String id);
}
