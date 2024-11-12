package aman;

public class Palindrome
{
	public static void main(String[] args) {
		String str="1440441";
		String res="";
		for(int i=0;i<str.length();i++)
		{
			res=str.charAt(i)+res;	 
		}
		if(str.equals(res))
		{
			System.out.println("Its palindrome");
		}
		else 
		{
			System.out.println("Its not palindrome");
		}

	}


}
