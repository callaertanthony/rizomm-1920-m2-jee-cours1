package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;

public interface UserService {
     User createUser(Integer id,String name, String lastName, String mail);
     User getUser();
}
