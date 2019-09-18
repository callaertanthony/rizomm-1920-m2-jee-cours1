package com.rizomm.m2.cours1.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstServiceTest {

  @Autowired
  MyFirstService myFirstService;

  @Test
  public void must_return_hello_world() {
    Assert.assertEquals("Hello world", myFirstService.helloWorld());
  }

}
