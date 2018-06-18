package com.stackroute.utility;

import java.util.Scanner;

public class GuessNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your guessed number(1-50): ");
		int num= sc.nextInt();
		GuessNumber gn = new GuessNumber();
		int target = 20;
		String str="";
		do {
			System.out.println(gn.guessNumber(num,target));
			if(!(str.equals("Matches"))) {
				System.out.println("Enter your guessed number(1-50): ");
				num= sc.nextInt();
			}
		}while(!(str.equals("Matches")));
		
		sc.close();
	}
	
	
	
	
	public String guessNumber(int num , int target) {
		 
		 if (num > target)
             return "Greater";
         else if (num < target)
             return "Less";
         else
             return "Matches";
				
	}

}
