package com.rizomm.m2.cours1.services.impl;

import org.springframework.stereotype.Service;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User createUser(Integer id, String firstName, String lastName, String mail) {
		return new User(id, firstName, lastName, mail);
	}

	@Override
	public User getUser(Integer id) {
		return createUser(1, "toto","titi","tata");
	}

}
