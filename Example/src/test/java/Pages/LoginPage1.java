package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Testbase1;

public class LoginPage1 extends Testbase1 {
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(css="input[name='password']")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginbtn;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	WebElement forgetpass; 
	
	/*@FindBy(xpath="//input[@placeholder='Username']")
	WebElement uname;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginbtn;
	
	//@FindBy(xpath="//p[text()='Forgot your password? ']")
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	WebElement forgetpass;*/
	
	public LoginPage1()
	{
		PageFactory.initElements(drive,this);
	}
	
	public WebElement username_element()
	{
		return uname;
	}
	
	public WebElement password_element()
	{
		return pass;
	}
	
	public WebElement login_button()
	{
		return loginbtn;
	}
	public WebElement forgot_button()
	{
		return forgetpass;
	}
	
}
