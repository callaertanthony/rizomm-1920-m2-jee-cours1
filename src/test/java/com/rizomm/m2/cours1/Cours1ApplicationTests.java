package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.Services.MyFirstService;
import com.rizomm.m2.cours1.Services.MySecondService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // injection de faire le spring dans les tests
@SpringBootTest
public class Cours1ApplicationTests {

	@Autowired
	MyFirstService ms1;

	@Autowired
	MySecondService ms2;

	@Test
	public void contextLoads() {
		//assert(false);
		ms1.myFirstFonction();
		//Assert.assertNotNull(mf1.myFirstFonction());
	}

	@Test
	public void contextLoads1() {
		//assert(false);
		ms1.myFirstFonction();
		//Assert.assertNotNull(mf2.myFirstFonction());
	}

	@Test
	public void contextLoads2() {
		//assert(false);
		ms2.mySecondFunction();
		//Assert.assertNotNull(mf2.myFirstFonction());
	}

}
