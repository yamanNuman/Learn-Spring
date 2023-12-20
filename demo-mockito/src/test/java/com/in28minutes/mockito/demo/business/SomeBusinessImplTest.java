package com.in28minutes.mockito.demo.business;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	
	@Test
	void findTheGreatestAllData() {
		DataService dataServiceSub = new DataServiceSub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceSub);
		assertEquals(256, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestAllData_withOneValue() {
		DataService dataServiceSub = new DataServiceSub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceSub);
		assertEquals(15, businessImpl.findTheGreatestFromAllData());
	}

	class DataServiceSub implements DataService {

		@Override
		public int[] retrieveAllData() {
			// TODO Auto-generated method stub
			return new int[] {12,15,25,3,25,256};
		}
		
	}
	
	class DataServiceSub2 implements DataService {

		@Override
		public int[] retrieveAllData() {
			// TODO Auto-generated method stub
			return new int[] {15};
		}
		
	}
}

