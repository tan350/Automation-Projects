package Bootcamp.Facebook_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drive.manage().window().maximize();
		
		WebElement w1= drive.findElement(By.xpath("//button[contains(@class,'login')]"));
		w1.click();

		drive.close();
	}

}
