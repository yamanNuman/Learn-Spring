package com.in28minutes.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MyAssertTest {

	List<String> todos = Arrays.asList("AWS","Azure","DevOps");
	
	@Test
	void test() {
		assertTrue(todos.contains("AWS"));
		assertFalse(todos.contains("GCP"));
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2});
	}
}
