
package com.bridgelabz.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bridgelabz.pageObjects.LoginPage;



public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void Logintest() {
		driver.get(baseURL);
		logger.info("Url is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.serEmailAddress(username);
		
		logger.info("Entered email ");
		lp.setPassword(password);
		
		logger.info("Entered password ");
		lp.clickSubmit();
		if (driver.getTitle().equals("FundooNotes")) {
			logger.info("Login test passed..");
			Assert.assertTrue(true);
		}
		else { 
			logger.info("Login test failed..");
			Assert.assertTrue(false);
		}
	}
}
