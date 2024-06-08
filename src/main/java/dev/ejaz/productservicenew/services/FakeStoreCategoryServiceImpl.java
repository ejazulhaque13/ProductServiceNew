package dev.ejaz.productservicenew.services;

import org.springframework.stereotype.Service;

@Service
public class FakeStoreCategoryServiceImpl implements CategoryService{
    @Override
    public String getAllCategory() {
        return null;
    }

    @Override
    public String getProductsInCategory(Long categoryID) {
        return null;
    }
}
