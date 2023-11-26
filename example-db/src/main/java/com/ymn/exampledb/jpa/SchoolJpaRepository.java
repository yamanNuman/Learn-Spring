//package com.ymn.exampledb.jpa;
//
//import org.springframework.stereotype.Repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
//@Repository
//@Transactional
//public class SchoolJpaRepository {
//				
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	public void insert(School school) {
//		entityManager.merge(school);
//	}
//	
//	public School findById(long id) {
//		return entityManager.find(School.class, id); 
//	}
//	
//	public void deleteById(long id) {
//		School school = entityManager.find(School.class, id);
//		entityManager.remove(school);
//	}
//}
