package Bootcamp.Facebook_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_scenerio1 {
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
		//WebDriverWait w= new WebDriverWait(drive,Duration.ofSeconds(1));
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input#email")));

		WebElement w1= drive.findElement(By.cssSelector("input#email"));
		w1.sendKeys("ts123@gmail.com");
		Thread.sleep(300);

		WebElement w2= drive.findElement(By.cssSelector("input#pass"));
		w2.sendKeys("Tan@1234");

		WebElement w3= drive.findElement(By.cssSelector("button#loginbutton"));
		w3.click();


	}

}
