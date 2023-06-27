package Alert_Popups_handling_Pages_with_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Alert_popups_handling_TestBase_withpagefactory.TestBase_alert;

public class Homepage extends TestBase_alert{
	@FindBy(xpath="//input[@class='signinbtn']")
	WebElement signinbtn;
	
	public Homepage()
	{
		PageFactory.initElements(drive,this);
	}
	
	public WebElement signin_button()
	{
		return signinbtn;
	}

}
