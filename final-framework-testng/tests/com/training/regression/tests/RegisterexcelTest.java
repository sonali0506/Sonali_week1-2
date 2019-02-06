  
 
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
 import com.training.generics.ScreenShot;
 import com.training.pom.LoginPOM;
 import com.training.pom.ProductexcelPOM;
import com.training.pom.RegisterexcelPOM;
import com.training.utility.DriverFactory;
 import com.training.utility.DriverNames;

 public class RegisterexcelTest {
 	private WebDriver driver;
 	private String baseUrl;
 	private RegisterexcelPOM registerexcelPOM;
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
 		registerexcelPOM = new RegisterexcelPOM(driver);
 		baseUrl = properties.getProperty("baseURL");
 		//driver.get("http://retail.hommelle.com/admin");
 		screenShot = new ScreenShot(driver);
 		// open the browser
 		driver.get(baseUrl);
 	}

 	@AfterMethod
 	public void tearDown() throws Exception {
 		//driver.quit();
 	}

 	@Test(dataProvider = "excel-inputs3", dataProviderClass = LoginDataProviders.class)
 	public void loginDBTest(String fn, String ln, String email,String tel,String add,String add2,String city,String pin,String pw,String cpwd) throws InterruptedException {
 		
 		
 		//registerexcelPOM.sendun("admin");
 		
 	
 	
 
 
 	registerexcelPOM.clickLoginBtn();
 	registerexcelPOM.clickregisterBtn();
 	registerexcelPOM.sendUserName(fn);
 	registerexcelPOM.sendlastUserName123(ln);
 	registerexcelPOM.sendemail1234(email);
 	registerexcelPOM.sendtel(tel);
 	registerexcelPOM.sendaddress1(add);
 	registerexcelPOM.sendaddress2(add2);
 	registerexcelPOM.sendcity(city);
 	registerexcelPOM.sendpostalcode(pin);
 	registerexcelPOM.sendcountry();
 	registerexcelPOM.sendcstate();
 	registerexcelPOM.sendpwd(pw);
 	registerexcelPOM.sendconpwd(cpwd);
 	registerexcelPOM.sendradiobutton();
	
 	registerexcelPOM.sendcheckbox();
 	registerexcelPOM.sendclickContinueBtn();
	
}
 
 }