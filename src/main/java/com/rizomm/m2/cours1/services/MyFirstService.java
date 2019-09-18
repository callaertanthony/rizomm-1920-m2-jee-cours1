package com.rizomm.m2.cours1.services;


import org.springframework.beans.factory.annotation.Autowired;
//herite de  @Component

// Atention au NPE, appel de null sur une méthode
public interface MyFirstService {

  String helloWorld();

}
