package Test_without_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages_without_Pagefactory.Homepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static WebDriver drive;
	Homepage Hp;

	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeoptions= new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		drive= new ChromeDriver(chromeoptions);
		drive.manage().window().maximize();
		Thread.sleep(200);
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(200);
	}

	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		Hp = new Homepage(drive);
		Thread.sleep(200);
		Hp.Typeuname("Admin");
		Thread.sleep(200);
		Hp.Typepass("admin123");
		Thread.sleep(200);
		Hp.click_login();
		Thread.sleep(800);
		Assert.assertTrue(Hp.profile_display());
	}

	@AfterClass
	public void close() {
		drive.close();
	}

}
