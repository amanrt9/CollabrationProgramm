package testNGgrouping;

import org.testng.annotations.Test;

public class GroupBySignUP 
{
  @Test(priority=1, groups= {"sanity"})
  void test_signupByEmail()
  {
	  System.out.println("sign up by email...");
  }
  
  @Test(priority=2,groups= {"sanity"})
  void test_signupByFB()
  {
	  System.out.println("sign up by FB...");
  }
  
  @Test(priority=3, groups= {"sanity"})
  void test_signupByTwitter()
  {
	  System.out.println("sign up by Twitter...");
  }
  
}
