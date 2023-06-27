package Bootcamp.Facebook_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase_scenerio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drive.manage().window().maximize();

		Thread.sleep(800);
		WebElement u= drive.findElement(By.xpath("//input[@name='username']"));
		u.sendKeys("Admin");
		
		WebElement w2= drive.findElement(By.xpath("//input[@name='password']"));
		w2.sendKeys("admin123");
		
		WebElement w3= drive.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		w3.click();


	}

}
