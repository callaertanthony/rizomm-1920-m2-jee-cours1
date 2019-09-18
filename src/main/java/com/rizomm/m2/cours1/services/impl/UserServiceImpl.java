package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public User getUser(Integer id) {

    User user = new User();
    user.setId(id);
    user.setFirstName("Anthony");
    user.setLastName("Callaert");
    user.setMail("callaertanthony@gmail.com");
    return user;
  }
}
