package aman;

public class SumofDigit {
public static void main(String[] args) {
	int num=499999993;
	int sum=0;
	while(num>0)
	{
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
		
	}
	System.out.println(sum);
}
}