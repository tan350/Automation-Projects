package Pages_without_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {
	WebDriver drive;
	//WebDriverWait w1= new WebDriverWait(drive,Duration.ofSeconds(2));
	
	By uname= By.xpath("//input[@placeholder='Username']");
	By pass=By.xpath("//input[@placeholder='Password']");
	By loginbtn=By.xpath("//button[text()=' Login ']");
	By forgotpass=By.xpath("//div[@class='orangehrm-login-forgot']");
	By profile=By.xpath("//p[@class='oxd-userdropdown-name']");
	public Homepage(WebDriver drive)
	{
		this.drive=drive;
	}
	
	public void Typeuname(String user) throws InterruptedException
	{
		Thread.sleep(200);
	    //w1.until(ExpectedConditions.visibilityOf((WebElement) uname));
		drive.findElement(uname).sendKeys(user);
	}
	
	public void Typepass(String password) throws InterruptedException
	{
		Thread.sleep(200);
		//w1.until(ExpectedConditions.visibilityOf((WebElement) pass));
		drive.findElement(pass).sendKeys(password);
	}
	
	public void click_login() throws InterruptedException
	{
		Thread.sleep(200);
		//w1.until(ExpectedConditions.visibilityOf((WebElement) loginbtn));
		drive.findElement(loginbtn).click();
	}
	
	public Boolean profile_display() throws InterruptedException
	{
		Thread.sleep(200);
		//w1.until(ExpectedConditions.visibilityOf((WebElement) profile));
		return drive.findElement(profile).isDisplayed();
	}

}
