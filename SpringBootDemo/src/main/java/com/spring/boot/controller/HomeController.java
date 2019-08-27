package com.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // using rest service annotation.
public class HomeController {
	// controller body
	@RequestMapping(value = "/hello")  
	public String hello() {
		return "Hello!";
	}
}
