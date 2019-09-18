package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping(path = "/{id}")
  public User getUser(@PathVariable Integer id) {
    return userService.getUser(id);
  }

  @PostMapping
  public User createUser() {
    return null;
  }

  @DeleteMapping
  public void deleteUser() {
  }

  @PutMapping
  public User updateUser() {
    return null;
  }

}
