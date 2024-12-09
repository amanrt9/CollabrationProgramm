package aman;

public class ArmStrong_0to100 {
  // we cannot take 2 digit number in armstrong thats why start for loop from 100 to 999 or required number
	public static void main(String[] args)
	{
		for(int i=100;i<999;i++)
		{
		armstrong(i);
		}

	}
	public static void armstrong(int arm)
	{ 
		int original=arm;
		int sum=0;

		while(arm>0) 
		{
			int digit=arm%10;
			sum=sum+(digit*digit*digit);
			arm=arm/10;

		}
		if(sum==original)
		{
			System.out.println(original+": "+"It is Armstrong");
		}


	}

}
