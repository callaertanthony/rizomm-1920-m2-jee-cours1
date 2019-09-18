package com.rizomm.m2.cours1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondService {

    @Autowired
    MyFirstService service;

    public int counter;

    public int MyFirstFunction() {
        counter = service.MyFirstFunction();
        return counter;
    }
}
