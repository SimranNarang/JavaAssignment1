package com.stackroute.utility;

public class ReverseString {
	public String reverseString(String str){

		if(str.length()<1) {
			return "Invalid Input";
		}else if(str.length()==1) {
			return str;
		}
		String rev = "";
	    for (int i = str.length()-1; i>=0 ; i--) {
	        char ch = str.charAt(i);
	        rev+=ch;
	        }
	    return rev;
	}

}
