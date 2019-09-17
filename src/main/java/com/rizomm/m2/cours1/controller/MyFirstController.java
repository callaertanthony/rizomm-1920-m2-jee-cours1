package com.rizomm.m2.cours1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyFirstController {

    @GetMapping(value = "/")
    public void getMethod() {
    }
}Œ