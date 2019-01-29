  
 
 
 package com.training.sanity.tests;

 import static org.testng.Assert.assertEquals;

 import java.io.FileInputStream;
 import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.Test;

 import com.training.generics.ScreenShot;
 import com.training.pom.LoginPOM;
import com.training.pom.PreloginPOM;
import com.training.utility.DriverFactory;
 import com.training.utility.DriverNames;

 public class PreloginTests {

 	private WebDriver driver;
 	private String baseUrl;
 	private PreloginPOM preloginPOM;
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
 		preloginPOM = new PreloginPOM(driver); 
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
 	public void validLoginTest() throws InterruptedException {  
 			
 		
 		preloginPOM.sendmouseOverOnethnicClick();
 		preloginPOM.Click_selected_product();
 		Thread.sleep(5000);
 		 	
 	       
 			 	 	
 		
 		
 	      //Window Handler - code for New window opening
 		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
 		driver.switchTo().window(tabs2.get(1));
 			Thread.sleep(20000);
 		
 			preloginPOM.sendaddcart();
 			preloginPOM.sendmouseOverCartClick();
 			preloginPOM.sendviewcart();
 			
 			
 			String act_url1= driver.getCurrentUrl();
 		     Thread.sleep(5000);
 		     System.out.println(act_url1);

 		String expected_url1="http://retail.hommelle.com/checkout/cart";


 		if(act_url1.equals(expected_url1))
 		{
 			System.out.println("TC successfull");
 		}
 		else
 		{
 			System.out.println("TC failed");
 		}

 		assertEquals(act_url1,expected_url1);
 		 	
 			
 			
 			
 			preloginPOM.sendcheckout();
 			
 	
 	
 	
 	
 	
 	 String act_url= driver.getCurrentUrl();
     Thread.sleep(5000);
     System.out.println(act_url);

String expected_url="http://retail.hommelle.com/checkout/checkout";


if(act_url.equals(expected_url))
{
	System.out.println("TC successfull");
}
else
{
	System.out.println("TC failed");
}

assertEquals(act_url,expected_url);
 	
 	
 	} 		
 		/*
 		
 		
 	 
 	 	
 	
 	
 	 WebElement e = driver.findElement(By.xpath("//*[@id=\"noty_alert_1548431651579\"]/div/div[1]/div"));
	          String act_msg = e.getText();
	          System.out.println(act_msg);
		
		String expected_msg="Shopping Cart updated!";


      if(act_msg.equals(expected_msg))
      {
      	System.out.println("Successfull");
      }
      else
      {
      	System.out.println("Failed");
      }

	  assertEquals(act_msg,expected_msg);
 	
 	*/
 }

