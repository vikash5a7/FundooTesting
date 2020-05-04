
package com.bridgelabz.testBase;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.bridgelabz.pageObjects.LoginPage;



public class TC_LoginTest_01 extends BaseClass {

	@Test
	public void Logintest() {
		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);
		lp.serEmailAddress(username);
		lp.setPassword(password);
		lp.clickSubmit();
		if (driver.getTitle().equals("FundooNotes")) {
			System.out.println("Title of " + driver.getTitle());
			Assert.assertTrue(true);
		}
		else { 
			System.out.println("Title of " + driver.getTitle());
			Assert.assertTrue(false);
		}

	}

}
