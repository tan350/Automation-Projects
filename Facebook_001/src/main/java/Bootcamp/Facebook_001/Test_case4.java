package Bootcamp.Facebook_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch browser of your choice say., Firefox, Chrome etc.
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				WebDriver drive= new ChromeDriver();
				
				//2. Open this URL - https://www.flipkart.com/
				drive.get("https://www.flipkart.com/");
				
				//3.Maximize or set size of browser window.
				drive.manage().window().maximize();
				
				//4. Get Page source and print it.
				System.out.println(drive.getPageSource());
				
				//5.Close browser.
				drive.close();	
	}

}
