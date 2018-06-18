package com.stackroute.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseString() {
		String expectedValue="narmis";
		ReverseString rs = new ReverseString();
		String actualValue = rs.reverseString("simran");
		assertEquals(expectedValue,actualValue);
	}

	@Test
	void testInvalidString() {
		String expectedValue="Invalid Input";
		ReverseString rs = new ReverseString();
		String actualValue = rs.reverseString("");
		assertEquals(expectedValue,actualValue);
	}
	@Test
	void testValidString() {
		String expectedValue="a";
		ReverseString rs = new ReverseString();
		String actualValue = rs.reverseString("a");
		assertEquals(expectedValue,actualValue);
	}

}


