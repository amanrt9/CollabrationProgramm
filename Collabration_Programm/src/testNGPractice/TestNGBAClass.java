package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBAClass
{
	@BeforeClass
	  public void login()
	  {
		  System.out.println("login to website");
	  }
	  
	 @Test(priority=1)
	  public void search()
	  {
		System.out.println("search on webpage");  
	  }
	  
	  @Test(priority=2)
	  public void advsearch()
	  {
		System.out.println("adv search on webpage");  
	  }
	  
	  
	  @AfterClass
	  public void logout()
	  {
		  System.out.println("logout from website");
	  }
}
