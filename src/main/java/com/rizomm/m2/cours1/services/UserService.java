package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User createUser(Integer id, String firstName, String lastname, String email);
    User getUser(Integer id);
}
