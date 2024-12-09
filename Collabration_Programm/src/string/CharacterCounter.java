package string;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterCounter {

	public static void main(String[] args)
	{

		String str="AMAN";
		
		int count[]=new int[256];

		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			count[c]++;
		}
		for(int i=0;i<256;i++)
		{
			if(count[i]>0)
	    	System.out.println((char)i+":"+count[i]);
		}




	}

}
