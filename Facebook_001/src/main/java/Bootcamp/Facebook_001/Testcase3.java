package Bootcamp.Facebook_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

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
		
		//5. Open all menu link, say 'Amazon Pay', ‘Fashion’, ‘Best-Seller’, ‘Mobiles’ etc. in seperate tabs
		WebElement a =drive.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
		String k=Keys.chord(Keys.CONTROL,Keys.ENTER);
		a.sendKeys(k);
		Thread.sleep(500);
		//drive.navigate().back();

		//Amazon mini tv
		WebElement am =drive.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav']"));
		am.sendKeys(k);
		Thread.sleep(500);
		
		//Best Sellers
		WebElement bs =drive.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		bs.sendKeys(k);
		Thread.sleep(500);

		
		//Mobiles
		WebElement m =drive.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		m.sendKeys(k);
		Thread.sleep(800);
		
		
        
		//6. Close the browser.
		drive.close();
		Thread.sleep(1000);
		drive.quit();

	}

}
