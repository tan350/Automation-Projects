package Alert_Popups_handling_Test_withPagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("http://the-internet.herokuapp.com/iframe");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		drive.switchTo().frame("mce_0_ifr");
		System.out.println(drive.findElement(By.xpath("//p[text()='Your content goes here.']")).getText());
		drive.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("This is Tanuja Sharma");
		System.out.println(drive.findElement(By.xpath("//body[@id='tinymce']")).getText());
		drive.quit();

	}

}
