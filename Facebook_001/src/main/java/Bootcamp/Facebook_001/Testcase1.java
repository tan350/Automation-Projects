package Bootcamp.Facebook_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		
		//2. Open this URL - www.amazon.in
		drive.get("https://www.amazon.in/");
		
		//3. Maximize or set size of browser window.
		drive.manage().window().maximize();
		
		//4. Get the page title and print it.
		String t1=drive.getTitle();
		System.out.println(t1);
		String ext="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		//5. Now, click on menu link say 'Amazon Pay' (or choose any other link from the menu list)
		WebElement m =drive.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
		m.click();
		Thread.sleep(300);
		
		//6. Get the page title and print it.
		String t2=drive.getTitle();
		System.out.println(t2);
		
		//7. Navigate back to Home Page.
		drive.navigate().back();
		Thread.sleep(300);
		
		//8. Get the page title and print it. Verify that value matches with output of point no. 4
		String t3=drive.getTitle();
		System.out.println(t3);
		if(t3.equalsIgnoreCase(t1))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
		//9. Close the browser.
		//drive.close();
		//drive.quit();
	}

}
