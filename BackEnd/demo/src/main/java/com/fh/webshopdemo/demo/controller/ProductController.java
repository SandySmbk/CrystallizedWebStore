package com.fh.webshopdemo.demo.controller;

import java.util.List;

import com.fh.webshopdemo.demo.model.Product;
import com.fh.webshopdemo.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService){  //konstruktor
        this.productService = productService;
    }
// @GetMapping-Annotation für alle GET-Requests auf diesem Pfad
    @GetMapping
    public List<Product> getAllProducts(){    // Ruft die Liste aller Produkte vom ProductService auf
        return productService.getAllProducts();
    }

    
}
