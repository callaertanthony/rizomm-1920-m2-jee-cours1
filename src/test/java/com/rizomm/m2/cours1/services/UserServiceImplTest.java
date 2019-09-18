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
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    public void create_correct_user(){

        User toto =userService.createUser(1,"toto","tata","toto@tata.com");
        Assert.assertEquals("toto",toto.getFirstname());
        Assert.assertEquals("tata",toto.getLastname());
        Assert.assertEquals("toto@tata.com",toto.getEmail());

    }

    @Test
    public void get_correct_User(){
        User tata = new User(1,"tata","toto","tata@toto.com");
        Assert.assertEquals(userService.getUser(1),tata);


    }

}
