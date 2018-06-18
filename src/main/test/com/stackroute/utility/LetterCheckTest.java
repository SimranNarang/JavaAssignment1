package com.stackroute.utility;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LetterCheckTest {
	@Test
	public void checkVowelAndConsonantTest() {
		/* Arrange */
		LetterCheck cv=new LetterCheck();
		/* Act */
		ArrayList<String> actualList=cv.checkVowelAndConsonant("abhi");
		ArrayList<String> expectedList=new ArrayList<String>();
		expectedList.add("a is vowel");
		expectedList.add("b is consonant");
		expectedList.add("h is consonant");
		expectedList.add("i is vowel");
		/* Assert */
		assertEquals(expectedList,actualList);
	}


	

}
