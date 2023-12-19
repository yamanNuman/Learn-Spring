package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.in28minutes.com.MyMath;

class MyMathTest {

	MyMath math = new MyMath();
	
	@Test
	void test() {
			
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void test1() {

		assertEquals(0, math.calculateSum(new int[] {}));
	}
}
