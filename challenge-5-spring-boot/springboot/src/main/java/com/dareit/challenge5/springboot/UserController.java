package com.dareit.challenge5.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/users")
	public List<User> retrieveAllUsers() {
		return Arrays.asList(
				new User(1, "Maria", "Miguel"),
				new User(2, "Leonardo", "Conte"),
				new User(3, "Roland", "Holenstein"));
	}

	@RequestMapping("/users/{id}")
	public User retrieveUser() {
		return (new User(1, "Maria", "Miguel"));

	}




}
