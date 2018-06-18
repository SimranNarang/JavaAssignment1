package com.stackroute.utility;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NIterationTest {

	@Test
	void testNIteration() {
		String expectedValue = "1 2 2 3 3 3 ";
		NIteration ni = new NIteration();
		String actualValue = ni.nIteration(3);
		
		assertEquals(expectedValue,actualValue);
		
	}
	
	@Test
	void testIteration() {
		String expectedValue = "1 ";
		NIteration ni = new NIteration();
		String actualValue = ni.nIteration(1);
		
		assertEquals(expectedValue,actualValue);
		
	}
	@Test
	void testIterationFalse() {
		String expectedValue = "122333";
		NIteration ni = new NIteration();
		String actualValue = ni.nIteration(3);
		
		assertNotEquals(expectedValue,actualValue);
		
	}

}
