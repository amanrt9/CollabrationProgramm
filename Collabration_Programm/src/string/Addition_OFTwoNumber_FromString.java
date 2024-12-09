package string;

public class Addition_OFTwoNumber_FromString {

	public static void main(String[] args) {
		String str="i have 10 pens and 20 Books";
		 String str1[]= str.split(" ");
		 int sum=0;
		 int num=0;
		for(String x:str1)
		{
			if(x.matches("[0-9]+")) {
				num=Integer.parseInt(x);
				sum=sum+num;
				
			}
			
		}
		System.out.println(sum);

	}

}
