package com.ymn.examplerest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreatingsController {
	
	@RequestMapping("/english")
	public Greatings message() {
		return new Greatings("Hello", "U.S.A");
	}
	
	@RequestMapping("/turkish")
	public Greatings message2() {
		return new Greatings("Selam", "Turkey");
	}
	
	@RequestMapping("/german")
	public Greatings message3() {
		return new Greatings("Hallo","Germany");
	}
}
