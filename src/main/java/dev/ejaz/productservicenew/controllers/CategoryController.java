package dev.ejaz.productservicenew.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @GetMapping("/products/categories")

    public String getAllCategory (){
        return "getting all category";

    }
    @GetMapping("/products/categories/{categoryID}")
    public String getProductsInCategory(@PathVariable Long categoryID){
        return "get product in category";

    }
}
