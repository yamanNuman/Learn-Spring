package com.in28minutes.junit;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	@BeforeAll
	static void test() {
		System.out.println("Before All");
	}
	@BeforeEach
	void test1() {
		System.out.println("Before Each ");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}
	
	@AfterEach
	void test3() {
		System.out.println("After Each");
	}
	
	@Test
	void test4() {
		System.out.println("test3");
	}
	
	@AfterAll
	static void test5() {
		System.out.println("AfterAll");
	}

}
