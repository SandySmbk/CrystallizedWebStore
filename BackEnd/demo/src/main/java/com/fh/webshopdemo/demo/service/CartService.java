package com.fh.webshopdemo.demo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fh.webshopdemo.demo.model.Cart;
import com.fh.webshopdemo.demo.model.Product;
import com.fh.webshopdemo.demo.repository.CartRepository;
import com.fh.webshopdemo.demo.repository.ProductRepository;

@Service // Service Schicht
public class CartService {

    private CartRepository cartRepository;
    private ProductRepository productRepository;

//Konstruktor
    public CartService(CartRepository cartRepository, ProductRepository productRepository) { 
        this.productRepository = productRepository;
    }

    public Cart save(Long[] productIds) { // Methode zum Speichern eines Warenkorbs
        Set<Product> products = new HashSet<>(); // Set(Set statt Liste) zur Speicherung von Produkten

        for (Long id : productIds) { // Schleife durch die productIds
            var product = productRepository.findById(id); // Suche des jeweiligen Produkts in der Datenbank

            if (product.isEmpty()) { // Wenn das Produkt nicht gefunden wurde
                throw new EntityNotFoundException(); // Werfe EntityNotFoundException
            }
            products.add(product.get()); // Füge das gefundene Produkt zum Set hinzu
        }
        return cartRepository.save(new Cart(products)); // Speichere den Warenkorb (bestehend aus den Produkten im Set)
                                                        // in der Datenbank und gebe ihn zurück
    }
}
