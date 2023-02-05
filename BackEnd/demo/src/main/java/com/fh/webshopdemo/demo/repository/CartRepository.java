package com.fh.webshopdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fh.webshopdemo.demo.model.Cart;

@Repository //Annotation für Spring, um anzuzeigen, dass es sich um eine Datenbank-Schicht handelt
public interface CartRepository //Benennung des Interfaces
extends JpaRepository<Cart, Long> { //Erweiterung der JPA-Schnittstelle (Java Persistence API), um Zugriff auf Cart-Objekte in der Datenbank zu ermöglichen
//Klasse benötigt keine zusätzlichen Methoden, da JpaRepository bereits viele CRUD-Methoden bereitstellt (Create, Read, Update, Delete)
}