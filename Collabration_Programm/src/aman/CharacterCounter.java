package aman;

public class CharacterCounter {

	public static void main(String[] args) {
		String str="abcdeec";
		int count[]=new int[256];//assuming ascii values here

		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			count[c]++;//count[97]++ 

		}
		for(int i=0;i<256;i++) {
			if(count[i]>0)
			{
				System.out.println("'"+(char)i+"':"+count[i]);
			}

		}
	}}


