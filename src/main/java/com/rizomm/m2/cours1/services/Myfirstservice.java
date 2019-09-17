package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service

public class Myfirstservice {

    int counter=0;
    public int myfirstfunction(){
        counter++;
        System.out.println(counter);
        return counter;
    }
}
