package com.rizomm.m2.cours1.controllers;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ServiceUser serviceUser;


    @GetMapping(path="/{id}")

    public User getUser(@PathVariable  Integer id){

        return serviceUser.createUser(id);



    }


    @PostMapping
    public User postUser(){

        return null;



    }

    @DeleteMapping
    public void deleteUser(){

        return;



    }
    @PutMapping
    public User putUser(){

        return null;



    }






}
