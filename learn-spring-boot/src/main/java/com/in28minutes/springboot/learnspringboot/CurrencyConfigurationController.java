package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	//Field Injection
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAllCurrency() {
		return configuration;
	}
	
}
