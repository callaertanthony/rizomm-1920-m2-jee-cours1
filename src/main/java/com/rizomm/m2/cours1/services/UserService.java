package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(){
        User user = new User();
        user.setFirstname("Vivien");
        user.setLastname("Longuet");
        user.setMail("a");
        return user;
    }

    public User getUser(Integer id) {
        User user = new User();
        user.setFirstname("Vivien");
        user.setLastname("Longuet");
        user.setMail("a");
        return user;
    }

    public User updateUser() {
        return null;
    }

    public User deleteUser() {
        return null;
    }
}
