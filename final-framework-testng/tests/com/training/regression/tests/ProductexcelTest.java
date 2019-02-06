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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ProductexcelTest {
	private WebDriver driver;
	//private String baseUrl;
	private ProductexcelPOM productexcelPOM;
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
		productexcelPOM = new ProductexcelPOM(driver);
		//baseUrl = properties.getProperty("baseURL");
		driver.get("http://retail.hommelle.com/admin");
		screenShot = new ScreenShot(driver);
		// open the browser
		//driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test(dataProvider = "excel-inputs1", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String pn, String pd, String pm,String m,String p,String q,String q1,String p1,String point) throws InterruptedException {
		
		
		productexcelPOM.sendun("admin");
		productexcelPOM.sendpassword12("admin@123");
		productexcelPOM.sendclickloginBtn1();
		productexcelPOM.sendmouseOverOnethnicClick1();
		productexcelPOM.Click_selected_product1();
		
		productexcelPOM.sendProductName(pn);
		productexcelPOM.sendProductdesc(pd);
		productexcelPOM.sendProductmetatag(pm);
		productexcelPOM.senddatatab();
		productexcelPOM.sendModel(m);
		productexcelPOM.sendPrice(p);
		productexcelPOM.sendqty(q);
		productexcelPOM.sendlinktab();
		productexcelPOM.sendCat();
		
		productexcelPOM.sendmouseOvercatClick1("Ethnic");
		
		productexcelPOM.senddistab();
		
		
		productexcelPOM.sendClick_discounticon();
 		
		productexcelPOM.sendqty1(q1);
		productexcelPOM.sendPrice1(p1);
		productexcelPOM.sendclickEditicon();
		productexcelPOM.sendclickEditicon1();
		Thread.sleep(10000);
		productexcelPOM.rewardtab();
		productexcelPOM.sendPoint(point);
		productexcelPOM.sendclicksave();
		productexcelPOM.sendclicklogout();
		
		driver.get("http://retail.hommelle.com/");
		
		productexcelPOM.sendmouseOverOnethnicClick();
	
		productexcelPOM.sendsearchtext();
		//screenShot.captureScreenShot(userName);

	}

}  














