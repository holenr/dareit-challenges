package com.dareit.challenge5.springboot.data;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.dareit.challenge5.springboot.model.User;

@Component
public class UserData {

	private ArrayList<User> users;

	// initial sample User data: (should come come from database)
	public UserData() {
		users = new ArrayList<>();
		users.add(new User(1, "Maria", "Miguel"));
		users.add(new User(2, "Leonardo", "Conte"));
		users.add(new User(3, "Roland", "Holenstein"));
	}

	public ArrayList<User> retreiveAllUsers() {
		return users;
	}

	public User retreiveUser(int id) {
		for (User u : users) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

}
