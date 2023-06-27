package Alert_Popups_handling_Test_withPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://the-internet.herokuapp.com/dropdown");
		Select s=new Select(drive.findElement(By.id("dropdown")));
		//s.selectByIndex(1);
		//s.selectByValue("1");
		s.selectByVisibleText("Option 2");
		System.out.println("Static drop down handling.");
		drive.quit();
	}

}
