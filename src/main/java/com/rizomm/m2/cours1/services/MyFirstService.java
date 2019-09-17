package com.rizomm.m2.cours1.services;


import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

int ct=0;

public int myFirstfunction(){

    ++ct;
    System.out.print(ct);


return ct;








}


}
