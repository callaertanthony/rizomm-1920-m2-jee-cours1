package com.rizomm.m2.cours1.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyFirstController {

	public String myFirstRoute() {
		return "Hello World";
	}
	
}
