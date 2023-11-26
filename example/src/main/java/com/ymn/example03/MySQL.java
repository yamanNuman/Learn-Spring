package com.ymn.example03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("mySQL")
@Lazy
public class MySQL implements RepositoryService{
	
	public MySQL() {
		System.out.println("MySQL");
	}

	@Override
	public void connect() {
		System.out.println("MySQL Connected.");
		
	}

	@Override
	public void close() {
		System.out.println("MySQL Closed.");
		
	}

}
