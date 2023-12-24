package com.in28minutes.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	
	@GetMapping("/")
	public String helloWordl(Authentication authentication) {
		System.out.println(authentication);
		return "Hello World";
	}
}
