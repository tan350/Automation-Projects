package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Ajio_Testbase;

public class Ajio_homepage extends Ajio_Testbase {
	
	@FindBy(xpath="//a[@href='/c/footwear-5016-29631']")
	WebElement Clickimage1;
	
	@FindBy(xpath="//h1[text()='Open-Toe Flat Sandals with Metal Accent ']")
	WebElement Clickimage2;
	
	@FindBy(xpath="//span[text()='7']")
	WebElement Clicksize;
	
	@FindBy(xpath="//span[text()='ADD TO BAG']")
	WebElement additem1;
	
	@FindBy(xpath="//span[text()='GO TO BAG']")
	WebElement clickgotobag;
	
	
	public Ajio_homepage()
	{
		PageFactory.initElements(drive, this);
	}
	
	public WebElement click_image1()
	{
		return Clickimage1;
	}
	
	public WebElement click_image2()
	{
		return Clickimage2;
	}
	
	public WebElement click_size()
	{
		return Clicksize;
	}
	
	public WebElement add_item1()
	{
		return additem1;
	}
	
	public WebElement click_gotobag()
	{
		return clickgotobag;
	}

}
