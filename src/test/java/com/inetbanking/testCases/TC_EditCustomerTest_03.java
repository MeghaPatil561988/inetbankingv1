package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomer;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_03 extends BaseClass
{
	@Test
	public void editCustomer() throws InterruptedException, IOException
	{
        LoginPage lp1=new LoginPage(driver);
		
		lp1.setUserName(username);
		logger.info("User name is provided");
		
		lp1.setPassword(password);
		logger.info("Passsword is provided");
		
        lp1.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomer editcust = new EditCustomer(driver);
		editcust.clickEditCustomer();
		
		logger.info("providing edit customer details....");
		editcust.clickReset();
		
		editcust.custID("47133");
		Thread.sleep(3000);
		
		editcust.clickSubmit();
		Thread.sleep(3000);
		

		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Edit Customer Form");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
}
