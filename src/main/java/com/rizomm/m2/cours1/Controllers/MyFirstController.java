package com.rizomm.m2.cours1.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyFirstController {
    
    public String MyFirstRoute(){
        return "hello world";
    }

}
