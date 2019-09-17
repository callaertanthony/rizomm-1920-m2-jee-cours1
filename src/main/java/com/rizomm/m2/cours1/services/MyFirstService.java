package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private Integer counter = 0;

    public Integer myFirstFunction()
    {
        return this.counter++;
    }
}
