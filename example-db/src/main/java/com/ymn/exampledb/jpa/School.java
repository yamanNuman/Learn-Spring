package com.ymn.exampledb.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class School {
	
	@Id
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="students")
	private long students;
	
	public School() {
		
	}
	
	public School(long id, String name, long students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStudents() {
		return students;
	}

	public void setStudents(long students) {
		this.students = students;
	}
	
}
