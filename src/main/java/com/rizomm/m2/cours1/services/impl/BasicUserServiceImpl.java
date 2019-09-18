package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class BasicUserServiceImpl implements UserService {

    private User user;

    @Override
    public User createUser(Integer id, String firstName, String lastname, String mail) {
        return user = new User(id, firstName, lastname, mail);
    }

    @Override
    public User getUser() {
        if (user != null) return user;
        else return new User(1,"fakeuser", "fakename", "fakename");
    }

    @Override
    public User getUser(Integer id) {
        if (user.getId().equals(id)) return user;
        else return null;
    }
}
