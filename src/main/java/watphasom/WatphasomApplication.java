package watphasom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import watphasom.product.Product;
import watphasom.repository.ProductRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class WatphasomApplication implements CommandLineRunner{
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(WatphasomApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		productRepository.deleteAll();
		productRepository.save(new Product("productTest","Hello worold",100));
		productRepository.save(new Product("productTest2","Hello worold2",100));
		productRepository.save(new Product("productTest3","Hello worold3",100));
		System.out.println(productRepository.findByNameContaining("2"));

	}
}
