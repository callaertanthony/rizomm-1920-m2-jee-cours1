package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    private Collection<User> users = new ArrayList<>();

    @Override
    public User createUser(Integer id, String firstName, String lastname, String email) {
        User newUser = new User(id, firstName, lastname, email);
        users.add(newUser);
        return newUser;
    }

    @Override
    public User getUser(Integer id) {
        return users.stream().filter(user -> id.equals(user.getId())).findFirst().orElse(null);
    }

}
