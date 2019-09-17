package com.rizomm.m2.cours1.services;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    public static Integer counter = 0;

    public Integer myFirstFunction() {
        return counter++;
    }

    public void test2() {
        counter++;
    }

}