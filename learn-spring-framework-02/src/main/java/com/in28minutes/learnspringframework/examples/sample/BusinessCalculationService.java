package com.in28minutes.learnspringframework.examples.sample;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	private DataService dataService;
	
	//Constructor injection
	@Autowired
	public BusinessCalculationService(@Qualifier("MySqlDbServiceQualifier" )DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findMax() {
		System.out.println("Busines findmax method");
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
