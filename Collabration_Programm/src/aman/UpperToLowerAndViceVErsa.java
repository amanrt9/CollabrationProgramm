package aman;

public class UpperToLowerAndViceVErsa 
{ public static void main(String[] args) 
{
	String str="AaBbCc";
	//op=aAbBcC
    String res="";
	for(int i=0;i<str.length();i++) 
	{
		char c=str.charAt(i);
		res+=(i%2==0)?Character.toLowerCase(c):
		Character.toUpperCase(c);//its index of str if index is even its go to left And vice versa
		
		
	}
	System.out.println(res);
}

}
