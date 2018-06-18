package com.stackroute.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuessNumberTest {

	    @Test
	    
	    public void guessNumberSuccess(){
	        //Arrange
	        
	        String expectedValue = "Matches";
	        GuessNumber gn = new GuessNumber();
	        //Act
	        String actualValue = gn.guessNumber(20,20);
	        
	        //Assert
	        assertEquals(expectedValue,actualValue);
	        
	    }
	    
	    @Test
	    
	    public void guessNumberMore(){
	        //Arrange
	        String expectedValue ="Less";
	        GuessNumber gn = new GuessNumber();
	        
	        //Act
	        String actualValue = gn.guessNumber(20,40);
	        
	        //Assert
	        assertEquals(expectedValue,actualValue);
	        
	    }
	    
	    @Test
	    public void guessNumberLess(){
	        //Arrange
	        String expectedValue = "Greater";
	        GuessNumber gn = new GuessNumber();
	        
	        //Act
	        String actualValue = gn.guessNumber(20,19);
	        
	        //Assert
	        assertEquals(expectedValue,actualValue);
	        
	    }
}
