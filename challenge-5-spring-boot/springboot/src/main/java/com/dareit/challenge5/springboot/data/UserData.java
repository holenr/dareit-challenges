package com.dareit.challenge5.springboot.data;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.dareit.challenge5.springboot.model.User;

@Component
public class UserData {

	private ArrayList<User> users; // TODO datastructure not optimal, map would be better as discussed

	// TODO: no comments allowed
	// initial sample User data: (should come come from database)
	public UserData() {
		users = new ArrayList<>();
		users.add(new User(1, "Maria", "Miguel")); // TODO not DRY
		users.add(new User(2, "Leonardo", "Conte"));
		users.add(new User(3, "Roland", "Holenstein"));
	}

	public ArrayList<User> retreiveAllUsers() { // TODO typo
		return users;
	}

	public User retreiveUser(int id) {
		for (User u : users) { // TODO "User user"
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

}
