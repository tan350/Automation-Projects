package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseHousing {
	
	public static WebDriver driver;
	public static Properties properties;

	
	public static void initialization() throws IOException, InterruptedException{
		try{
			FileInputStream fs=new FileInputStream("D:\\workspace\\Housing.com\\src\\test\\java\\ConfigurationsHousing\\Config.properties");
			properties=new Properties();
			properties.load(fs);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}

		String browser="chrome";
		
		if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeoptions= new ChromeOptions();
			chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			driver= new ChromeDriver(chromeoptions);
		}
		
		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void Toclose(){
		driver.quit();
	}

}
