package com.ymn.exampledb.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymn.exampledb.jpa.School;

public interface SchoolSpringDataJpaRepository extends JpaRepository<School, Long>{

	public List<School> findByName(String name);
	public List<School> findByStudents(Long students);
	
}
