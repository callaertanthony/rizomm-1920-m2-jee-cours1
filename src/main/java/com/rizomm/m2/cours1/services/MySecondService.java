package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.services.impl.MyFirstServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondService {

    @Autowired
    MyFirstServiceImpl unService;

    public String mySecondFunction(){
       return unService.helloWorld();
    }

}
