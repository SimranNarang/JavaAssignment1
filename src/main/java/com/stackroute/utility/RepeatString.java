package com.stackroute.utility;

public class RepeatString {
	public String repeatString(String str, int n) {
		if(str.length()==0|| str.length()<n) {
			return "Invalid";
		}
		
		String substr = str.substring(str.length()-n);
	    for(int i =1; i<=n ;i++) {
	        str = str.concat(substr);
	    }
	    return str;
	}

}
