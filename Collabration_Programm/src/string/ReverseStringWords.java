package string;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Aman";
		String a="";
		String [] b=str.split(" ");
		for(String x:b)
		{
			for(int i=x.length()-1;i>=0;i--)
			{
				char ch=x.charAt(i);
				a+=ch;

			}
			a=a+" ";
		}
		System.out.println(a);

	}

}
