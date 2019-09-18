package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest




public class Cours1ApplicationTests {
	@Autowired
	MyFirstService myFirstService;

	@Autowired

	MySecondService mySecondService ;

	@Test
	public void contextLoads() {
//		MyFirstService myfirstservice = new MyFirstService();
//		System.out.println(myfirstservice.myFirstfunction());
		assert mySecondService.mySecondFunction() ==1;

//		assertFalse(true);

	}
	public void contextLoads1() {
//		MyFirstService myfirstservice = new MyFirstService();
//		System.out.println(myfirstservice.myFirstfunction());
		assert mySecondService.mySecondFunction() ==1;

//		assertFalse(true);

	}



}
