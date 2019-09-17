package com.rizomm.m2.cours1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class MyFirstController {
    //@GetMapping
    public String myFirstController(){
        return "hello world !";
    }
}
