package com.in28minutes.learnspringframework.examples.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//@Component
@Repository //DB
@Qualifier("MySqlDbServiceQualifier")
public class MySqlDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		System.out.println("MySqlDbDataService Running...");
		return new int[] {1, 2, 3, 4, 5};
	}

}
