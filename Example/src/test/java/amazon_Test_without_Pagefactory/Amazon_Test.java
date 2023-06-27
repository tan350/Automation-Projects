package amazon_Test_without_Pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Amazon_Pages_without_Pagefactory.Amazon_Homepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Test {
	public static WebDriver drive;
	Amazon_Homepage  Ap;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		drive.get("https://www.amazon.in");
	}
	

	@Test
	public void ADD_Item_in_cart() throws InterruptedException
	{
		Ap=new Amazon_Homepage(drive);
		/*Ap.Searchitem("headphones");
		Thread.sleep(1000);
		Ap.Clicksearchbtn();
		Thread.sleep(1000);
		Ap.Click_item1();
		Thread.sleep(1000);
		Ap.add_item1();
		Thread.sleep(1000);
		Ap.close_item1();
		Thread.sleep(200);
		Ap.print_item1_price();
		Thread.sleep(1000);*/
		Ap.click_bestseller_button();
		Thread.sleep(200);
		Ap.click_item_2();
		Thread.sleep(200);
		Ap.add_item_2();
		Thread.sleep(200);
		Ap.click_item_3();
		Thread.sleep(200);
		Ap.add_item_3();
		Thread.sleep(200);
		Ap.print_cart_count();
		Thread.sleep(200);
		Ap.Click_on_cart();
		Thread.sleep(200);
		Ap.print_item2_price();
		Thread.sleep(200);
		Ap.print_item3_price();
		Thread.sleep(200);
		Ap.subtotal_cart();

	}

	@AfterClass
	public void Toclose()
	{
		drive.quit();
	}

}
