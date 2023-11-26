package com.ymn.example03;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

@Repository
@Primary
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PostgreSQL implements RepositoryService{
	
	public PostgreSQL() {
		super();
	}

	@Override
	public void connect() {
		System.out.println("PostgreSQL Connected.");
		
	}

	@Override
	public void close() {
		System.out.println("PostgreSQL Closed.");
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Starting...");
	}

}
