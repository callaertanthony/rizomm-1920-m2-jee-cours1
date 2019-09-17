package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {
	@Autowired
	MyFirstService mf;
	MySecondeService ms;
	@Test

	public void contextLoads() {
		System.out.println(mf.myFirstFunction());
	}
   @Test
	public void contextLoads2() {
		System.out.println(mf.myFirstFunction());
	}
	@Test
	public void contextLoads3() {
		System.out.println(ms);
	}



}
