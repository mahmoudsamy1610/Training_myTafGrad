package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegPage;

public class RegTestPara extends TestBasePara { 
	

	public HomePage homeObject ;
	public RegPage RegObject ; 
	
	

	
	
	@Test(priority = 1)
	public void UserRegTest () throws InterruptedException {
		
		 homeObject = new HomePage (getDriver()) ;
		 homeObject.openRegPage();
		 
		 RegObject = new RegPage(getDriver()) ; 
		 RegObject.userREG("mahmoud", "samy", "mahmoud1335225345738866@gmail.com", "12345678");
		

		 
		  }
	

	@Test(priority = 2)
	public void Result () {
	
		RegObject = new RegPage(getDriver()) ; 
		RegObject.StoreResult(RegPage.ResponseMessage);
		
		
	}
	
		
	
	
	
}
