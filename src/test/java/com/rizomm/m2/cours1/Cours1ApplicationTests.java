package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
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
		myFirstService.myFunctionAsAService();
		Assert.assertEquals(Integer.valueOf(42), MyFirstService.myFirstFunction());
	}

	@Test
	public void testMyService() {
		Assert.assertEquals(Integer.valueOf(42), myFirstService.myFunctionAsAService());
	}

	@Test
	@DirtiesContext
	public void testMyIncrement (){
		Assert.assertEquals(Integer.valueOf(1), myFirstService.myIncrement());
	}

	@Test
	@DirtiesContext
	public void testMyIncrementSecondTime (){
		// This won't work without dirty context because the previous test incremented the attribute.
		Assert.assertEquals(Integer.valueOf(1), myFirstService.myIncrement());
	}

	@Test
	@DirtiesContext
	public void testMyIncrementThird (){
		// This won't work without dirty context because the previous test incremented the attribute.
		Assert.assertEquals(Integer.valueOf(1), myFirstService.myIncrement());
	}

	@Test
	@DirtiesContext
	public void testSecondService() {
		Assert.assertEquals(Integer.valueOf(1), mySecondService.incrementFirstService());
	}

}
