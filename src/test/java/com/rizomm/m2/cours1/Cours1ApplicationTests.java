package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.Myfirstservice;
import com.rizomm.m2.cours1.services.Mysecondservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {

	@Autowired
	Mysecondservice mysecondeservice;

	@Autowired
	Myfirstservice myfirstservice;

	@Test
	public void contextLoads() {
		//System.out.println(myfirstservice.myfirstfunction());
		assert myfirstservice.myfirstfunction() ==1;
	}

	@Test
	public void contextLoads2() {
		//System.out.println(myfirstservice.myfirstfunction());
		assert myfirstservice.myfirstfunction() ==1;
	}

	@Test
	public void contextLoads3() {
		//System.out.println(myfirstservice.myfirstfunction());
		assert mysecondeservice.mysecondfunction() ==1;
	}

}
