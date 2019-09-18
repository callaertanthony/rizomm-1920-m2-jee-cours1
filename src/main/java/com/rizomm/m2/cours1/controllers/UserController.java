package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User getUser(Integer id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User createUser() {
        return userService.createUser();
    }

    @PutMapping
    public User updateUser(){
        return userService.updateUser();
    }

    @DeleteMapping
    public User deleteUser(){
        return userService.deleteUser();
    }
}
