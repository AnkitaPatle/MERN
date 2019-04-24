package com.beacon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("getUser/{id}")
	public User getUser(@PathVariable int id) {
		User user  =userRepo.findById(id).get();
		System.out.println(user.toString());
		return user;
	}

	@PostMapping("/addUserInfo")
	public void addUserInfo(@RequestBody User userInfo) {
		userRepo.save(userInfo);
	}

	@GetMapping("/getAllUserInfo")
	public List<User> getAllUserInfo() {
		return userRepo.findAll();
	}

}
