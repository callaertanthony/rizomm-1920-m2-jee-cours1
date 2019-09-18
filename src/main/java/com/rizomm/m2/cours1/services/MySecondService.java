package com.rizomm.m2.cours1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondService {

    @Autowired
    private MyFirstService service;

    public int mySecondefunction(){
        return service.myFirstFunction();

    }
}
