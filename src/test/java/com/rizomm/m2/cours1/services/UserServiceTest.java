package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.impl.BasicUserServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    BasicUserServiceImpl userService;

    @Test
    public void createUserAndReturnIt() {
        User mockedUser = new User(1,"SuperPrenom", "SuperNom", "nice.mail@gmail.com");
        Assert.assertEquals(mockedUser, userService.createUser(1,"SuperPrenom", "SuperNom", "nice.mail@gmail.com"));
    }

    @Test
    @After
    public void getUser() {
        User mockedUser = new User(1,"SuperPrenom", "SuperNom", "nice.mail@gmail.com");
        Assert.assertEquals(mockedUser, userService.getUser());
    }

    @Test
    @After
    public void getUserAndCheckFirstname() {
        Assert.assertEquals("SuperPrenom", userService.getUser().getFirstName());
    }
}
