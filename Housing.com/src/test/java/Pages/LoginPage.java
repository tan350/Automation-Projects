package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestBase.TestBaseHousing;

public class LoginPage extends TestBaseHousing {

	//locating WebElements
	@FindBy(xpath="//div[@data-q='side-menu']")
	WebElement loginSideMenu;

	@FindBy(xpath="//button[text()='Login']")
	WebElement loginButton;

	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement phoneNumber;

	@FindBy(xpath="//button[text()='Continue']")
	WebElement continueButton;

	@FindBy(xpath="//div[text()='8218098173']")
	WebElement mobileNumberProfile;

	@FindBy(xpath="//button[text()='Edit']")
	WebElement editButton;

	@FindBy(xpath="//div[text()='My Transactions']")
	WebElement myTransactions;

	@FindBy(xpath="//div[text()='Quick Links']")
	WebElement quickLinks;

	@FindBy(xpath="//div[text()='Home']")
	WebElement quickLinksHome;

	@FindBy(xpath="//a[@href='/owner-packages']")
	WebElement quickLinksOwnerPackages;

	@FindBy(xpath="//a[@href='/rent-sell-property']")
	WebElement quickLinksPostProperties;

	@FindBy(xpath="//div[text()='News']")
	WebElement quickLinksNews;

	@FindBy(xpath="//div[text()='Housing Premium']")
	WebElement quickLinksHousingPremium;

	@FindBy(xpath="//div[@class='css-1wqw7yt']//a")
	List<WebElement> linksInQuickLinks;

	@FindBy(xpath="//div[text()='Contacted Properties']")
	WebElement contactedProperties;

	@FindBy(xpath="//div[text()='Seen Properties']")
	WebElement seenProperties;

	@FindBy(xpath="//div[text()='Saved Properties']")
	WebElement savedProperties;

	@FindBy(xpath="//div[text()='Saved Search']")
	WebElement savedSearch;

	@FindBy(xpath="//button[text()='Login to  view your Recent Activity']")
	WebElement contactedPropertiesMessage;

	@FindBy(xpath="//button[text()='Start new search']")
	WebElement startNewSearch;

	@FindBy(xpath="//button[text()='Login to  save your Recent Activity']")
	WebElement savedPropertiesMessage;

	@FindBy(xpath="//button[text()='Login to view your Saved Searches']")
	WebElement savedSearchMessage;

	@FindBy(xpath="//div[text()='Housing Edge']")
	WebElement housingEdge;

	@FindBy(xpath="(//div[text()='Pay on Credit'])[1]")
	WebElement payOnCredit;

	@FindBy(xpath="//a[@href='/edge/personal-loan']")
	WebElement personalLoans;
	
	@FindBy(xpath="//div[text()='Personal Loan service is available only on housing app']")
	WebElement personalLoansMessage;

	@FindBy(xpath="(//div[text()='Quick Cash'])[1]")
	WebElement quickCash;
	
	@FindBy(xpath="//div[text()='Quick Cash service is available only on housing app']")
	WebElement quickCashMessage;

	@FindBy(xpath="//a[@href='https://housing.com/edge/rent-now-pay-later']")
	WebElement rentNowPayLater;
	
	@FindBy(xpath="//div[text()='Introducing Rent Now, Pay Later @ZERO Fees']")
	WebElement rentNowPayLaterMessage;

	@FindBy(xpath="(//div[text()='Rent Agreement'])[1]")
	WebElement rentAgreement;

	@FindBy(xpath="(//div[text()='Home Loans'])[1]")
	WebElement homeLoans;
	
	@FindBy(xpath="//a[@href='https://housing.com/edge/home-interiors']")
	WebElement homeInteriors;
	
	@FindBy(xpath="//a[@href='https://housing.com/edge/packers-and-movers']")
	WebElement packersMovers;
	
	@FindBy(xpath="(//div[text()='Property Management'])[1]")
	WebElement propertyManagement;

	//method for initializing objects using PageFactory
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}

	//methods
	public void enterPhoneNumber(String phonenumber){
		phoneNumber.sendKeys(phonenumber);
	}

	public void loginWithValidCredentials() throws InterruptedException {
		loginSideMenu.click();
		Thread.sleep(3000);
		loginButton.click();
		Thread.sleep(3000);
		enterPhoneNumber(properties.getProperty("PhoneNumber"));
		Thread.sleep(3000);
		continueButton.click();
		Thread.sleep(3000);
		//		Thread.sleep(10000);
		//		Assert.assertTrue(mobileNumberProfile.isDisplayed());
	}

	public void contactedProperties() throws InterruptedException {
		Thread.sleep(3000);
		contactedProperties.click();
		Thread.sleep(2000);
		Assert.assertTrue(contactedPropertiesMessage.isDisplayed());
	}

	public void seenProperties() throws InterruptedException {
		Thread.sleep(3000);
		seenProperties.click();
		Thread.sleep(2000);
		Assert.assertTrue(startNewSearch.isDisplayed());
	}

	public void savedProperties() throws InterruptedException {
		Thread.sleep(3000);
		savedProperties.click();
		Thread.sleep(2000);
		Assert.assertTrue(savedPropertiesMessage.isDisplayed());
	}

	public void savedSearch() throws InterruptedException {
		Thread.sleep(3000);
		savedSearch.click();
		Thread.sleep(2000);
		Assert.assertTrue(savedSearchMessage.isDisplayed());
	}

	public void myTransactions() throws InterruptedException {
		Thread.sleep(2000);
		myTransactions.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Real Estate in Chandigarh | Buy/Sell Property in Chandigarh | Housing.com");
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void quickLinks() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		quickLinks.click();
		Thread.sleep(2000);
		Assert.assertEquals(quickLinks.getText(),"Quick Links");
	}

	public void countLinksInQuickLinksVerification() throws InterruptedException {
		Thread.sleep(3000);
		int count=linksInQuickLinks.size();
		Thread.sleep(2000);
		Assert.assertEquals(count, 6);
	}

	public void quickLinksHome() throws InterruptedException {
		Thread.sleep(2000);
		quickLinksHome.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Real Estate in Chandigarh | Buy/Sell Property in Chandigarh | Housing.com");
	}

	public void quickLinksOwnerPackages() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		quickLinks.click();
		Thread.sleep(3000);
		quickLinksOwnerPackages.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Real Estate in India | Rent Property in India | Housing.com");
		driver.navigate().back();
	}

	public void quickLinksPostProperties() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		quickLinks.click();
		Thread.sleep(3000);
		quickLinksPostProperties.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"List Property Ad for Free - Rent / Sell Property Online - Housing.com");
	}

	public void quickLinksNews() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		quickLinks.click();
		Thread.sleep(3000);
		quickLinksNews.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Latest Real Estate News, Industry Updates, Interviews & Property Insights - Housing.com");
		driver.navigate().back();
	}

	public void quickLinksHousingPremium() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		quickLinks.click();
		Thread.sleep(3000);
		quickLinksHousingPremium.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Housing Premium | Contact directly verified owners and save thousands on brokerage");
		driver.navigate().back();
	}

	public void editProfileRedirection() throws InterruptedException {
		Thread.sleep(3000);
		editButton.click();
	}

	public void housingEdgePayOnCredit() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		quickLinks.click();
		Thread.sleep(3000);
		quickLinksHome.click();
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		payOnCredit.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Pay Rent with Credit Card | Get Exciting Rewards by Paying Rent Online");
		driver.navigate().back();
	}
	
	public void housingEdgePersonalLoans() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		personalLoans.click();
		Thread.sleep(3000);
		Assert.assertTrue(personalLoansMessage.isDisplayed());
		driver.navigate().back();
	}
	
	public void housingEdgeQuickCash() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		quickCash.click();
		Thread.sleep(3000);
		Assert.assertTrue(quickCashMessage.isDisplayed());
		driver.navigate().back();
	}
	
	public void housingEdgeRentNowPayLater() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		rentNowPayLater.click();
		Thread.sleep(3000);
		Assert.assertTrue(rentNowPayLaterMessage.isDisplayed());
		driver.navigate().back();
	}
	
	public void housingEdgeRentAgreement() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		rentAgreement.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Rent Agreement Online - Lowest Price Guaranteed for Rent Agreement");
		driver.navigate().back();
	}
	
	public void housingEdgeHomeLoans() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		homeLoans.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Home Loan - Apply Housing Loan Online @ 6.65% Interest Rate, Lowest EMI");
		driver.navigate().back();
	}
	
	public void housingEdgeHomeInteriors() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		homeInteriors.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Dream Home Interior Design Solutions | Book Online Consultation | Housing.com");
		driver.navigate().back();
	}
	
	public void housingEdgePackersMovers() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		packersMovers.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Packers and Movers - Best Packers and Movers Services Online in India");
		driver.navigate().back();
	}
	
	public void housingEdgePropertyManagement() throws InterruptedException {
		Thread.sleep(3000);
		loginSideMenu.click();
		Thread.sleep(3000);
		housingEdge.click();
		Thread.sleep(3000);
		propertyManagement.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "End to End Property Management Services for Landlords | Housing.com");
		driver.navigate().back();
	}

}
