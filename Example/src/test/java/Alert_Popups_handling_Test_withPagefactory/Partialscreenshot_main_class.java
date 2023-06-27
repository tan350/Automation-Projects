package Alert_Popups_handling_Test_withPagefactory;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Partialscreenshot_main_class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://uidai.gov.in/");
		WebElement l=drive.findElement(By.xpath("//div[@class='top1 col-sm-12']"));
		TakesScreenshot s=(TakesScreenshot)drive;
		File f=s.getScreenshotAs(OutputType.FILE);
		BufferedImage b1=ImageIO.read(f);
		Point location=l.getLocation();
		
		int w=l.getSize().getWidth();
		int h=l.getSize().getHeight();
		BufferedImage bimage=b1.getSubimage(location.getX(), location.getY(), w, h);
		ImageIO.write(bimage, "png", f);
		FileUtils.copyFile(f, new File("C:\\Users\\tasharma\\Pictures\\Screenshots\\aadhar.png") );
		System.out.println("Partial Screenshot captured successfully.");
		drive.quit();

	}

}
