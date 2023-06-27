package Amazon_Pages_without_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_Homepage {
	
	WebDriver drive;
	
	By searchbox=By.id("twotabsearchtextbox");
	By searchbtn=By.id("nav-search-submit-button");
	By clickitem1=By.xpath("//img[@alt='Sponsored Ad - boAt Rockerz 550 Bluetooth Wireless Over Ear Headphones with Mic Upto 20 Hours Playback, 50MM Drivers, Soft...']");
	By additem1=By.xpath("//input[@id='add-to-cart-button']");
	By closeitem1=By.xpath("//a[@id='attach-close_sideSheet-link']");
	By clickbestsell=By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']");
	By clickitem2=By.xpath("//img[@alt='Sony PS5 PlayStation Console']");
	By additem2=By.xpath("//input[@name='submit.add-to-cart']");
	By clickitem3=By.xpath("//img[@alt='A1GRAPHIX Ps5 Skin Protector for PS5 Playstation Console Wrap Sticker Skin with 2 Wireless Controller Decal Sticker']");
	By additem3=By.xpath("//input[@id='add-to-cart-button']");
	By cartcount=By.xpath("//span[@id='nav-cart-count']");
	By clickcart=By.xpath("//a[@id='nav-cart']");
	By prod1price=By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']");
	By prod2price=By.xpath("//span[text()='49,990.00']");
	By prod3price=By.xpath("//span[text()='599.00']");
	By subtotalcart=By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']");
	
	public Amazon_Homepage(WebDriver drive)
	{
		this.drive=drive;
	}
	
	public void Searchitem(String item) throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(searchbox).sendKeys(item);
	}
	
	public void Clicksearchbtn() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(searchbtn).click();
	}
	
	public void Click_item1() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(clickitem1).click();
	}
	
	public void add_item1() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(additem1).click();
	}
	
	public void close_item1() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(closeitem1).click();
	}
	
	public void click_bestseller_button() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(clickbestsell).click();
	}
	
	public void click_item_2() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(clickitem2).click();
	}
	
	public void add_item_2() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(additem2).click();
	}
	
	public void click_item_3() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(clickitem3).click();
	}
	
	public void add_item_3() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(additem3).click();
	}
	
	
	public void print_cart_count() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("The item in the cart: "+drive.findElement(cartcount).getText());
	}
	
	public void Click_on_cart() throws InterruptedException
	{
		Thread.sleep(1000);
		drive.findElement(clickcart).click();
	}
	
	public void print_item1_price() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("The product price: "+drive.findElement(prod1price).getText());
	}
	
	public void print_item2_price() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("The product price: "+drive.findElement(prod2price).getText());
	}
	
	public void print_item3_price() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("The product price: "+drive.findElement(prod3price).getText());
	}
	
	public void subtotal_cart() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("The subtotal: "+drive.findElement(subtotalcart).getText());
	}
}
