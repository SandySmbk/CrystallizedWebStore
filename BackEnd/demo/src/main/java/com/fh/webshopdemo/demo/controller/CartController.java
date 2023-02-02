package com.fh.webshopdemo.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fh.webshopdemo.demo.model.Cart;

@RestController
@RequestMapping("/carts")

public class CartController {

    @ResponseStatus( code = HttpStatus.CREATED)
    @PostMapping

    public Cart create (Long[] productsIDs){


}
}



