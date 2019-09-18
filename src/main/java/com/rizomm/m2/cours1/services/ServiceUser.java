package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.impl.ServiceUserInterface;
import org.springframework.stereotype.Service;


@Service
public class ServiceUser implements ServiceUserInterface {


    public User createUser(Integer id ){
        return new User(3,"hichem","bedjaoui","hichem@gmail.com");


    }


}
