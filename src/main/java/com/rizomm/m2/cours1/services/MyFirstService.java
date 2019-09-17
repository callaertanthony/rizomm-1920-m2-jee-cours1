package com.rizomm.m2.cours1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    public int counter =  0;


    public int  maFirstFunction(){
        counter++;
        return counter;
    }
}

// Atention au NPE, appel de null sur une méthode
