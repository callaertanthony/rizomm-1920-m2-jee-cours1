package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.services.MyFirstService;
import org.springframework.stereotype.Service;

@Service
public class MyFirstServiceImpl implements MyFirstService {

  @Override
  public String helloWorld() {
    return "Hello world";
  }


}
