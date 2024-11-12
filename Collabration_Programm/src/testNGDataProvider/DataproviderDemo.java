package testNGDataProvider;
/*
 * Attritube of @Test =
 *                     1. dependsOnMethod
 *                     2. priority
 *                     3. invocation count
 *                     4. timeout
 *                     5. dataprovider
 *                     6. enables
 *                     7. alwaysRun 
 * 
 * 
 * 
 * */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider= "data")
	public void login(String user, String pass)
	{
     driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
     driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@AfterClass
	public void teardown()
	{
      driver.quit();
	}
    
	@DataProvider(name= "data", indices= {0})
	Object testdata()
	{
	      Object[][]data= {{"standard_user", "secret_sauce"},
		                   {"problem_user", "secret_sauce"},
		                   {"vivek_user", "secret_sauce"},
		                   };
		return data;
	}

}
