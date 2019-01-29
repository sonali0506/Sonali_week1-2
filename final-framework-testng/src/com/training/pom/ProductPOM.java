  

 package com.training.pom;

 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
 import org.openqa.selenium.support.ui.Select;

 import common.Assert;

 public class ProductPOM {
 	private WebDriver driver; 
 	
 	public ProductPOM(WebDriver driver) {
 		this.driver = driver; 
 		PageFactory.initElements(driver, this);
 	}
 	
 	
 	
 
 	
 	@FindBy(xpath="//*[@id=\"input-username\"]")  
 //	@FindBy(id="input-username")
// 	@FindBy(name="username")
 	private WebElement Email1; 
 	
 	
 	public void sendun(String Emailadd)throws InterruptedException
 	
 	{Thread.sleep(10000);
 		this.Email1.clear();
 		this.Email1.sendKeys(Emailadd);
 	}
 	
 	
 	
 	
 	
 	
 	
	
 	@FindBy(id="input-password")
 	private WebElement Pass12; 
 	
 	
 	public void sendpassword12(String passwd) {
 		this.Pass12.clear();
 		this.Pass12.sendKeys(passwd);
 	}
 	
 	
 	
 	
 	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
 	private WebElement login_click1;
 	
 	
 		public void sendclickloginBtn1() {
 		
 		this.login_click1.click(); 
 		
 				
 	}
 		
 		
 		//*reading of page title=========
 		
 	/*	
 	
 		public void validateloginaccountpage() {
 			 
 			
 		String actualurl = driver.getCurrentUrl();
 		System.out.println(actualurl);
 		String expectedurl ="http://retail.hommelle.com/account/account";
 		
 		if(actualurl.equals(expectedurl))
 		 System.out.println("Title Matched");
 		 else
 		 System.out.println("Title didn't match");
 		}
*/
 		
 		
 		
 		public void sendmouseOverOnethnicClick1()
 		{
 		
 		WebElement element = driver.findElement(By.id("menu-catalog"));
 		 
 	    Actions action = new Actions(driver);

 	    action.moveToElement(element).build().perform();
 		


 	    driver.findElement(By.linkText("Products")).click();
 		}
 		
 		
 		
 		//*[@id="content"]/div[1]/div/div/a
 		
 		
 		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a")
 		private WebElement click_product1;
 				 
 		public void Click_selected_product1()
 		{
 		
 			this.click_product1.click();

 		}
 		
 		
 		@FindBy(xpath="//*[@id=\"input-name1\"]")
 		private WebElement Productname; 
 		
 		
 		public void sendProductName(String fnuserName) {
 			this.Productname.clear();
 			this.Productname.sendKeys(fnuserName);
 		}
 		
 		
 		
 		
 		@FindBy(xpath="//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
 		private WebElement Productdesc; 
 		
 		
 		public void sendProductdesc(String fnuserName) {
 			this.Productdesc.clear();
 			this.Productdesc.sendKeys(fnuserName);
 		}
 		
 		
 		

 		@FindBy(id="input-meta-title1")
 		private WebElement Productmetatag; 
 		
 		
 		public void sendProductmetatag(String fnuserName) {
 			this.Productmetatag.clear();
 			this.Productmetatag.sendKeys(fnuserName);
 		}
 		
 		
 		
 		
 		
 		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")
 		private WebElement datatab; 
 		
 		
 		public void senddatatab() {
 			//this.datatab.clear();
 			this.datatab.click();
 		}
 		
 		
 		
 		
 		@FindBy(id="input-model")
 		private WebElement Model; 
 		
 		
 		public void sendModel(String fnuserName) {
 			this.Model.clear();
 			this.Model.sendKeys(fnuserName);
 		}
 		
 	
 			
 		
 		
 		//id="input-price"
 		
 		@FindBy(id="input-price")
 		private WebElement Price; 
 		
 		
 		public void sendPrice(String pri) {
 			this.Price.clear();
 			this.Price.sendKeys(pri);
 		}
 		
 			
 		
 		
 		
 		@FindBy(id="input-quantity")
 		private WebElement Qty; 
 		
 		
 		public void sendqty(String q) {
 			this.Qty.clear();
 			this.Qty.sendKeys(q);
 		}
 		
 		
 		
 		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a")
 		private WebElement linktab; 
 		
 		
 		public void sendlinktab() {
 			
 			this.linktab.click();
 		}
 		
 		
 		
 		
 		
 		
 		
 		
 		@FindBy(id="input-category")
 	 		private WebElement Cat; 
 	 		
 	 		
 	 		public void sendCat() {
 	 			this.Cat.clear();
 	 			this.Cat.click();
 	 		}	
 		
 		
 		public void sendmouseOvercatClick1()
 		{
 		
 		WebElement element = driver.findElement(By.id("input-category"));
 		 
 	    Actions action = new Actions(driver);

 	    action.moveToElement(element).build().perform();
 		


 	    driver.findElement(By.linkText("Ethnic")).click();
 		}
 		
 		
 		
 			//  Select Catagory from dropdown
 				//public void sendcat() {
 							
 				//	Select cat = new Select(driver.findElement(By.id("input-category"))); 
 			//		cat.selectByVisibleText("Ethnic");

 			//	}	
 				
 		
 				
 		
 				
 				
 		

 		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[7]/a")
 		private WebElement distab; 
 		
 		
 		public void senddistab() {
 			
 			this.distab.click();
 		}
 					
 				
 		@FindBy(xpath="//*[@id=\"discount\"]/tfoot/tr/td[2]/button")
 		private WebElement click_discicon;
 				 
 		public void sendClick_discounticon()
 		{
 		
 			this.click_discicon.click();

 		}		
 				
 				
 		
 		
 		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[2]/input")
 		private WebElement Qty1; 
 		
 		
 		public void sendqty1(String q) {
 			this.Qty1.clear();
 			this.Qty1.sendKeys(q);
 		}
 		
 		
 		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[4]/input")
 		private WebElement Price1; 
 		
 		
 		public void sendPrice1(String pri) {
 			this.Price1.clear();
 			this.Price1.sendKeys(pri);
 		}
 		
 	
 		
 		
 		
 		//Start Date
 		
 		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[5]/div/span/button")
 		private WebElement Editicon; 
 		
 		
 		public void sendclickEditicon() {
 			this.Editicon.click();

 		} 
 		
 		
 	//end date name=product_discount[0][date_end]
 		//*[@id="discount-row0"]/td[6]/div/input
 		//@FindBy(xpath="//*[@id=\"discount-row0\"]/td[6]/div/input")
 		@FindBy(name="product_discount[0][date_end]")
 		private WebElement enddate; 
 		
 		
 		public void sendenddate(String ed) {
 			this.enddate.clear();
 			this.enddate.sendKeys(ed);
 		}
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
 		private WebElement rewardtab; 
 		
 		
 		public void rewardtab() {
 			
 			this.rewardtab.click();
 		}
 		
 		
 		@FindBy(id="input-points")
 		private WebElement Point; 
 		
 		
 		public void sendPoint(String poi) {
 			this.Point.clear();
 			this.Point.sendKeys(poi);
 		}
 		
 		
 		
 		
 	//save
 		
 		
 		
 		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
 		
 		
 	 	private WebElement save_click1;
 	 	
 	 	
 	 		public void sendclicksave() {
 	 		
 	 		this.save_click1.click();
 		
 	 		}
 }	
 		
 		
 		
 		
 		
 		
 
 		
 		
 		
 		
 
 	
 	
 	
 		
 	
 	

