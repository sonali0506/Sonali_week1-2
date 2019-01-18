package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {  
			
		loginPOM.clickLoginBtn();
		loginPOM.clickregisterBtn();
		loginPOM.sendUserName("Durga");
		loginPOM.sendlastUserName123("Sen");
		loginPOM.sendemail1234("sen_sonali@yahoo.com");
		loginPOM.sendtel("24717587");
		loginPOM.sendaddress1("P-128, Senhati,Regent Park");
		loginPOM.sendaddress2("Tollygaunge");
		loginPOM.sendcity("Kolkata");
		loginPOM.sendpostalcode("700034");
		loginPOM.sendcountry();
		loginPOM.sendcstate();
		loginPOM.sendpwd("durga100@shiv");
		loginPOM.sendconpwd("durga100@shiv");
		loginPOM.sendradiobutton();
		
		loginPOM.sendcheckbox();
		loginPOM.sendclickContinueBtn();
		
	 
	/*String actual_msg = driver.findElement(By.xpath("//div[@id='System_nyHsmShk']/div/p")).getText();
		
		System.out.println(actual_msg );
		String expectedmsg="Thank you for your message. It has been sent.";

	*/
		
		
		
	
		
	          WebElement e = driver.findElement(By.xpath("//div[@id='System_nyHsmShk']/div/p"));
	          String act_msg = e.getText();
	          System.out.println(act_msg);
		
		String expected_msg="Congratulations! Your new account has been successfully created!";


        if(act_msg.equals(expected_msg))
        {
        	System.out.println("login successfull");
        }
        else
        {
        	System.out.println("login failed");
        }

	  assertEquals(act_msg,expected_msg);
		
	
		
		 
		screenShot.captureScreenShot("First");
	}
}
