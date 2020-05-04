/**
 * 
 */
package com.bridgelabz.testBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.bridgelabz.utilities.ReadConfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {

	ReadConfig readConfig=new ReadConfig();
	
	public String baseURL = readConfig.getApplicationURL();
	public String username = readConfig.getEmail();
	public String password = readConfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		driver = new ChromeDriver();
		logger = Logger.getLogger("Fundoo Notes");
		PropertyConfigurator.configure("Log4j.properties");
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
