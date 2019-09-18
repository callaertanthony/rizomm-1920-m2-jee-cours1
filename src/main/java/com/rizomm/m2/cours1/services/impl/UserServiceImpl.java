package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void createUser() {
        new User(1, "Romain", "Dick", "r.dick.pro@gmail.com");
    }

    public User getUser(Integer id) {
        return new User(id, "Romain", "Dick", "r.dick.pro@gmail.com");
    }

}
