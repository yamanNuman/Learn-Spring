//package com.ymn.exampledb.springjdbc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TeamsJdbcCommandLineRunner implements CommandLineRunner {
//
//	@Autowired
//	private TeamsJdbcRepository repository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new Teams(1,"Galatasaray","Turkey","Trendyol Super League"));
//		repository.insert(new Teams(2,"Copenhagen","Denmark","Superliga"));
//		repository.insert(new Teams(3,"Bayern Munchen","Germany","Bundesliga"));
//		repository.insert(new Teams(4,"Manchester United","Engladn","Premier League"));
//		//repository.delete(3);
//		//repository.delete(4);
//		System.out.println(repository.findById(1));
//	}
//}
