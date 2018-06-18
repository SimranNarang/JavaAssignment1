package com.stackroute.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testAddition() {
		int expectedValue = 120;
		Addition addition = new Addition();
		int arr[]={10 , 20, 30, 40, 20};
		int actualValue = addition.addArray(arr);
		assertEquals(expectedValue,actualValue);
				
	}
	@Test
	void testInvalidAddition() {
		int expectedValue = 500;
		Addition addition = new Addition();
		int arr[]= {};
		int actualValue = addition.addArray(arr);
		assertEquals(expectedValue,actualValue);
				
	}

}
