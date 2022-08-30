package Tests;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegPage;

public class LoginTest extends TestBase {

	HomePage homeObject ;
	LoginPage loginObject ;
	// this commment is made by PC 
	// PC 2
	
	@Test(priority = 1)
	public void openLoginPage( ) throws InterruptedException {
		
		homeObject = new HomePage(driver);
		//homeObject.openLoginPage();
		
		 driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

		loginObject = new LoginPage(driver) ;
		loginObject.UserLogin("mahmoud12345@gmail.com", "123456789");
		
	}


	@Test(priority = 2)
	public void LogResult () {
	
		loginObject = new LoginPage(driver) ; 
		loginObject.StoreLoginResult(LoginPage.LoginResult);
		Assert.assertTrue(LoginPage.LoginMessage.contains("Login was unsuccessful. Please correct the errors and try again."));
		
		
	}


	
}
