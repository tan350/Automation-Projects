package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Homepage;
import Testbase.Home_Testbase;

public class HomeTest extends Home_Testbase{
Homepage Hp;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		initialization();
		Hp= new Homepage();
	}
	
	
	@Test
	public void logo_visible()
	{
		System.out.println(Hp.logo().isDisplayed());
	}
	
	@Test
	public void Email_enter_text() throws InterruptedException
	{
		Hp.email().sendKeys("Ts123@gmail.com");
		Thread.sleep(200);
	}
	
	@Test
	public void platform_click() throws InterruptedException
	{
		Hp.platform().click();
		Thread.sleep(200);
	}
	
	@Test
	public void whyorangehrm_click() throws InterruptedException
	{
		Hp.Whyorangehrm().click();
		Thread.sleep(200);
	}
	
	@Test
	public void Resources_click() throws InterruptedException
	{
		Hp.Resources().click();
		Thread.sleep(200);
	}
	
	@Test
	public void Company_click() throws InterruptedException
	{
		Hp.Company().click();
		Thread.sleep(200);
	}
	
	
	@AfterSuite
	public void Close_quit()
	{
		Toclose();
	}

}
