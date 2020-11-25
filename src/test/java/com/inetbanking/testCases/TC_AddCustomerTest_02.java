package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_02 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException 
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("User name is provided");
		
		lp.setPassword(password);
		logger.info("Passsword is provided");
		
        lp.clickSubmit();
		
		//Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		addcust.custName("Swapnil");
		addcust.custgender("female");
		addcust.custdob("Mar","10","1988");
		
		Thread.sleep(5000);
		
		addcust.custaddress("belgaum");
		addcust.custcity("bangalore");
		addcust.custstate("karnataka");
		addcust.custpinno("591216");
		addcust.custtelephoneno("7349701574");
		
		String email=randomeString()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("meghapatil");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		

		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
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

	
