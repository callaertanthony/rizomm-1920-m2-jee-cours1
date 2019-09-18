package com.rizomm.m2.cours1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping("/hello")
    public String myFirstRoute(){
        return "Hello World";
    }

}
