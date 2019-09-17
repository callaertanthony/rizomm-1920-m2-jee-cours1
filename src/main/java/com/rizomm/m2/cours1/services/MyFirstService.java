package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    public Integer counter = 0;

    static public Integer myFirstFunction() {
        return 42;
    }

    public Integer myFunctionAsAService() {
        return 42;
    }

    public Integer myIncrement(){
        return ++counter;
    }
}
