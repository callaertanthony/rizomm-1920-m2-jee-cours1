package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.NotNull;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public User getUser() {
        return userService.getUser();
    }

    @GetMapping("/{id}")
    public User getSpecificUser(@PathVariable Integer id) {
        if (userService.getUser(id) != null){
            return userService.getUser(id);
        } else {
            // J'aimerais retourner une 404
            return null;
        }
    }

    @PostMapping(consumes = "application/json")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getId(), user.getFirstName(), user.getLastName(), user.getMail());
    }
}
