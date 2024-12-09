package string;

public class StringEquals {

	public static void main(String[] args)
	{
		String s="Aman";
		String p="Pranav";//make a string by litrel
		String p2="Pranav";
		String p4="Pranav";
		String s4="Aman";


		String s1=new String("Aman");
		String p1=new String("Pranav");//make a string by new keyword
		String p3=new String("Pranav");
		String s2=new String("Aman");
		
		String x=new String("Ashish"); // 2object one in heap one in string pool
		String x1="Ashish";
		String x2="Ashish";
		
		

		System.out.println(s);
		System.out.println(p);
		System.out.println(s1);
		System.out.println(p1);

		if(x.equals(p1))
		{
			System.out.println("it is equal");
		}
		else {
			System.out.println("false");
		}
		//== compare the referance of string but equals method check only the data

		
		
		

	}

}
