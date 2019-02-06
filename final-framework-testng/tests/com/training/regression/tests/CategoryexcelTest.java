  
 
 
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
import com.training.pom.CategoryexcelPOM;
import com.training.pom.LoginPOM;
// import com.training.pom.ProductexcelPOM;
 import com.training.utility.DriverFactory;
 import com.training.utility.DriverNames;

 public class CategoryexcelTest {
 	private WebDriver driver;
 	//private String baseUrl;
 	private CategoryexcelPOM categoryexcelPOM;
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
 		categoryexcelPOM = new CategoryexcelPOM(driver);
 		//baseUrl = properties.getProperty("baseURL");
 		driver.get("http://retail.hommelle.com/admin");
 		screenShot = new ScreenShot(driver);
 		// open the browser
 		//driver.get(baseUrl); 
 	}

 	@AfterMethod
 	public void tearDown() throws Exception {
 	//	driver.quit();
 	}

 	@Test(dataProvider = "excel-inputs2", dataProviderClass = LoginDataProviders.class)
 	public void loginDBTest(String cn, String cd, String cmt,String cmd) throws InterruptedException {
 		
 		
 		categoryexcelPOM.sendun("admin");
 		categoryexcelPOM.sendpassword12("admin@123");
 		categoryexcelPOM.sendclickloginBtn1();
 		categoryexcelPOM.sendmouseOverOnethnicClick1();
 		categoryexcelPOM.sendClick_selected_cat();
 		
 		
 		
 		
 		categoryexcelPOM.sendcname(cn);
 		categoryexcelPOM.sendcategorydesc(cd);
 		categoryexcelPOM.sendcategorymetatag(cmt);
 		categoryexcelPOM.sendcategorymetadesc(cmd);
 		categoryexcelPOM.sendclicksave();
		
		
 	}
 	
 }