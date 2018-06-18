package com.stackroute.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromeCheckTest {

	@Test
	void testIsPalindrome() {
		   String expectedValue= "Palindrome. Sum greater than 25";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("24466442");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }

	@Test
	void testIsNotPalindrome() {
		   String expectedValue= "Not a palindrome";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("1234");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	
	@Test
	void testIsPalindromeSum() {
		   String expectedValue= "Palindrome. Sum not greater than 25";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("123321");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	
	@Test
	void testInvalidInput() {
		   String expectedValue= "Invalid Input";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("123321ab");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	@Test
	void testNullInvalidInput() {
		   String expectedValue= "Invalid Input";
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       String actualValue=pc.isPalindrome("");
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	
	
	@Test
	void testTestSumLess() {
		   boolean expectedValue= false;
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       boolean actualValue=pc.checkSum(12345);
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }

	@Test
	void testTestSumGreater() {
		   boolean expectedValue= true;
	       PalindromeCheck pc=new PalindromeCheck();
	       //Act
	       boolean actualValue=pc.checkSum(2424848);
	       //Assert
	       assertEquals(expectedValue, actualValue);
	    }
	
	
		
	}


