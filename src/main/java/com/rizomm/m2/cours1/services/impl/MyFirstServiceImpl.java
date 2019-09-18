package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.MyFirstService;
import org.springframework.stereotype.Service;

@Service
public class MyFirstServiceImpl implements MyFirstService {

  User userOsm = new User(1, "ous", "gounaya" , "osm@co.com");

  @Override
  public String helloWorld() {
    return "Hello world";
  }


}
