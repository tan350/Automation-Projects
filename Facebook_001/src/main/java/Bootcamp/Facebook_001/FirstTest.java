package Bootcamp.Facebook_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//1.Initializing browser driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		//2.Driver object
		//ChromeOptions chromeOptions=new ChromeOptions();
		//chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		WebDriver drive= new ChromeDriver();

		//3.Uri visit
		drive.manage().window().maximize();
		drive.get("https://www.amazon.in/");
		drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mouse");
		Thread.sleep(800);
		drive.close();
		//4.Print title of page
		// System.out.println(drive.getTitle());

	}

}
