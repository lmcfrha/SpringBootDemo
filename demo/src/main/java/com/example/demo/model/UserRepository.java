package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;


@Component
public class UserRepository {
	public static Map<Integer, User> userTable = new HashMap<>();
	public UserRepository() {
		User user1 = new  User("Tom", "Selenium");
		User user2 = new  User("Jerry", "Halibut");
		userTable.put(1, user1);
		userTable.put(2, user2);
	}
	public User findOne(Integer Id) {
		return userTable.get(Id);
	}
	
	public void addOne(Integer id, User user) {
		userTable.put(id, user);
	}

}
