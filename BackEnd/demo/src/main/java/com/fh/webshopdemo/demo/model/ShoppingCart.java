/*package com.fh.webshopdemo.demo.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name="shoppingCart")
public class ShoppingCart {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @ManyToOne //Beziehung zwischen der Shoppingcart-Klasse und anderen Klassen beschreiben,viele-zu-eins Beziehung zwischen der Shoppingcart-Klasse und der User-Klasse, d.h. jeder Warenkorb gehört zu genau einem Benutzer
    @JsonBackReference // verhindert, dass die Positionen in einer unendlichen Rekursion zurückgegeben werden, wenn sie als JSON serialisiert werden
    @JoinColumn(name = "user_id", nullable = true) //Spalte die verwendet wird
    private User user;

    @OneToMany(mappedBy = "shoppingCart") //eins-zu-viele Beziehung zwischen der Cart-Klasse und der Product-Klasse, d.h. jeder Warenkorb kann mehrere Products haben
    private Set<Product> products; //beschreibt Beziehung zu anderen Klassen
//constructor


//getter und setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
    */
