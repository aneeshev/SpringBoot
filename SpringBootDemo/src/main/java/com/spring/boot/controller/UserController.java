package com.spring.boot.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.SpringBootDemoApplication;
import com.spring.boot.model.UserRecord;
import com.spring.boot.service.UserService;

@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public List<UserRecord> getAllUser() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord) {
		System.out.println("request at :- /add-user");
		logger.warn("this is a warn message**********************");
		userService.addUser(userRecord);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public Optional<UserRecord> getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
}
