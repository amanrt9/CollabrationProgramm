package vivek;

public class LeapYearProgra
{
 public static void main(String[] args) 
 {
  int year = 1800;
  
  if(year%400==0)
  {
	  System.out.println("its leap year");
  }
  else if(year%100==0)
  {
	  System.out.println("its not leap year");
  }
  else if(year%4==0)
  {
	  System.out.println("its leap year");
  }
  else
  {
	  System.out.println("its not leap year");
  }
}
}
