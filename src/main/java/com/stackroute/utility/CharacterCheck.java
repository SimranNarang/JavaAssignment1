package com.stackroute.utility;

public class CharacterCheck {
	public String checkCharacter(String s) {
		if(s.length()>1 || s.length()<1) {
			return "Invalid Input";
		}
		char ch = s.charAt(0);
		if(ch >= 65 && ch<= 90) {
			return "Capital Letter";
		} else if(ch>=97 && ch<=122) {
			return "Small Letter";
		} else if(ch>=48 && ch<=57) {
			return "Number";
		} else {
			return "Special Character";
		}
		
	}

}
