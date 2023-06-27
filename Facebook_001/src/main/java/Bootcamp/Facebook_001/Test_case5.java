package Bootcamp.Facebook_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Launch browser of your choice say., Firefox, Chrome etc.
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();

		//2. Open this URL - https://www.flipkart.com/
		drive.get("https://www.flipkart.com/");

		//3. Maximize or set size of browser window
		drive.manage().window().maximize();

		//4. Get Title of page and validate it with expected value.
		if(drive.getTitle().contains("Online Shopping"))
			System.out.println("Title match");
		else
			System.out.println("Title didn't match");
		
		//5. Get URL of current page and validate it with expected value.
		String u=drive.getCurrentUrl();
		String eu="https://www.flipkart.com/";
		if(drive.getCurrentUrl().contains("https://www.flipkart.com/"))
			System.out.println("Url match");
		else
			System.out.println("Url didn't match");
		
		//6. Get Page source of web page.
		System.out.println(drive.getPageSource());
		
		//7. And Validate that page title is present in page source.
		if(drive.getPageSource().contains(" \"url\": \"http://www.flipkart.com/\","))
			System.out.println("page title is present in page source.");
		else
			System.out.println("page title is not present in page source.");
		
		//8. Close browser.
		drive.close();
	}

}
