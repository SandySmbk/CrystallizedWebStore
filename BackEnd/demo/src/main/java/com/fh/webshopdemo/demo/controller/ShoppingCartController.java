/*package com.fh.webshopdemo.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fh.webshopdemo.demo.model.ShoppingCart;
import com.fh.webshopdemo.demo.service.ShoppingCartService;

@RestController
@RequestMapping("shoppingcarts")
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService){
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping
    public ShoppingCart create(@RequestBody ShoppingCart shoppingCart){
        return shoppingCartService.save(shoppingCart);
    }


}
    
 */
