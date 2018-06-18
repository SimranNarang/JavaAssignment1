package com.stackroute.utility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharacterCheckTest {

		@Test
		void testCheckInvalidInput() {
			CharacterCheck cc = new CharacterCheck();
			
			/*Act*/
			String result = cc.checkCharacter("");
			
			/*Assert*/
			assertEquals("Invalid Input", result);
		}
		
		@Test
		void testCheckInvalidString() {
			CharacterCheck cc = new CharacterCheck();
			
			/*Act*/
			String result = cc.checkCharacter("aaa");
			
			/*Assert*/
			assertEquals("Invalid Input", result);
		}
		
		@Test
		void testCheckCapital() {
			CharacterCheck cc = new CharacterCheck();
			
			/*Act*/
			String result = cc.checkCharacter("A");
			
			/*Assert*/
			assertEquals("Capital Letter", result);
		}
		
		@Test
		void testCheckSmall() {
			CharacterCheck cc = new CharacterCheck();
			
			/*Act*/
			String result = cc.checkCharacter("a");
			
			/*Assert*/
			assertEquals("Small Letter", result);
		}
		@Test
		void testCheckNumber() {
			CharacterCheck cc = new CharacterCheck();
			
			/*Act*/
			String result = cc.checkCharacter("1");
			
			/*Assert*/
			assertEquals("Number", result);
		}
		@Test
		void testCheckSpecial() {
			CharacterCheck cc = new CharacterCheck();
			
			/*Act*/
			String result = cc.checkCharacter("@");
			
			/*Assert*/
			assertEquals("Special Character", result);
		}

}
