package Bootcamp.Facebook_001;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {
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

		//5. Count all menu link, say 'Amazon Pay', ‘Fashion’, ‘Best-Seller’, ‘Mobiles’ etc. available in header and footer section respectively.
		//6. Display the count of both on console.
		WebElement header= drive.findElement(By.id("navbar-main"));
		List<WebElement> links= header.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("The number of links in header section are: "+count);

		WebElement footer= drive.findElement(By.id("navFooter"));
		List<WebElement> l= footer.findElements(By.tagName("a"));
		int c=l.size();
		System.out.println("The number of links in footer section are: "+c);
		Thread.sleep(200);
		
		//7. Close the browser. 
		drive.close();
	}

}
