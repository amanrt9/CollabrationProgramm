package testNGPractice;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class TestNGDependsOnMethod_2 
	{
		@Test( invocationCount = 2)
		void openapp()
		{
	      Assert.assertEquals(1,1); 
	      System.out.println("OpenApp");
		}

		@Test(dependsOnMethods = {"openapp"}, alwaysRun=true)
		void login()
		{
		      Assert.assertTrue(true);
		      System.out.println("login");

		}

		@Test(dependsOnMethods = {"login"})
		void search()
		{
		      Assert.assertTrue(true);
		      System.out.println("search");


		}
		
		@Test(dependsOnMethods = {"login", "search"})
		void advSearch()
		{
		      Assert.assertTrue(true);
		      System.out.println("advSearch");


		}

		@Test
		void logout()
		{
		      Assert.assertTrue(true);
		      System.out.println("logout");


		}
	}



