


package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CategoryexcelPOM {
	private WebDriver driver; 
	
	public CategoryexcelPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	//username
	@FindBy(xpath="//*[@id=\"input-username\"]")  

	private WebElement Email1; 
	
	
	public void sendun(String Emailadd)throws InterruptedException
	
	{Thread.sleep(10000);
		this.Email1.clear();
		this.Email1.sendKeys(Emailadd);
	}
	
	
	
	
	
	
	//password
	
	@FindBy(id="input-password")
	private WebElement Pass12; 
	
	
	public void sendpassword12(String passwd) {
		this.Pass12.clear();
		this.Pass12.sendKeys(passwd);
	}
	
	
	
	//login
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement login_click1;
	
	
		public void sendclickloginBtn1() {
		
		this.login_click1.click(); 
		
				
	}
		
		
		
		
	//category	
		
		public void sendmouseOverOnethnicClick1()
		{
		
		WebElement element = driver.findElement(By.id("menu-catalog"));
		 
	    Actions action = new Actions(driver);

	    action.moveToElement(element).build().perform();
		


	    driver.findElement(By.linkText("Categories")).click();
		}
		
		
		
		//click + icon
		
		
		
		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a[1]/i")
 		private WebElement click_addcat;
 				 
 		public void sendClick_selected_cat()
 		{
 		
 			this.click_addcat.click();

 		}
 		
 		
	
 		
 		
 		
 		//category name
 		
 		@FindBy(xpath = "//*[@id=\"input-name1\"]")
 		private WebElement categoryname;

 		public void sendcname(String cname) {
 			this.categoryname.clear();
 			this.categoryname.sendKeys(cname);
 		}
 		
 		
 		//category desc
 		//*[@id="language1"]/div[2]/div/div/div[3]/div[2]
 		@FindBy(xpath = "//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
 		private WebElement categorydesc;

 		public void sendcategorydesc(String cd) {
 			this.categorydesc.clear();
 			this.categorydesc.sendKeys(cd);
 		}

 		
 		//meta-title
 		@FindBy(xpath = "//*[@id=\"input-meta-title1\"]")
 		private WebElement categorymetatag;

 		public void sendcategorymetatag(String cmt) {
 			this.categorymetatag.clear();
 			this.categorymetatag.sendKeys(cmt);
 		}
 		
 		 		
 		
 		
		
 		//meta-desc
 		@FindBy(xpath = "//*[@id=\"input-meta-description1\"]")
 		private WebElement categorymetadesc;

 		public void sendcategorymetadesc(String cmd) {
 			this.categorymetadesc.clear();
 			this.categorymetadesc.sendKeys(cmd);
 		}
 		
 	// save

 		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
 	 		
 	 		
 	 	 	private WebElement save_click1;

 		public void sendclicksave() {

 			this.save_click1.click();

 		}
		
}
		
