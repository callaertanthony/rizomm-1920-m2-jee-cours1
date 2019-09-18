package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;

public interface UserService {


    public User createUser(Integer id,String firstname, String lastname, String email);

    User getUser(Integer id);
}
