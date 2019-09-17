package com.rizomm.m2.cours1.Services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    int cont = 0;
    public int myFirstFonction(){
        cont = cont++;
        return cont;
    }
}
