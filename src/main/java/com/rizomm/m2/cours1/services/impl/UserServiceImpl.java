package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(Integer id,String name, String lastName, String email){
        return new User(id,email,name,lastName);

    }
}
