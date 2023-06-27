package Alert_Popups_handling_Test_withPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdemoqa_mainclass {

	@Test
	public  void Test1() {
		// TODO Auto-generated method stub
		//1.Launch the web browser and launch our practice page https://demoqa.com/slider/
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://demoqa.com/slider/");
		//drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//2.Find the required element i.e. Slider object in our sample
		Actions act=new Actions(drive);
		WebElement slider = drive.findElement(By.id("sliderContainer"));
		
		//3.Now specify x and y offset to move the mouse in the horizontal and vertical direction from top-left of the slider element
		//4.Move mouse on specified offset on the slider
		act.moveToElement(slider,90,0).perform();
		
		//5.Click on the slider
    	slider.click();
    	
    	//6.Close the browser to end the program
    	drive.quit();
    	
	}

}
