package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entity.User;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserImp implements ServiceUser {
    @Override
    public User getUser(Integer id) {
        return new User (1, "Khadija", "Azibou", "khadija.azibou@gmail.com");
    }


}
