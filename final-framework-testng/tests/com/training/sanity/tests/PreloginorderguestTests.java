 




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
import com.training.pom.PreloginorderguestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PreloginorderguestTests {

	private WebDriver driver;
	private String baseUrl;
	private PreloginorderguestPOM preloginorderguestPOM;
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
		preloginorderguestPOM = new PreloginorderguestPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
	//	driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {  
			
		
		preloginorderguestPOM.sendmouseOverOnethnicClick();
		preloginorderguestPOM.Click_selected_product();
		Thread.sleep(5000);
		 	
	       
			 	 	
		
		
	      //Window Handler - code for New window opening
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
			Thread.sleep(20000);
		
			preloginorderguestPOM.sendaddcart();
			preloginorderguestPOM.sendmouseOverCartClick();
			preloginorderguestPOM.sendviewcart();
			
			
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
		 	
			
			
			
		preloginorderguestPOM.sendcheckout();
			
	
	
	
	
	
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
	







preloginorderguestPOM.sendradiobutton();
preloginorderguestPOM.sendclickContinueBtn();








preloginorderguestPOM.sendUserName("Durga");
preloginorderguestPOM.sendlastUserName123("Sen");
preloginorderguestPOM.sendemail1234("sen_sonalizzzz@yahoo.com");
preloginorderguestPOM.sendtel("24717587");
preloginorderguestPOM.sendaddress1("P-128, Senhati,Regent Park");
preloginorderguestPOM.sendaddress2("Tollygaunge");
preloginorderguestPOM.sendcity("Kolkata");
preloginorderguestPOM.sendpostalcode("700034");
preloginorderguestPOM.sendcountry();
preloginorderguestPOM.sendcstate();

//preloginorderguestPOM.sendcheckboxguest();
preloginorderguestPOM.sendclickContinueguestBtn();
preloginorderguestPOM.sendcomment("Sonali order");
preloginorderguestPOM.sendclickContinuecomment();
preloginorderguestPOM.sendcheckboxguest();
preloginorderguestPOM.sendclickContinuepayment();
preloginorderguestPOM.sendclickContinueconfirm();
	
	
	
		
		
	 
	 	


	 WebElement e = driver.findElement(By.xpath("//*[@id=\"System_epRD9Fax\"]/div[1]/p[1]"));
	          String act_msg5 = e.getText();
	          System.out.println(act_msg5);
		
		String expected_msg5="Your order has been successfully processed!";


   if(act_msg5.equals(expected_msg5))
   {
   	System.out.println("Successfull");
   }
   else
   {
   	System.out.println("Failed");
   }

	  assertEquals(act_msg5,expected_msg5);
	
	  
	
	  
	  
	  
	}
}


