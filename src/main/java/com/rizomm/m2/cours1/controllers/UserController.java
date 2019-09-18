package com.rizomm.m2.cours1.controllers;


import com.rizomm.m2.cours1.entity.User;
import com.rizomm.m2.cours1.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ServiceUser serviceUser;

    @GetMapping (path = "/{id}")
    public User getUser(@PathVariable Integer id){
        return serviceUser.getUser(id);
    }

    @DeleteMapping
    public void deleteUser(){
    }

    @PutMapping
    public User updateUser(){
        return null;
    }
}




