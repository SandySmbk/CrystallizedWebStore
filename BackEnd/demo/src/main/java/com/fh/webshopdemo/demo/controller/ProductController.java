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

@RestController // Declares a RESTful controller class
@RequestMapping("/products") // All requests to "/products" will be forwarded to this controller
public class ProductController {

    // A private field for the ProductService
    private final ProductService productService;

    // Constructor that injects the ProductService
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Handles HTTP GET requests to "/products" and returns a list of all products
    @GetMapping
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    // Handles HTTP GET requests to "/products/{type}" and returns a list of products that match a specific type
    @GetMapping("/{type}")
    public List<Product> findAllProductsByType(@PathVariable String type) {
        return productService.findByType(type);
    }

    // Handles HTTP POST requests to "/products" and creates a new product
    @PostMapping 
    public Product createProduct(@RequestBody ProductDTO productDto){
        // Converts a ProductDTO object to a Product object
        Product product = mapProductDTOToProduct(productDto); 
        // Calls the ProductService to create the product
        return productService.createProduct(product);
    }

    // A helper method for converting a ProductDTO object to a Product object
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

