package dev.ejaz.productservicenew.dtos;

import dev.ejaz.productservicenew.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetSingleProductResponseDto {
    private Product product;
}
