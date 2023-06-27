package Bootcamp.Facebook_001;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_scenerio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1. Launch Chrome browser.
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();

		//2.Implicit wait global wait
		//drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//3. Open this URL - www.amazon.in
		drive.get("https://www.facebook.com/login/");

		//4. Maximize or set size of browser window.
		drive.manage().window().maximize();

		//5.explicit wait local wait
		//WebDriverWait class and ExpectedConditions Class
		//WebDriverWait objname= new WebDriverWait(driver, 5);
		//try {
			//WebDriverWait w= new WebDriverWait(drive,Duration.ofSeconds(3));
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forgotten account?")));
			//System.out.println("Forgotten account? button is Visible");

			WebElement w1= drive.findElement(By.xpath("//input[@id='email']"));
			w1.sendKeys("ts123@gmail.com");
			Thread.sleep(800);
			//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='pass']")));
			//System.out.println("Password textbox is Visible"+w);
			WebElement w2= drive.findElement(By.xpath("//input[@id='pass']"));
			w2.sendKeys("Tan@1234");
			Thread.sleep(800);
			//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='loginbutton']")));
			//System.out.println("Button is Visible"+w);
			WebElement w3= drive.findElement(By.xpath("//button[@id='loginbutton']"));
			w3.click();
			Thread.sleep(20000);

		//}
		//catch(Exception e) 
		//{
		//	System.out.println("Element is not visible");
		//}


		//7. Close the browser.
		drive.close();
	}

}
