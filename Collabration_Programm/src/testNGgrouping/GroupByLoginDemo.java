package testNGgrouping;

import org.testng.annotations.Test;

public class GroupByLoginDemo
{

	 @Test(priority=1, groups= {"regression"})
	  void test_loginByEmail()
	  {
		  System.out.println("login by email...");
	  }
	  
	  @Test(priority=2,groups= {"regression"})
	  void test_loginByFB()
	  {
		  System.out.println("login by FB...");
	  }
	  
	  @Test(priority=3, groups= {"regression"})
	  void test_loginByTwitter()
	  {
		  System.out.println("login by Twitter...");
	  }	
	
}
