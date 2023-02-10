package com.fh.webshopdemo.demo.controller;
import java.util.List;

import com.fh.webshopdemo.demo.dtos.ProductDTO;
import com.fh.webshopdemo.demo.model.Product;
import com.fh.webshopdemo.demo.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{type}")
    public List<Product> findAllProductsByType(@PathVariable String type) {
        return productService.findByType(type);
    }
    @PostMapping 
    public Product createProduct(@RequestBody ProductDTO productDto){
    Product product = mapProductDTOToProduct(productDto); 
    return productService.createProduct(product);
}

private Product mapProductDTOToProduct(ProductDTO productDto){
    Product product = new Product();
    product.setName(productDto.getName());
    product.setDescription(productDto.getDescription());
    product.setImageUrl(productDto.getImageUrl());
    product.setPrice(productDto.getPrice());
    product.setQuantity(productDto.getQuantity());
    product.setType(productDto.getType());
    return product;
}

}
