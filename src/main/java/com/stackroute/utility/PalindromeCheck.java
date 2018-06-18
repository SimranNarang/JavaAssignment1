package com.stackroute.utility;


public class PalindromeCheck {
	
	String isPalindrome(String s) {
		int num;
		try {
			num = Integer.parseInt(s);
			
		}catch(Exception e) {
			return "Invalid Input";
		}
		int temp=num,rev=0;
		while(temp!=0) {
			int mod = temp%10;
			rev = rev*10 + mod;
			temp = temp/10;
		}
		if(num==rev) {
			if(checkSum(num)) {
				return "Palindrome. Sum greater than 25";
			}else {
				return "Palindrome. Sum not greater than 25";
			}
		}else {
			return "Not a palindrome";
		}
		
	}
	
	boolean checkSum(int num) {
		int sum=0;
		while(num!=0) {
			int mod = num%10;
			if(mod%2==0) {
				sum+=mod;
			}
			num = num/10;
		}
		if(sum > 25) {
			return true;
		}else {
			return false;
		}
	}


}
