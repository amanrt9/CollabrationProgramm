package vivek;

public class RemoveDuplicateChar 
{
public static void main(String[] args)
{
   String s = "aabbccdd";	
   String op ="";
   
   for(int i=0; i<s.length(); i++)
   {
	   char c = s.charAt(i);
	  String str =  String.valueOf(c);
	   
	  if(!op.contains(str))
	  {
		 op+=str; 
	  }
	   
   }
   System.out.println(op);
}
}
