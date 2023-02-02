package com.fh.webshopdemo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fh.webshopdemo.demo.model.User;
import com.fh.webshopdemo.demo.repository.UserRepository;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUsersById(long id) {
        return userRepository.findById(id);
    }

    public List<User> findByType(String type) {
        return userRepository.findByType(type);
    }

    public User save(User user) {
        return userRepository.save(user);
    } 
}