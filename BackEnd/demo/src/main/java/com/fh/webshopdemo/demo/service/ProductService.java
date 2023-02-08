package com.fh.webshopdemo.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fh.webshopdemo.demo.model.Product;
import com.fh.webshopdemo.demo.repository.ProductRepository;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByType(String type) {
        return productRepository.findByType(type);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
    @PostMapping
    public Product createProduct (@RequestBody Product product) {
        return productRepository.save(product);
    }

}
