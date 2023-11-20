package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

<<<<<<< HEAD
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAllCurreny() {
		return currencyServiceConfiguration;
	}
=======
	//Field Injection
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAllCurrency() {
		return configuration;
	}
	
>>>>>>> 37e004928bb2f2f64562eec1e1373cd27862b3ad
}
