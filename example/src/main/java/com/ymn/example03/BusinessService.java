package com.ymn.example03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	
	private RepositoryService repository;
	
	@Autowired
	public BusinessService(RepositoryService repository) {
		this.repository = repository;
	}
	
	public void connect() {
		repository.connect();
	}
	
	public void close() {
		repository.close();
	}

}
