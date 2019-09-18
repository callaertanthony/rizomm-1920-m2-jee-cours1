package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UserServiceTests {
    @Autowired
    UserService userService;

    @Test
    public void return_user(){
        User user = userService.createUser("titi","tata","toto");
        assertTrue(user.firstName.equals("titi"));
        assertTrue(user.lastName.equals("tata"));
        assertTrue(user.mail.equals("toto"));

    }
}
