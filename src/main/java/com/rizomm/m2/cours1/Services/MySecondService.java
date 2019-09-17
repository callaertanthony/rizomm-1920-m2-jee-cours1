package com.rizomm.m2.cours1.Services;

import org.springframework.beans.factory.annotation.Autowired;

public class MySecondService {

    @Autowired
    MyFirstService myfs;

    public int mySecondFunction(){
        return myfs.myFirstFonction();
    }
}
