package Bootcamp.Facebook_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

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
				
				//5. Now, click on menu link say 'Amazon Pay' (or choose any other link from the menu list)
				WebElement a =drive.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
				a.click();
				Thread.sleep(200);
				
				//6. Get Page title and verify it with expected value.
				String t2=drive.getTitle();
				System.out.println(t2);
				if(t2.equalsIgnoreCase("Amazon Pay"))
					System.out.println("Title Matched");
				else
					System.out.println("Title didn't match");
				
				//7. Navigate back to Home Page.
				drive.navigate().back();
				Thread.sleep(200);
				
				//8.Get Page title and verify it with expected value.
				String t3=drive.getTitle();
				System.out.println(t3);
				if(t3.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
					System.out.println("Title Matched");
				else
					System.out.println("Title didn't match");
				
				//9. Repeat steps 5 to 8 for other menu links.
				
				//Amazon mini tv
				WebElement am =drive.findElement(By.linkText("Amazon miniTV"));
				am.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//Best Sellers
				WebElement bs =drive.findElement(By.linkText("Best Sellers"));
				bs.click();
				drive.navigate().back();
				Thread.sleep(200);
				//Mobiles
				WebElement m =drive.findElement(By.linkText("Mobiles"));
				m.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//Customer Service
				WebElement cs =drive.findElement(By.linkText("Customer Service"));
				cs.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//Today's Deals
				WebElement td =drive.findElement(By.linkText("Today's Deals"));
				td.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//Electronics
				WebElement e =drive.findElement(By.linkText("Electronics"));
				e.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//Prime
				WebElement p =drive.findElement(By.linkText("Prime"));
				p.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//New Releases
				WebElement nr =drive.findElement(By.linkText("New Releases"));
				nr.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//Home & kitchen
				WebElement hk =drive.findElement(By.linkText("Home & Kitchen"));
				hk.click();
				drive.navigate().back();
				Thread.sleep(200);
				
				//10. Close the browser.
				drive.close();
				drive.quit();
	}

}
