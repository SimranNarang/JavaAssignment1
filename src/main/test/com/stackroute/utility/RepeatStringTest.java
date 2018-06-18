package com.stackroute.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RepeatStringTest {
	@Test
	void testRepeatString() {
		String expectedValue="simranranranran";
		RepeatString rs = new RepeatString();
		String actualValue = rs.repeatString("simran", 3);
		assertEquals(expectedValue,actualValue);
	}

	@Test
	void testInvalidString() {

		String expectedValue="Invalid";
		RepeatString rs = new RepeatString();
		String actualValue = rs.repeatString("", 3);
		assertEquals(expectedValue,actualValue);
		}
	@Test
	void testValidString() {
		String expectedValue="Invalid";
		RepeatString rs = new RepeatString();
		String actualValue = rs.repeatString("simran", 8);
		assertEquals(expectedValue,actualValue);
		}
	@Test
	void testInvalidInputString() {
		String expectedValue="Invalid";
		RepeatString rs = new RepeatString();
		String actualValue = rs.repeatString("s", 4);
		assertEquals(expectedValue,actualValue);
		}

	
}
