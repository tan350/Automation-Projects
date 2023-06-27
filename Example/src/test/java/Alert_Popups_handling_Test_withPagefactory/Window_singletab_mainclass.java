package Alert_Popups_handling_Test_withPagefactory;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Window_singletab_mainclass {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Abha_Rathour\\Downloads\\ExtractedFiles\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		drive.get("https://mail.rediff.com/cgi-bin/login.cgi");

		drive.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");

		Set <String> windowHandles = drive.getWindowHandles();

		System.out.println(windowHandles.size());

		for(String winHandle : drive.getWindowHandles()){

			drive.switchTo().window(winHandle);

		}

		drive.navigate().to("http://www.google.com");

	}

}
