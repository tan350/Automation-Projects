package Alert_Popups_handling_Test_withPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdemoqa_2 {
	
	@Test
	public void Test2()
	{
		//1.Launch the web browser and launch our practice page https://demoqa.com/menu/
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://demoqa.com/menu/");
		
		//2.Find the required element i.e. ‘Mainitem2’ object in our sample
		Actions act= new Actions(drive);
		WebElement Mainitem2=drive.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		//3.Now move the mouse on ‘Mainitem2’ option which will display the subsublist
		act.moveToElement(Mainitem2).perform();
		
		//4.Find the required element i.e. ‘SubSublist’ object in the Mainitem2 list
		WebElement Sublist=drive.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		//5.Move mouse on ‘Subsublist’ option which will display one more Subsubitem list
		act.moveToElement(Sublist).perform();
		
		//6.Find the required element i.e. ‘SubSubitem1’ object in subSubitem list
		WebElement SubSubitem=drive.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		act.moveToElement(SubSubitem).perform();
		
		//8.Close the browser to end the program
		drive.quit();
		
	}

}
