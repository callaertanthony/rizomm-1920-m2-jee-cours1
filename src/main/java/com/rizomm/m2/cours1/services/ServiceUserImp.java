package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entites.User;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserImp implements ServiceUser {

    @Override
    public User createUser(Integer id) {
        return new User(1,"Redha", "Benzine", "monmail@catho.fr");
    }
}
