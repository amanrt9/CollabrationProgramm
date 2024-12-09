package aman;

public class Armstrong {

	public static void main(String[] args) {
     int arm=371;
     int original=arm;
     int sum=0;
     
    while(arm>0) {
    	int digit=arm%10;
    	sum=sum+(digit*digit*digit);
    	arm=arm/10;
    	
    }
    if(sum==original)
    {
    	System.out.println(original+": "+"It is Armstrong");
    }
    else {
    	System.out.println(original+": "+"its not Armstrong");
    }
    
	}

}
