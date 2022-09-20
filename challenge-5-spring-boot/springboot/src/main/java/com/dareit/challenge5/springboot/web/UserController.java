package com.dareit.challenge5.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dareit.challenge5.springboot.data.UserData;
import com.dareit.challenge5.springboot.model.User;

@RestController
public class UserController {

	@Autowired
	private UserData userData;

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userData.retreiveAllUsers();
	}

	@RequestMapping("/user")
	public User getUser(@RequestParam int id) {

		return userData.retreiveUser(id);

	}

}
