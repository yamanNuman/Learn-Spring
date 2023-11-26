//package com.ymn.exampledb.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SchoolCommandLineRunner implements CommandLineRunner{
//
//	@Autowired
//	private SchoolJpaRepository repository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		repository.insert(new School(1,"Kocaeli University",50_000));
//		repository.insert(new School(2,"Sakarya University",35_000));
//		repository.insert(new School(3,"Istanbul Technical University",40_000));
//		System.out.println(repository.findById(1L));
//		repository.deleteById(3L);
//	}
//
//}
