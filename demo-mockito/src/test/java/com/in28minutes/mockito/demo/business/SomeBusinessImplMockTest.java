package com.in28minutes.mockito.demo.business;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
		@Test
		void findTheGreatestAllData() {
			
			when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,5,23,35});
			assertEquals(35, businessImpl.findTheGreatestFromAllData());
		}	
		
		@Test
		void findTheGreatestAllData_oneValue() {
			
			when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
			assertEquals(15, businessImpl.findTheGreatestFromAllData());
		}	
}

