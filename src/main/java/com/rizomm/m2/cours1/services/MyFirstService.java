package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    public int counter = 0;

    public int MyFirstFunction() {
        this.counter++;
        return this.counter;
    }
}
