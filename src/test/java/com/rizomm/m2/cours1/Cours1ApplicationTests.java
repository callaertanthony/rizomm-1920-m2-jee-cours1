package com.rizomm.m2.cours1;

import com.rizomm.m2.cours1.services.MyFirstService;
import com.rizomm.m2.cours1.services.MySecondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//CAPACITE  FAIRE TOURNER SPRING DANS LES TESTS.

@SpringBootTest
public class Cours1ApplicationTests {

	@Autowired
	MyFirstService myservice;

	@Autowired
	MySecondService myservice2;



	@Test
	//Teste aue Spring demare bien
	public void contextLoads() {

	}






}
