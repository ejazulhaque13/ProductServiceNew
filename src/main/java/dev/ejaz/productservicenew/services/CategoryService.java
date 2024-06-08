package dev.ejaz.productservicenew.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CategoryService {
    @GetMapping("")
    String getAllCategory();

    @GetMapping("{categoryID}")
    String getProductsInCategory(@PathVariable Long categoryID);
}
