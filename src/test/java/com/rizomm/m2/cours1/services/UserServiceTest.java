package com.rizomm.m2.cours1.services;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rizomm.m2.cours1.entities.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	UserService userService;
	
	@Test
	public void must_return_user() {
		User user = userService.createUser(1, "toto", "titi", "mail");
		assertThat(user.getId(), is(1));
		assertThat(user.getFirstName(), is("toto"));
		assertThat(user.getLastName(), is("titi"));
		assertThat(user.getMail(), is("mail"));
	}

}
