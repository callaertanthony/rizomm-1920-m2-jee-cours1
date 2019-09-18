package com.rizomm.m2.cours1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondService {

    @Autowired
    MyFirstService newService;

    public Integer mySecondFunction(){
        return newService.myFirstFunction();
    }
}
