package com.in28minutes.com.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.in28minutes.com.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {	
		repository.save(new Course(1, "Learn AWS Spring Data JPA!", "in28minutes"));
		repository.save(new Course(2, "Learn Azure Spring Data JPA!", "in28minutes"));
		repository.save(new Course(3, "Learn DevOps Spring Data JPA!", "in28minutes"));
		repository.deleteById(1L);
		System.out.println(repository.findById(2L));
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("Learn DevOps Spring Data JPA!"));
	}
}
