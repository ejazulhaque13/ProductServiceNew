package dev.ejaz.productservicenew.services;

import dev.ejaz.productservicenew.dtos.ProductDto;
import dev.ejaz.productservicenew.models.Category;
import dev.ejaz.productservicenew.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService {
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder=restTemplateBuilder;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(Long productID) {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
       ResponseEntity<ProductDto> response = restTemplate.getForEntity
               ("https://fakestoreapi.com/products/{id}",ProductDto.class,productID);

       ProductDto productDto = response.getBody();

       Product product = new Product();
       product.setId(productDto.getId());
       product.setTitle(productDto.getTitle());
       product.setDescription(productDto.getDescription());
       product.setImageUrl(productDto.getImage());
       product.setPrice(productDto.getPrice());

        Category category= new Category();
        category.setName(productDto.getCategory());

        product.setCategory(category);
        return product;
    }

    @Override
    public Product addNewProduct(String title, double price, String description, String category, String imageUrl) {
        return null;
    }

    public Product addNewProduct(@RequestBody Product product){
            RestTemplate restTemplate = new RestTemplateBuilder().build();

            ResponseEntity<ProductDto> response = restTemplate.postForEntity
                    ("https://fakestoreapi.com/products",product ,ProductDto.class);
            ProductDto productDto = response.getBody();

            Product product1= new Product();
            product.setId(productDto.getId());
            product.setTitle(productDto.getTitle());
            product.setDescription(productDto.getDescription());
            product.setImageUrl(productDto.getImage());
            product.setPrice(productDto.getPrice());

            Category category= new Category();
            category.setName(productDto.getCategory());

            product.setCategory(category);

            return product1;
    }

    @Override
    public String updateProducts(Long productID, Product product) {
        return null;
    }

    @Override
    public boolean deleteProducts(Long productID) {
        return false;
    }
}
