package vivek;

public class PrimeNumber
{
public static void main(String[] args)
{
  int num = 5;
  
  
  int temp =0;
  for(int i=1; i<=num; i++)
  {
	 if(num%i==0)
	 {
		 temp++;
	 }
  }
  if(temp==2)//here we take 2 becoz the temp is increasing 2 times becoz prime no is divisible by 1 and itself
  {
	  System.out.println("prime");
  }
  else
  {
	  System.out.println("not prime");
  }

}
}
