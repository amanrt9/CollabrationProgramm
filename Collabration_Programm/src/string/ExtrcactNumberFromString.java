package string;

public class ExtrcactNumberFromString {
	public static void main(String[] args)
	{
       String str="I have 20 pens";
       String[] a=str.split(" ");
       int num=0;
       for(String x:a)
       {
    	   if(x.matches("\\d+"))
    	   {
    		   num=Integer.parseInt(x);
    	   }
       }
       System.out.println(num);
	}

}
