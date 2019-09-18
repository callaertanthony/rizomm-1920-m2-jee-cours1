package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }


    @PostMapping
    public User createUser(@RequestBody User user){
        userService.createUser(user.getId(),user.getFirstname(),user.getLastname(),user.getEmail());
        return user;
    }

    @DeleteMapping
    public void deleteUser(){
    }

}
