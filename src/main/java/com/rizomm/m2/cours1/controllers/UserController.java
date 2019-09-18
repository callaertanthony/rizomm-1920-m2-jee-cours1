package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id)
    {
        User user = userService.getUser(id);

        if (user != null) {
            return ResponseEntity.ok().body(user);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public User createUser()
    {
        return userService.getUser(null);
    }

    @DeleteMapping
    public void deleteUser()
    {
        return;
    }

    @PutMapping
    public User updateUser()
    {
        return null;
    }
}
