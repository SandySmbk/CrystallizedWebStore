package com.fh.webshopdemo.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fh.webshopdemo.demo.model.Cart;
import com.fh.webshopdemo.demo.service.CartService;

@RestController  // Kennzeichnet diese Klasse als RESTful API-Controller
@RequestMapping("/carts")  // Legt den Basispfad des API-Endpunkts fest
public class CartController {

    private CartService cartService;  // Feld, um das CartService-Objekt zu speichern

    // Konstruktor zur Initialisierung des CartService-Objekts
    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @ResponseStatus( code = HttpStatus.CREATED)  // Legt den HTTP-Statuscode fest, der für diesen Endpunkt zurückgegeben werden soll
    @PostMapping  // Kennzeichnet diese Methode als POST-API-Endpunkt
    public Cart create(@RequestBody Long[] productIds) {  // Anforderungsdaten sind ein Array aus Longs
        return cartService.save(productIds);  // Gibt das Ergebnis von `save` auf `cartService` mit den Anforderungsdaten zurück
    }
}



