package com.rizomm.m2.cours1.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rizomm.m2.cours1.entities.User;
import com.rizomm.m2.cours1.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path="{id}")
	public User getUser(@PathParam(value = "id") Integer id) {
		return userService.getUser(id);
	}
	
	@PostMapping
	public User createUser() {
		return userService.getUser(1);
	}
	
	@DeleteMapping
	public void deleteUser() {
		
	}
	
	@PutMapping
	public User updateUser() {
		return null;
	}
	
}
