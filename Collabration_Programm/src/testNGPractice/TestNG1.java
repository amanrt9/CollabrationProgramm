package testNGPractice;

import org.testng.annotations.Test;

public class TestNG1
{
  @Test(priority =2)
  public void chetan()
  {
	  System.out.println("this is first method");
  }
  
  @Test(priority =1)
  public void vivek()
  {
	  System.out.println("this is second method");
  }
  
  @Test(priority =33)
  public void aman()
  {
	  System.out.println("this is third method");
  }
}
