package Alert_Popups_handling_Pages_with_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Alert_popups_handling_TestBase_withpagefactory.IframeTestbase;

public class Iframepage extends IframeTestbase {
	@FindBy(xpath="//div[@class='example']")
	WebElement frameclass;
	
	@FindBy(xpath="//p[text()='Your content goes here.']")
	WebElement iframetext;
	@FindBy(xpath="//body[@id='tinymce']")
	WebElement addtext;

	public Iframepage()
	{
		PageFactory.initElements(drive, this);
	}
	
	public WebElement Frame_class()
	{
		return frameclass;
	}
	
	public WebElement iframe_text()
	{
		return iframetext;
	}
	
	public WebElement add_text()
	{
		return addtext;
	}
}
