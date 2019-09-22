package com.rizomm.m2.cours1.services;

import com.rizomm.m2.cours1.entities.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.anyOf;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstServiceTest {

  @Autowired
  MyFirstService myFirstService;

  @Autowired
  ServiceUser serviceUser;

  @Test
  public void must_return_hello_world() {
    Assert.assertEquals("Hello world", myFirstService.helloWorld());
  }


    @Test
    public void must_return_user(Integer id) {
      User user = serviceUser.createUser(id);

      Assert.assertEquals("Hichem",user.getFirstName());
      Assert.assertEquals("Bedjaoui",user.getLastName());
      Assert.assertEquals("Hichem@lacatholille.fr",user.getMail());
    }

  }


