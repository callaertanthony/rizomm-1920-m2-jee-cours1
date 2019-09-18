package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(String fn, String ln, String mail){
        return new User(fn,ln,mail);
    }

    public User getUser(){
        return createUser("toto","titi","tata");
    }
}
