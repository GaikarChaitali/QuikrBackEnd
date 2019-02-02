package com.quickr.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickr.login.model.UserRegistrationAccount;
import com.quickr.login.repository.UserRepository;

@RestController
@RequestMapping("/reg")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	/*@GetMapping("/users/{email}")
	public Optional<UserRegistrationAccount>  getUserByEmail(@PathVariable String email) {
		System.out.println("Get sprcific User by email...");
		return userRepository.findById(email);
	}*/
	
	@GetMapping("/getusers")
	public List<UserRegistrationAccount> getAllUsers() {
		System.out.println("Get all Users...");
		System.out.println(userRepository.findAll());
		return userRepository.findAll();
	}
	
	@PostMapping("/create")
	public String addUser(@RequestBody UserRegistrationAccount account) {
		System.out.println(account);
		System.out.println("Saving user...");
		userRepository.save(account);
		return "added succesfully";
	}
	
	
}
