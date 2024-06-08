package dev.ejaz.productservicenew.services;

import dev.ejaz.productservicenew.dtos.ProductDto;
import dev.ejaz.productservicenew.models.Category;
import dev.ejaz.productservicenew.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();


    Product getSingleProduct(@PathVariable("productID") Long productID);


    Product addNewProduct(String title, double price, String description, String category, String imageUrl);


    String updateProducts(@PathVariable("productID") Long productID, Product product);


    boolean deleteProducts(@PathVariable("productID") Long productID);
}
