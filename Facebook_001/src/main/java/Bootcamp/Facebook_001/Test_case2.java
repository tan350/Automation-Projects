package Bootcamp.Facebook_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//1. Launch browser of your choice say., Firefox, Chrome etc.
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver drive= new ChromeDriver();
			
			//2. Open this URL - hhttps://www.flipkart.com/
			drive.get("https://www.flipkart.com/");
			
			//3.Maximize or set size of browser window.
			drive.manage().window().maximize();
			
			//4. Get Title of page and print it.
			System.out.println(drive.getTitle());
			
			//5.Exit the browser.
			drive.close();	
	}

}
