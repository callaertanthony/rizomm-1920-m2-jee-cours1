package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;

public interface UserService {
    User createUser(Integer id, String firstName, String lastName, String mail);
    User getUser(Integer id);
}
