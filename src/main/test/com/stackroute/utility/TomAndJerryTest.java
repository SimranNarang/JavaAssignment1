package com.stackroute.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TomAndJerryTest {

	 	@Test
	    public void TomJerrySuccessJerry(){
	        //Arrange
	        
	        String expectedValue = "Jerry";
	        TomAndJerry e = new TomAndJerry();
	        String x="22";
	        //Act
	        String actualValue = e.TomJerry(x);
	        
	        //Assert
	        assertEquals(expectedValue,actualValue);
	        
	    }
	    
	    @Test
	    
	    public void TomJerrySuccessTom(){
	        //Arrange
	        
	        String expectedValue = "Tom";
	        TomAndJerry e = new TomAndJerry();
	        String x="23";
	        
	        //Act
	        
	        String actualValue = e.TomJerry(x);
	        
	        //Assert
	        
	        assertEquals(expectedValue,actualValue);
	        
	    }
	    
	    @Test
	    
	    public void TomJerryFailure(){
	        //Arrange
	        
	        String expectedValue = "Enter number between 20 to 30";
	        TomAndJerry e = new TomAndJerry();
	        String x="19";
	        
	        //Act
	        
	        String actualValue = e.TomJerry(x);
	        
	        //Assert
	        
	        assertEquals(expectedValue,actualValue);
	        
	    }
	    
	    @Test
	    
	    public void TomJerryFailure2(){
	        //Arrange
	        String expectedValue = "Enter number between 20 to 30";
	        TomAndJerry e = new TomAndJerry();
	        String x="31";
	        
	        //Act
	        String actualValue = e.TomJerry(x);
	        
	        //Assert
	        assertEquals(expectedValue,actualValue);
	        
	    }
}
