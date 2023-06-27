package Alert_Popups_handling_Test_withPagefactory;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_dropdown_main_class {
	
	@Test
	public void Dynamicdropdown()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		//drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		drive.get("https://www.cleartrip.com/");

		WebElement From= drive.findElement(By.xpath("//input[@placeholder='Where from?']"));
		From.click();
		From.sendKeys("Delhi");
		//WebElement w1=drive.findElement(By.xpath("//input[@placeholder='From']"));
		//w1.sendKeys("Delhi");
		From.sendKeys(Keys.ARROW_DOWN);
		From.sendKeys(Keys.ENTER);
		System.out.println("Task Suceesfull");
	}

}
