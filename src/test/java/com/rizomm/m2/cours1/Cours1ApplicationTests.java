package com.rizomm.m2.cours1;

import static org.junit.Assert.fail;

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
	private MyFirstService myFirstService;
	
	@Autowired
	private MySecondService mySecondService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void Test1() {
		if (!MyFirstService.counter.equals(myFirstService.myFirstFunction()))
			fail();

		myFirstService.test2();
	}

	@Test
	public void Test2() {
		mySecondService.callFirst();
	}
}
