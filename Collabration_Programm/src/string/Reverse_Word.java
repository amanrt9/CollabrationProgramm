package string;

public class Reverse_Word {

	public static void main(String[] args) 
	{
		String str="My Name is Aman";
		String n="";
		
		String s[]= str.split(" "); 
		for(String x:s)
		{
			for(int i=x.length()-1;i>=0;i--)
			{
				n=n+x.charAt(i);
			}
	        n=n+" ";
		}
		System.out.println(n);

	}

}
