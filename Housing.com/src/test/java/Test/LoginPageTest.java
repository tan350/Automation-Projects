package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Pages.LoginPage;
import TestBase.TestBaseHousing;

public class LoginPageTest extends TestBaseHousing {

	LoginPage loginpage;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		loginpage=new LoginPage();
	}

	@Test(priority = 1)
	public void login_with_valid_credentials() throws InterruptedException {
		loginpage.loginWithValidCredentials();
	}
	
	@Test(priority = 2)
	public void contactedProperties() throws InterruptedException {
		loginpage.contactedProperties();
	}
	
	@Test(priority = 3)
	public void seenProperties() throws InterruptedException {
		loginpage.seenProperties();
	}
	
	@Test(priority = 4)
	public void savedProperties() throws InterruptedException {
		loginpage.savedProperties();
	}
	
	@Test(priority = 5)
	public void savedSearch() throws InterruptedException {
		loginpage.savedSearch();
	}
	
	@Test(priority = 6)
	public void myTransactions() throws InterruptedException {
		loginpage.myTransactions();
	}
	
	@Test(priority = 7)
	public void quickLinksModule() throws InterruptedException {
		loginpage.quickLinks();
	}
	
	
	@Test(priority = 8)
	public void VerificationOfCountOfLinksInQuickLinksVerification() throws InterruptedException {
		loginpage.countLinksInQuickLinksVerification();
	}

	@Test(priority = 9)
	public void quickLinksHome() throws InterruptedException {
		loginpage.quickLinksHome();
	}
	
	@Test(priority = 10)
	public void quickLinksOwnerPackages() throws InterruptedException {
		loginpage.quickLinksOwnerPackages();
	}
	
	@Test(priority = 11)
	public void quickLinksPostProperties() throws InterruptedException {
		loginpage.quickLinksPostProperties();
	}
	
	@Test(priority = 12)
	public void quickLinksNews() throws InterruptedException {
		loginpage.quickLinksNews();
	}
	
	@Test(priority = 13)
	public void quickLinksHousingPremium() throws InterruptedException {
		loginpage.quickLinksHousingPremium();
	}
	
	@Test(priority = 14)
	public void housingEdgePayOnCredit() throws InterruptedException {
		loginpage.housingEdgePayOnCredit();
	}
	
	@Test(priority = 15)
	public void housingEdgePersonalLoans() throws InterruptedException {
		loginpage.housingEdgePersonalLoans();
	}
	
	@Test(priority = 16)
	public void housingEdgeQuickCash() throws InterruptedException {
		loginpage.housingEdgeQuickCash();
	}
	
	@Test(priority = 17)
	public void housingEdgeRentNowPayLater() throws InterruptedException {
		loginpage.housingEdgeRentNowPayLater();
	}
	
	@Test(priority = 18)
	public void housingEdgeRentAgreement() throws InterruptedException {
		loginpage.housingEdgeRentAgreement();
	}
	
	@Test(priority = 19)
	public void housingEdgeHomeLoans() throws InterruptedException {
		loginpage.housingEdgeHomeLoans();
	}
	
	@Test(priority = 20)
	public void housingEdgeHomeInteriors() throws InterruptedException {
		loginpage.housingEdgeHomeInteriors();
	}
	
	@Test(priority = 21)
	public void housingEdgePackersMovers() throws InterruptedException {
		loginpage.housingEdgePackersMovers();
	}
	
	@Test(priority = 22)
	public void housingEdgePropertyManagement() throws InterruptedException {
		loginpage.housingEdgePropertyManagement();
	}
	
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}

}
