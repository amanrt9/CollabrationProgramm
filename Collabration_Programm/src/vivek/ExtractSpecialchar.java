package vivek;

public class ExtractSpecialchar 
{
public static void main(String[] args) {
	String s = "java @ lang";
	
	 String op ="";
	   
	   for(int i=0; i<s.length(); i++)
	   {
		   char c = s.charAt(i);
		  String str =  String.valueOf(c);
		   
		  if(!op.contains("\\W+"))
		  {
			 op+=str; 
		  }
		   
	   }
	   System.out.println(op);
}
}
