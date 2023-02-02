package com.fh.webshopdemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fh.webshopdemo.demo.model.User;
import com.fh.webshopdemo.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private final UserService userService;

    public UserController(UserService userService){  //konstruktor
        this.userService = userService;
    }
// @GetMapping-Annotation für alle GET-Requests auf diesem Pfad
    @GetMapping
    public List<User> getAllUsers(){    // Ruft die Liste aller Users vom ProductService auf
        return userService.getAllUsers();
    }

    
}
    
