package dev.ejaz.productservicenew.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.PriorityQueue;
@Getter
@Setter
public class Category extends BaseModel{
    private String name;
    private String description;
    private List<Product> products;
}
