package string;

public class NumberOfWordsInString {

	public static void main(String[] args) {
	String a="I have some work";
	int count=a.split(" ").length;
	System.out.println(count);
	

	}

}

 /*String str="I have some work";
   int count=0;
   String [] a=str.split(" ");
  for(String x:a)
  {
	  if(x.matches("\\w"))
	 {
		  count++;
	  }
  }
 System.out.println(count);
  }*/