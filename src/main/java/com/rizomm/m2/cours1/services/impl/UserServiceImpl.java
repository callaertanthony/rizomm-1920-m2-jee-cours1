package com.rizomm.m2.cours1.services.impl;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    User userOsm = new User(1, "ous", "gounaya" , "osm@co.com");

    @Override
    public User createUser(Integer id, String firstName, String lastName, String mail) {
        User user = new User(id, firstName, lastName, mail);
        //user.setFirstName(firstName);
        //user.setLastName(lastName);
        //user.setMail(mail);

        return user;
    }

    public User getUser(Integer id){
        return userOsm;
    }
}
