package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {

		@Autowired
	 	private MyFirstService service;

		@Autowired
		private MySecondService secondService;

		private int counter = 0;

	@Test
	@DirtiesContext
	public void contextLoads() {
		assertEquals(service.myFirstFunction(),1);
		assertEquals(service.myFirstFunction(),2);
		assertEquals(service.myFirstFunction(),3);

	}

	@Test
	@DirtiesContext
	public void test2(){
		assertEquals(service.myFirstFunction(),1);

	}

	@Test
	@DirtiesContext
	public void mySecondefunction() {
		assertEquals(secondService.mySecondefunction(),1);

	}

}
