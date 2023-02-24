package com.fh.webshopdemo.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fh.webshopdemo.demo.model.Product;

// um den Zugriff auf Daten zu verwalten, die in einer Datenbank oder einem anderen Datenspeicher gespeichert sind.

public interface ProductRepository extends JpaRepository<Product, Long>{ ///Erweiterung der JPA-Schnittstelle, um Zugriff auf Product-Objekte in der Datenbank zu ermöglichen

    List<Product> searchByName(String name);

}
