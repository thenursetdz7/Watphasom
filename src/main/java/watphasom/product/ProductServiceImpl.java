package watphasom.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TheNurse on 16/5/2559.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @Override
    public Product getProduct(String id) {
        return productDao.getProduct(id);
    }

    @Override
    public Product create(Product product) {
        return productDao.create(product);
    }

    @Override
    public Product update(String id,Product product) {
        return productDao.update(product);
    }

    @Override
    public Product delete(String id) {
        Product p = productDao.getProduct(id);
        return productDao.delete(p);
    }
}
