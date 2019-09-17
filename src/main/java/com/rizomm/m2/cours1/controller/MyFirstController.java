package com.rizomm.m2.cours1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyFirstController {

    @GetMapping
    public String myFirstRoute()
    {
        return "Hello world";
    }
}
