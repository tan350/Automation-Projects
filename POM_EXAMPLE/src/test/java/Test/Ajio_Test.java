package Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Ajio_homepage;
import Testbase.Ajio_Testbase;

public class Ajio_Test extends Ajio_Testbase {
	Ajio_homepage Ap;
	
	@BeforeSuite
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		Ap=new Ajio_homepage();
	}
	
	@Test
	public void add_itemcart() 
	{
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Ap.click_image1().click();
		Ap.click_image2().click();
		Ap.click_size().click();
		Ap.add_item1().click();
		Ap.click_gotobag().click();
	}
	
	@AfterSuite
	public void terminate()
	{
		Toclose();
	}

}
