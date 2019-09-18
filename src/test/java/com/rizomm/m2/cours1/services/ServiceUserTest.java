package com.rizomm.m2.cours1.services;


import com.rizomm.m2.cours1.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ServiceUserTest {

    @Autowired
    ServiceUserImp serviceUserImp;


    @Test
    public void must_return_user() {
        User user = serviceUserImp.getUser(1);

        Assert.assertEquals("Khadija",user.getFirstName());
        Assert.assertEquals("Azibou",user.getLastName());
        Assert.assertEquals("khadija.azibou@gmal.com",user.getMail());
    }
}


