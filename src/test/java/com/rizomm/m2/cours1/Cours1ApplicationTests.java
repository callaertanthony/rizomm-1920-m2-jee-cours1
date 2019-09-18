package com.rizomm.m2.cours1;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cours1ApplicationTests {
	
	@Autowired
	MyFirstService mf;
	
	@Autowired
	MySecondService ms;

	@Test
	public void contextLoads() {
		assertThat(mf.myFirstFunction(), is(3));
	}

	@Test
	public void test2() {
		assertThat(mf.myFirstFunction(), is(1));
	}
	
	@Test 
	public void test3() {
		assertThat(ms.mySecondFunction(), is(2));
	}
	
}
