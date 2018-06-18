package com.stackroute.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCheck {
	ArrayList<String> al=new ArrayList<String>();
	public static void main(String[] args) {
   	 Scanner sc=new Scanner(System.in);
   	 LetterCheck cv=new LetterCheck();
   	 String s=sc.next();
   	 ArrayList<String>al=cv.checkVowelAndConsonant(s);
   	 
   	 for(int i=0;i<al.size();i++) {
   		 System.out.println(al.get(i));
   	 }
   	 sc.close();
    }
		
	public  ArrayList<String> checkVowelAndConsonant(String s) {
		int l=s.length();
		if(l<=0) {
			al.add("Invalid Input");
			return al;
		}
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) {
				switch(ch) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					al.add(ch+" is vowel");
					break;
				default:
					al.add(ch+" is consonant");
					
				}
			}else {
				al.add("Not a letter");
			}
		}
		return al;
		}
	     
}
