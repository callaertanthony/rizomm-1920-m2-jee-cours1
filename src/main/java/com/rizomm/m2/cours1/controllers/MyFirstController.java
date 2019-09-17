package com.rizomm.m2.cours1.controllers;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;

@Controller
public class MyFirstController {

    public String myFirstRoute() {
        return "Hello world :)";
    }
}