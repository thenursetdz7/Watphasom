package watphasom.product;

import java.util.List;

/**
 * Created by TheNurse on 16/5/2559.
 */
public interface ProductService {
    List<Product> getProducts();
    Product getProduct(String id);
    Product create(Product product);
    Product update(String id,Product product);
    Product delete(String id,Product product);
}
