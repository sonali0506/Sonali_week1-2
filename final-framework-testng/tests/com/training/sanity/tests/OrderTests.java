

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

import com.training.pom.OrderPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class OrderTests {

	private WebDriver driver;
	private String baseUrl;
	private OrderPOM orderPOM;
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
		orderPOM = new OrderPOM(driver); 
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
	public void validLoginTest() throws InterruptedException {   
		
	
		
		orderPOM.clickLoginBtn();
		orderPOM.sendEmail1("sen_sonali@yahoo.com");
		orderPOM.sendpassword1("durga100@shiv");
		orderPOM.sendclickloginBtn();
	
		orderPOM.sendmouseOverOnIcon();
		orderPOM.sendmouseOverOnMyOrdersandClick();
		
		orderPOM.sendviewclickBtn();
		
		
		 
		
		
		
       String act_url= driver.getCurrentUrl();
         Thread.sleep(5000);
         System.out.println(act_url);
	
	String expected_url="http://retail.hommelle.com/account/order/info?order_id=212";


   if(act_url.equals(expected_url))
   {
   	System.out.println("TC successfull");
   }
   else
   {
   	System.out.println("TC failed");
   }

 assertEquals(act_url,expected_url);
	
		
		/*
		
		
		
String actual_msg = driver.findElement(By.xpath("//*[@id=\"System_nyHsmShk\"]/div")).getText();
		
		System.out.println(actual_msg );
		String expectedmsg="Success: Your account has been successfully updated.";

	
				
		*/
		
		screenShot.captureScreenShot("First5");
		 
		 
		 
	}
	
}

