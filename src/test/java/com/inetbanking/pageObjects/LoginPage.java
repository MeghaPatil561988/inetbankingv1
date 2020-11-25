package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   WebDriver Idriver;

public LoginPage( WebDriver rdriver)
{
	PageFactory.initElements(rdriver,this);
}
   @FindBy(name="uid")
   @CacheLookup
   WebElement txtUserName;
   
   @FindBy(name="password")
   @CacheLookup
   WebElement txtPassword;
   
   @FindBy(name="btnLogin")
   @CacheLookup
   WebElement txtbtnLogin;
   
   @FindBy(xpath="//a[contains(text(),'Log out')]")
   @CacheLookup
   WebElement txtbtnLogout;
   
   public void setUserName(String uname)
   {
	   txtUserName.sendKeys(uname);
   }
   public void setPassword(String pwd)
   {
	   txtPassword.sendKeys(pwd);
   }
   public void clickSubmit() 
   {
	   txtbtnLogin.click();
   }
   public void clickLogOut()
   {
	   txtbtnLogout.click();
   }
}
