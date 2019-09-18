package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {

	@Autowired
	MyFirstService myService;

	@Autowired
	MySecondService mySecondService;

	@Test
	public void contextLoads() {
		assertTrue(myService.myFirstFunction().equals(3));
	}

	@Test
	public void myTest(){
		assertTrue(myService.myFirstFunction().equals(1));
	}

	@Test
	public void mySecondTest(){
		assertTrue(mySecondService.mySecondFunction().equals(2));
	}


}
