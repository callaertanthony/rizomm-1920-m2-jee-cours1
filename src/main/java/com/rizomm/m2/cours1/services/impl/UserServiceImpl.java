package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {




    @Override
    public User createUser(Integer id,String firstname, String lastname, String email) {
        return new User(id,firstname,lastname,email);
    }

    @Override
    public User getUser(Integer id) {
        User tata = new User(1,"tata","toto","tata@toto.com");
        return tata;
    }
}
