package com.rizomm.m2.cours1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
	
	@Autowired
	MySecondService ms;
	
	private int counter=0;
	
	public int myFirstFunction() {
		counter++;
		return counter;
	}
	
	public int function() {
		return ms.myFunction();
	}

}
