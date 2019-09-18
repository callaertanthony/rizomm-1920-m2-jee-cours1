package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserServiceImpl myUser;




    @Test
    public void must_create_user() {
        User firstUser = myUser.createUser("Miguel","yann","tsmug@gmail.com");

        Assert.assertEquals("Miguel",firstUser.getFirstName());
        Assert.assertEquals("yann",firstUser.getLastName());
        Assert.assertEquals("tsmug@gmail.com",firstUser.getMail());


    }

}
