package com.rizomm.m2.cours1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Integer id;

	private String firstName;

  	private String lastName;

  	private String mail;

}
