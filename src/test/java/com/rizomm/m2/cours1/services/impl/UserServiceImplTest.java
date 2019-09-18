package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void create_user_method_return_should_match_new_user() {
        User exceptedUser = new User(1,"jean","prolo","jean@prolo.com");
        assertEquals(exceptedUser, userService.createUser(1,"jean","prolo","jean@prolo.com"));
    }

    @Test
    public void get_user_method_should_return_existing_user() {
        userService.createUser(1, "jean","prolo","jean@prolo.com");
        assertNotNull(userService.getUser(1));
    }
}