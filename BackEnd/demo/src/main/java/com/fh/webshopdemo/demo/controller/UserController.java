package com.fh.webshopdemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fh.webshopdemo.demo.dtos.UserDTO;
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
    @PostMapping 
public User createUser(@RequestBody UserDTO userDto){
    User user = mapUserDTOToUser(userDto); 
    return userService.createUser(user);
}

private User mapUserDTOToUser(UserDTO userDto){
    User user = new User();
    user.setFirst_name(userDto.getFirst_name());
    user.setLast_name(userDto.getLast_name());
    user.setEmail(userDto.getEmail());
    user.setPassword(userDto.getPassword());
    user.setStreet_adress(userDto.getStreet_adress());
    user.setStreet_number(userDto.getStreet_number());
    user.setCity(userDto.getCity());
    user.setPostal_code(userDto.getPostal_code());
    user.setCountry(userDto.getCountry());
    return user;
}

    
}
    
