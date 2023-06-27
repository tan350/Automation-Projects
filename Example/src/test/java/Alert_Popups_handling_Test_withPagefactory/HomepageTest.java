package Alert_Popups_handling_Test_withPagefactory;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Alert_Popups_handling_Pages_with_pagefactory.Homepage;
import Alert_popups_handling_TestBase_withpagefactory.TestBase_alert;


public class HomepageTest extends TestBase_alert {

Homepage HP;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		initialization();
		HP= new Homepage();
	}
	
	@Test
	public void Clicksignin() throws InterruptedException
	{
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HP.signin_button().click();
		Alert alt=drive.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	

	
	@AfterSuite
	public void Close_quit()
	{
		Toclose();
	}

}
