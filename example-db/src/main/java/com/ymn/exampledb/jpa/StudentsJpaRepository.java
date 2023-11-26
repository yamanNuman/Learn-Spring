package com.ymn.exampledb.jpa;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentsJpaRepository {
				
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(School school) {
		entityManager.merge(school);
	}
}
