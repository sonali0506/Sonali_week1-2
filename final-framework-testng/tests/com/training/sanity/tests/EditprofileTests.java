  

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
 //import com.training.pom.AccountopenPOM;
import com.training.pom.EditprofilePOM;
//import com.training.pom.LoginPOM;
 import com.training.utility.DriverFactory;
 import com.training.utility.DriverNames;

 public class EditprofileTests {

 	private WebDriver driver;
 	private String baseUrl;
 	private EditprofilePOM editprofilePOM;
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
 		editprofilePOM = new EditprofilePOM(driver); 
 		baseUrl = properties.getProperty("baseURL");
 		screenShot = new ScreenShot(driver); 
 		// open the browser 
 		driver.get(baseUrl);
 	}
 	
 	@AfterMethod
 	public void tearDown() throws Exception {
 		Thread.sleep(5000);
 //		driver.quit();
 	}
 	@Test
 	public void validLoginTest() {   
 		
 		editprofilePOM.clickLoginBtn();
 		editprofilePOM.sendEmail1("sen_sonali@yahoo.com");
 		editprofilePOM.sendpassword1("durga100@shiv");
 		editprofilePOM.sendclickloginBtn();
 		editprofilePOM.sendeditaccinfo();
 		editprofilePOM.sendUserName("Ganesh");
 		editprofilePOM.sendlastUserName123("Majumdar");
 		editprofilePOM.sendemail1234("sen_sonali_ganesh12111@yahoo.com");
 		editprofilePOM.sendtel("24832744");
 		editprofilePOM.sendclickContinueBtneditprofile();
 		
 		
 		
String actual_msg = driver.findElement(By.xpath("//*[@id=\"System_nyHsmShk\"]/div")).getText();
		
		System.out.println(actual_msg );
		String expectedmsg="Success: Your account has been successfully updated.";

	
		
 		
 		
 		
 		screenShot.captureScreenShot("First2");
 	}
 }

