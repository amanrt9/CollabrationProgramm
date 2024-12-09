package string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str= "abccd";
		String op="";
		for(int i=0;i<str.length();i++)
		{  
			char c=str.charAt(i);
		    String s=String.valueOf(c);  //for converting char to string becoz we compare here with string op in if() condition
			if(!op.contains(s))          // here we check that op has no same value in given string s
			{
				
				op=op+c;                 // concat it with value that is not duplicate
				
			}
			
		}
		System.out.println(op);

	}

}
