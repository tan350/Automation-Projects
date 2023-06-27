package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage1;
import Testbase.Testbase1;


public class LoginTest extends Testbase1 {
	LoginPage1 Lt;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		Thread.sleep(200);
		initialization();
		Thread.sleep(200);
		Lt= new LoginPage1();
	}
	
	@Test
	public void valid_credentials_login() throws InterruptedException
	{
		Thread.sleep(200);
		Lt.username_element().sendKeys(prop.getProperty("uname"));
		Thread.sleep(200);
		Lt.password_element().sendKeys(prop.getProperty("pass"));
		Thread.sleep(200);
		Lt.login_button().click();
		Thread.sleep(200);
	}
	
	@Test(enabled=false)
	public void invalid_credentials_login() throws InterruptedException
	{
		Thread.sleep(200);
		Lt.username_element().sendKeys(prop.getProperty("uname1"));
		Thread.sleep(200);
		Lt.password_element().sendKeys(prop.getProperty("pass1"));
		Thread.sleep(200);
		Lt.login_button().click();
		Thread.sleep(200);
	}
	
	@Test(enabled=false)
	public void reset_password()
	{
		Lt.forgot_button().click();
	}
	
	@AfterSuite
	public void Close_quit()
	{
		Toclose();
	}
}
