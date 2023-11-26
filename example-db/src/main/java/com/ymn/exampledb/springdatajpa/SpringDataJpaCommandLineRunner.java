package com.ymn.exampledb.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ymn.exampledb.jpa.School;

@Component
public class SpringDataJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	private SchoolSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new School(1,"Wien Technical University",30_000));
		repository.save(new School(2,"Harvard University",40_000));
		repository.save(new School(3,"Columbia University",50_000));
		repository.deleteById(1L);
		System.out.println(repository.findById(2L));
		System.out.println(repository.findByName("Harvard University"));
		System.out.println(repository.findByStudents(40_000L));
	}

}
