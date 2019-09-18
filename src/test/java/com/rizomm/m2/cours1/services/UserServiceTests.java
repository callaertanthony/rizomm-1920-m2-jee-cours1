package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserServiceTests {

    @Autowired
    UserService userService;

    @Test
    public void must_be_user() {
        User user_to_test = new User();
        user_to_test.setFirstname("Vivien");
        assertEquals(user_to_test.getFirstname(), userService.getUser().getFirstname());
    }

}
