package aman;

public class Palindrom2 {

	public static void main(String[] args) {
		int num=141415;
		int temp=num;
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Its Palindrome");
		}
		else {
			System.out.println("Its not Palindrome");
		}
	}

}
