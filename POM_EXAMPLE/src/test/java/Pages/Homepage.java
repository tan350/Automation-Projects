package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Home_Testbase;

public class Homepage extends Home_Testbase {
	@FindBy(xpath="//a[@class='navbar-brand nav-logo']")
	WebElement logo;
	
	@FindBy(xpath="//input[@id='Form_getForm_Email']")
	WebElement emailtextbox;
	
	@FindBy(xpath="//a[text()='Platform']")
	WebElement platform;
	
	@FindBy(xpath="//a[text()='Why OrangeHRM']")
	WebElement whyorangehrm;
	
	@FindBy(xpath="//a[text()='Resources']")
	WebElement resources;
	
	@FindBy(xpath="//a[text()='Company']")
	WebElement company;
	
	public Homepage()
	{
		PageFactory.initElements(drive,this);
	}
	
	public WebElement logo()
	{
		return logo;
	}
	
	public WebElement email()
	{
		return emailtextbox;
	}
	
	public WebElement platform()
	{
		return platform;
	}
	
	public WebElement Whyorangehrm()
	{
		return whyorangehrm;
	}
	
	public WebElement Resources()
	{
		return resources;
	}
	
	public WebElement Company()
	{
		return company;
	}

}
