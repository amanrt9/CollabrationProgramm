package testNGgrouping;

import org.testng.annotations.Test;

public class GroupByPayment 
{
   @Test(priority=1, groups = {"sanity", "regression", "functional"})
   void paymentInRupees()
   {
	   System.out.println("Pay in rupees");
   }
   
   @Test(priority=2, groups = {"sanity", "regression", "functional"})
   void paymentInDoller()
   {
	   System.out.println("pay in doller");
   }
}
