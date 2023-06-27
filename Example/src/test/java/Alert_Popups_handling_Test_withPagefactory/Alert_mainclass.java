package Alert_Popups_handling_Test_withPagefactory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_mainclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Screenshots
		TakesScreenshot s_obj=(TakesScreenshot)drive;
		File f_obj=s_obj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(f_obj,new File("C:\\Users\\tasharma\\Pictures\\Screenshots") , false);
		//FileUtils.copyFile(f_obj, new File("C:\\Users\\tasharma\\Pictures\\Screenshots"));
		
		//Alert handling
		drive.findElement(By.xpath("//input[@class='signinbtn']")).click();
		Alert alt=drive.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		drive.close();
	}

}
