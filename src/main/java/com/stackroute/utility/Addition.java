package com.stackroute.utility;

public class Addition {
	public int addArray(int[] arr) {
		if(arr.length==0) {
			return 500;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			 sum+=arr[i];
		}
		System.out.println(sum);
		return sum;
	}
}
