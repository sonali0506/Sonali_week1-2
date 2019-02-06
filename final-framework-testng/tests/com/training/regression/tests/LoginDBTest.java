package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginadminPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginadminPOM loginadminPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginadminPOM = new LoginadminPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest( String Firstname ,String Lastname, String Email, String Telephone,  String  Address1, String Address2, String City,String Postcode,String Password, String Confirmpassword) {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		//loginadminPOM.sendUserName(userName);
		
		//loginadminPOM.sendPassword(password);
	//	loginadminPOM.clickLoginBtn();
		
		
		
		
		
		
		  
			
		loginadminPOM.clickLoginBtn();
		loginadminPOM.clickregisterBtn();
		loginadminPOM.sendUserName(Firstname);
		loginadminPOM.sendlastUserName123(Lastname);
		loginadminPOM.sendemail1234(Email);
		loginadminPOM.sendtel(Telephone);
		loginadminPOM.sendaddress1(Address1);
		loginadminPOM.sendaddress2(Address2);
		loginadminPOM.sendcity(City);
		loginadminPOM.sendpostalcode(Postcode);
		loginadminPOM.sendcountry();
		loginadminPOM.sendcstate();
		loginadminPOM.sendpwd(Password);
		loginadminPOM.sendconpwd(Confirmpassword);
		loginadminPOM.sendradiobutton();
			
		loginadminPOM.sendcheckbox();
		loginadminPOM.sendclickContinueBtn();
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		//screenShot.captureScreenShot(userName);

	}

}