package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    public int counter=0;
    public int myFirstFunction(){

        counter=counter+1;
                return counter;
    }


}
