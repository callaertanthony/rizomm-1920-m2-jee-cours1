package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {

	@Autowired
	MySecondService service;

	@Test
	public void contextLoads() {
		Assert.assertEquals(1, service.MyFirstFunction());
	}

}
