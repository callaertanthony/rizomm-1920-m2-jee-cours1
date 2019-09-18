package com.rizomm.m2.cours2;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours2ApplicationTests {

    @Autowired
    private UserService userService;


    @Test
    public void testUser() {
        User user = userService.getUser(1);

        assert "Romain".equals(user.getFirstName()) && "Dick".equals(user.getLastName()) 
        && "r.dick.pro@gmail.com".equals(user.getMail());
    }

}
