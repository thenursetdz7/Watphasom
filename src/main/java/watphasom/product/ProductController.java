package watphasom.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TheNurse on 16/5/2559.
 */
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping(value = "/product",method = RequestMethod.GET)
    public List<Product> list(){
        return productService.getProducts();
    }

    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    public Product getProduct(@PathVariable("id")String id){return productService.getProduct(id);}

    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public @ResponseBody Product create(@RequestBody Product product,BindingResult bindingResult){
        return productService.create(product);}

    @RequestMapping(value = "/product/{id}",method = RequestMethod.PUT)
    public @ResponseBody Product update(@PathVariable("id")String id,@RequestBody Product product,BindingResult bindingResult){
        return productService.update(id,product);
    }

    @RequestMapping(value = "/product/{id}",method = RequestMethod.DELETE)
    public Product delete(@PathVariable("id")String id) {
        return productService.delete(id);
    }
}
