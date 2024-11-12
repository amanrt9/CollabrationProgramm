package vivek;

public class PalindromeString
{
 public static void main(String[] args)
 {
  String s = "viv";
  String reverse = "";
  for(int i=0; i<s.length(); i++)
  {
	  char c = s.charAt(i);
	  
	  reverse = c + reverse;
	  
  }
  System.out.println(reverse);
  if(reverse.equals(s))
  {
	  System.out.println("palindrome"); 
  }
  else
  {
	  System.out.println("not palindrome");
  }
}
 
}
