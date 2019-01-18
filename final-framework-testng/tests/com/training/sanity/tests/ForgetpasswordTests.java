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
import com.training.pom.AccountopenPOM;
import com.training.pom.ForgetpasswordPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ForgetpasswordTests {

	private WebDriver driver;
	private String baseUrl;
	private ForgetpasswordPOM forgetpasswordPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream) ;
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		forgetpasswordPOM = new ForgetpasswordPOM(driver); 
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
		
	forgetpasswordPOM.clickLoginBtn();
	forgetpasswordPOM.sendEmail1("good_sen_sonali@yahoo.com");
	forgetpasswordPOM.sendpassword1("durga100@shiv");
	forgetpasswordPOM.sendclickloginBtn();
	
	
String actual_msg1 = driver.findElement(By.xpath("//*[@id=\"System_nyHsmShk\"]/div[1]")).getText();
	
	System.out.println(actual_msg1 );
	String expectedmsg1="Warning: No match for E-Mail Address and/or Password.";
	
	forgetpasswordPOM.sendforgotpw();
	forgetpasswordPOM.sendEmailforgotpage("sen_sonali@yahoo.com");
	forgetpasswordPOM.sendcontinueforget();
	
	String actual_msg = driver.findElement(By.xpath("//*[@id=\"System_nyHsmShk\"]/div[1]")).getText();
	
	System.out.println(actual_msg );
	String expectedmsg="An email with a confirmation link has been sent your email address.";
		
		
		screenShot.captureScreenShot("First4");
	}
}
