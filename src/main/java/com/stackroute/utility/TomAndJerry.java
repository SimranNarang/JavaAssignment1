package com.stackroute.utility;

public class TomAndJerry {
	public String TomJerry(String a) {
		int z = 0;
        int x = Integer.parseInt(a);
        if(((x%2)==0)&&((x>20)&&(x<30)))
        {
            z=1;
        }
        else if(((x%2)!=0)&&((x>20)&&(x<30)))
        {
            z=0;
        }
        else {
            return"Enter number between 20 to 30";
        }
        if(z==1)
        {
            return("Jerry");
        }
        else
        {
            return("Tom");
        }

	}
}