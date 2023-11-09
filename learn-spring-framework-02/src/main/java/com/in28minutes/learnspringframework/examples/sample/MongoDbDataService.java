package com.in28minutes.learnspringframework.examples.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		System.out.println("MongoDB Service Running...");
		return new int[] {11, 22, 33, 44, 55};
	}

}
