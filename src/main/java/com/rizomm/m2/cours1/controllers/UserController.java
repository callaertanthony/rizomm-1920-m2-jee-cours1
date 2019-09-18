package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser();
    }

    @PostMapping
    public User createUser(){
        return userService.createUser(1,"rtr","erer","3");
    }

    @DeleteMapping
    public void delete(){

    }

    @PutMapping
    public User updateUser(){
        return null;
    }




}
