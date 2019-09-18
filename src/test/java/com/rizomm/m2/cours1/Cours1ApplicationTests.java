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
	MyFirstService service;

	@Autowired
	MySecondService deuxiemeService;

	@Test
	public void contextLoads() {
		assert service.MyFirstFunction() == 1;
	}

	@Test
	public void contextLoads2() {
		assert service.MyFirstFunction() == 1;
	}

	@Test
	public void contextLoads3() {
		assert deuxiemeService.callFirst() == 1;
	}
}
