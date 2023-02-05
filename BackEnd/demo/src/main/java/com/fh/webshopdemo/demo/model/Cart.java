package com.fh.webshopdemo.demo.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity (name= "cart")  // Annotation, um diese Klasse als JPA-Entität mit einem angegebenen Tabellennamen zu kennzeichnen
public class Cart {

@Id  // Annotation, um das Primärschlüsselfeld anzugeben
@GeneratedValue  // Annotation, um anzugeben, dass der Wert dieses Feldes automatisch generiert werden soll
@Column (name = "id")  // Annotation, um den Namen der Spalte in der Tabelle anzugeben
private Long id;

 @ManyToMany  // Annotation, um eine Viele-zu-Viele-Beziehung anzugeben
 @JoinTable (name = "product")  // Annotation, um den Namen der Verbindungstabelle für die Beziehung anzugeben
 
private Set<Product> product;            //Set statt Liste bei many to many Beziehung

public Cart(Set<Product> products) {
}

//Getter und Setter
public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public Set<Product> getProduct() {
    return product;
}

public void setProduct(Set<Product> product) {
    this.product = product;
}

}
    

