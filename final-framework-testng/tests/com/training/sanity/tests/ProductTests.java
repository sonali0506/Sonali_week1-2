  

 package com.training.sanity.tests;

 import static org.testng.Assert.assertEquals;

 import java.io.FileInputStream;
 import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.Test;

 import com.training.generics.ScreenShot;
 
 
import com.training.pom.ProductPOM;
import com.training.utility.DriverFactory;
 import com.training.utility.DriverNames;

 public class ProductTests {

 	private WebDriver driver;
 	//private String baseUrl;
 	private ProductPOM productPOM;
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
 		productPOM = new ProductPOM(driver); 
 		//baseUrl = properties.getProperty("baseURL");
 		driver.get("http://retail.hommelle.com/admin");
 		screenShot = new ScreenShot(driver); 
 		// open the browser
 	//	driver.get(baseUrl);
 	}
 	
 	@AfterMethod
 	public void tearDown() throws Exception {
 		Thread.sleep(5000);
 		//driver.quit();
 	}
 	@Test
 	public void validLoginTest() throws InterruptedException {   
 		
 		//accountopenPOM.clickLoginBtn();
 		productPOM.sendun("admin");
 		productPOM.sendpassword12("admin@123");
 		productPOM.sendclickloginBtn1();
 		productPOM.sendmouseOverOnethnicClick1();
 		productPOM.Click_selected_product1();
 		productPOM.sendProductName("ProductSonalimajumdar");
 		productPOM.sendProductdesc("ProductSonalimajumdardesc");
 		productPOM.sendProductmetatag("Finger Ring for ladies");
 		productPOM.senddatatab();
 		productPOM.sendModel("SKU-09");
 		productPOM.sendPrice("5000");
 		productPOM.sendqty("100");
 		productPOM.sendlinktab();
 		productPOM.sendCat(); 
 		productPOM.sendmouseOvercatClick1();
 		productPOM.senddistab();
 		productPOM.sendClick_discounticon();
 		
 		productPOM.sendqty1("10");
 		productPOM.sendPrice1("50");
 		productPOM.sendclickEditicon();
 		productPOM.sendenddate("2019-05-20");
 		
 		productPOM.rewardtab();
 		productPOM.sendPoint("8");
 		productPOM.sendclicksave();
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		/*

 		 WebElement e = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"));
 		          String act_msg51 = e.getText();
 		          System.out.println(act_msg51);
 			
 			String expected_msg51="Success: You have modified products!";


 	   if(act_msg51.equals(expected_msg51))
 	   {
 	   	System.out.println("Successfull");
 	   }
 	   else
 	   {
 	   	System.out.println("Failed");
 	   }

 		  assertEquals(act_msg51,expected_msg51);
 		
 		  
 		*/
 		
 	        
 	    
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		//screenShot.captureScreenShot("First1");
 	};

 	
 }
