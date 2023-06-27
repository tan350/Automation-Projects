package Alert_Popups_handling_Test_withPagefactory;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Alert_Popups_handling_Pages_with_pagefactory.Iframepage;
import Alert_popups_handling_TestBase_withpagefactory.IframeTestbase;

public class IframeTest extends IframeTestbase {

	Iframepage Ip;
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		initialization();
		Ip= new Iframepage();
	}
	
	@Test
	public void Clicksignin() throws InterruptedException
	{
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Ip.Frame_class().click();
		drive.switchTo().frame("mce_0_ifr");
		System.out.println(Ip.iframe_text().getText());
		Ip.add_text().sendKeys("Tanuja Sharma");
		System.out.println(Ip.add_text().getText());
		
	}

	
	@AfterSuite
	public void Close_quit()
	{
		Toclose();
	}
	
}
