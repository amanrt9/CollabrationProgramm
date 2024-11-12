package chetan;

public class sumoftwonofromstring
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i have 10 pens and 20 books";
		int sum=0;
		int num=0;
		 String [] c=s.split(" ");
		 for(String x:c)
		 {
		 if(x.matches("[0-9]+")) {
			 num=Integer.parseInt(x);
			 sum=sum+num;
		 }
		 }
		 System.out.println(sum);
		 
		      
		 

	}

}
