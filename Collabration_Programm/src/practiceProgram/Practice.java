package practiceProgram;

public class Practice
{
public static void main(String[] args) {
	String s = "AaBbCcDd";
	
	char[] a = s.toCharArray();
	
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>='A' && a[i]<='Z')
		{
			a[i]= (char)(a[i]+32);
		}
		else if(a[i]>='a' && a[i]<='z')
		{
			a[i]= (char)(a[i]-32);
		}
	}
	String res = new String(a);
	System.out.println(res);

}
}
