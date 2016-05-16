package watphasom.product;

import java.util.List;

/**
 * Created by TheNurse on 16/5/2559.
 */
public interface ProductDao {
    List<Product> getProducts();
    Product getProduct(String id);
    Product create(Product product);
    Product update(Product product);
    Product delete(Product product);
}
