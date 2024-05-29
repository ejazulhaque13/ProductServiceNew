package dev.ejaz.productservicenew.controllers;

import dev.ejaz.productservicenew.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @GetMapping("/products")
    public String getAllProducts() {
        return "getting all products";

    }
    @GetMapping("/products/{productID}")
    public String getSingleProduct(@PathVariable("productID") Long productID){
        return "getting a single product with " + productID;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "adding new product " + productDto;

    }

    @PutMapping("/products/{productID}")
    public String updateProducts(@PathVariable("productID") Long productID){
        return "updating new products";
    }

    @DeleteMapping("/products/{productID}")
    public String deleteProducts(@PathVariable("productID") Long productID){
        return "deleting a new product";

    }
}
