package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    int counter = 0;

    public Integer myFirstFunction() {
        counter++;
        return counter;
    }
}
