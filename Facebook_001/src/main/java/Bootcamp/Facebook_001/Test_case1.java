package Bootcamp.Facebook_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Open the browser of your choice, such as IE, Ms Edge, Firefox or Chrome.
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		
		//2. Go to this website's URL- https://www.flipkart.com/
		drive.get("https://www.flipkart.com/");
		
		//3.Maximize the browser window.
		drive.manage().window().maximize();
		
		//4.Exit the browser.
		drive.close();	
	}
}