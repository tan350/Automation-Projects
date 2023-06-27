package Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio_Testbase {
	public static WebDriver drive;
	public static Properties prop;

	public static void initialization() throws IOException, InterruptedException
	{
		try
		{
			FileInputStream fs=new FileInputStream("D:\\workspace\\POM_EXAMPLE\\src\\test\\java\\Configurations\\Ajio_config.properties");
			prop=new Properties();
			prop.load(fs);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			//e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		drive.get(prop.getProperty("url"));
	}
	
	public static void Toclose()
	{
		drive.quit();
	}

}
