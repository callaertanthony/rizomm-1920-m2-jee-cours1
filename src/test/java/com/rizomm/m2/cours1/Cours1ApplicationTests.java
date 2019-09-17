package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {

	@Autowired
	MyFirstService myFirstService;

	@Autowired
	MySecondService mySecondService;

	@Test
	public void contextLoads() {
		myFirstService.myFirstFunction();
		//assert myFirstService.myFirstFunction() == 1;
	}

	@Test
	public void contextLoads2() {
		myFirstService.myFirstFunction();
		//assert myFirstService.myFirstFunction() == 1;
	}

	@Test
	public void contextLoads3() {
		mySecondService.mySecondFunction();
		//assert myFirstService.myFirstFunction() == 1;
	}
}
