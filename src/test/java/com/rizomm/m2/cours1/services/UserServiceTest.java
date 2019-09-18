package com.rizomm.m2.cours1.services;


import com.rizomm.m2.cours1.entities.User;
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
    UserService userService;



    @Test
    public void must_Create_User() {
        User user = userService.createUser(1, "Oussama", "Gounaya", "o@gmail.com");

        Assert.assertEquals(user.getId(), "1");
        Assert.assertEquals(user.getFirstName(), "Oussama");
        Assert.assertEquals(user.getLastName(), "Gounaya");
        Assert.assertEquals(user.getMail(), "o@gmail.com");
    }

    @Test
    public void must_get_User_IWant() {
        User user = userService.createUser(1,"Oussama", "Gounaya", "o@gmail.com");
        Assert.assertEquals(user, userService.getUser(1));
    }

}
