package com.stackroute.utility;

public class NIteration {
	public String nIteration(int n) {
		String str="";
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				str = str.concat(i+" ");
			}
		}
		return str;
	}

}
