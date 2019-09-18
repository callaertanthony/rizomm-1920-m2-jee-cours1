package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.services.impl.MyFirstServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstServiceTests {

    @Autowired
    MyFirstService myFirstServiceImpl;

    @Test
    public void must_return_hello_world() {
        Assert.assertEquals("Hello world", myFirstServiceImpl.helloWorld());
    }

}
