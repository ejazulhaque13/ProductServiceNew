package dev.ejaz.productservicenew.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String title;
    private Double price;
    private String description;
    private String image;
    private String category;


}
