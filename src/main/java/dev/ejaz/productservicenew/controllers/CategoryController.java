package dev.ejaz.productservicenew.controllers;

import dev.ejaz.productservicenew.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService=categoryService;

    }

    @GetMapping("")
    public String getAllCategory (){
        return "Getting all category";

    }
    @GetMapping("{categoryID}")
    public String getProductsInCategory(@PathVariable Long categoryID){
        return "Get product in category";

    }

}
