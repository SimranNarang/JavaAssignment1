package com.stackroute.utility;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    
	   public ArrayList<Integer> sortNumber(int a) {
	       ArrayList <Integer> arr = new ArrayList<Integer>();        
	       
	        while(a>0) {
	            int r =a%10;
	            a= a/10;
	            arr.add(r);
	        }
	        Collections.sort(arr, Collections.reverseOrder());
	        System.out.println(arr);
	        return arr;
	   }
	    
	    public int sumOfEven(int a) {
	        int sum =0;
	        while(a>0) {
	            int r =a%10;
	            a= a/10;
	            sum += r%2==0? r:0;
	        }
	        System.out.println(sum);
	        return sum;
	    }

	}