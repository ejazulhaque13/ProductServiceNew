package dev.ejaz.productservicenew.controllers;

import dev.ejaz.productservicenew.dtos.GetSingleProductResponseDto;
import dev.ejaz.productservicenew.dtos.ProductDto;
import dev.ejaz.productservicenew.models.Product;
import dev.ejaz.productservicenew.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;

    }
    @GetMapping()
    public String getAllProducts() {
        return "getting all products";

    }
    @GetMapping("/{productID}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productID") Long productID){
//        GetSingleProductResponseDto responseDto = new GetSingleProductResponseDto();
//        responseDto.setProduct(productService.getSingleProduct(productID));
        ResponseEntity<Product> response = new ResponseEntity<>(
                productService.getSingleProduct(productID), HttpStatus.NOT_FOUND
        );
      //  return productService.getSingleProduct(productID);
        return response;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "adding new product " + productDto;

    }

    @PutMapping("/{productID}")
    public String updateProducts(@PathVariable("productID") Long productID, ProductDto newProduct){
        return "updating new products";
    }

    @DeleteMapping("/{productID}")
    public String deleteProducts(@PathVariable("productID") Long productID){
        return "deleting a new product";

    }
}
