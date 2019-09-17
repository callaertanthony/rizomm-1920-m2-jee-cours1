package com.rizomm.m2.cours1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    public String myFirstRoute() {
        return "Hello World";
    }
}
