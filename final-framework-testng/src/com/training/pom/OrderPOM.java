package com.training.pom;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Assert;

 public class OrderPOM {
 	private WebDriver driver; 
 	
 	public OrderPOM(WebDriver driver) {
 		this.driver = driver; 
 		PageFactory.initElements(driver, this);
 	}
 	
 	
 	
 	
 	
 	
 	
 	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/a/span/span/i ")
	private WebElement acc_icon_click;
	
	
	
	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		this.acc_icon_click.click(); 
		
				
	}
	
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/a")
	private WebElement register_button_click;
	
	public void clickregisterBtn() {
		// TODO Auto-generated method stub
		this.register_button_click.click(); 
	
}
	
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement Email1; 
	
	
	public void sendEmail1(String Emailadd) {
		this.Email1.clear();
		this.Email1.sendKeys(Emailadd);
	}
	
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	private WebElement Pass1; 
	
	
	public void sendpassword1(String passwd) {
		this.Pass1.clear();
		this.Pass1.sendKeys(passwd);
	}
	
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div[2]/div/form/div/div[2]/input")
	private WebElement login_click;
	
	
		public void sendclickloginBtn() {
		
		this.login_click.click(); 
		
				
	}
		
	//click on traingle icon followed by My order
		
		@FindBy(xpath="//*[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/a")
		private WebElement ordericon;
		@FindBy(xpath="//*[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/ul/li[3]/a/span")
		private WebElement orders; 

	

	 public void sendmouseOverOnIcon(){
			Actions action= new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/a")));
			action.moveToElement(ordericon).build().perform();

		} 

	public void sendmouseOverOnMyOrdersandClick(){
			Actions action= new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/ul/li[3]/a/span")));
			action.moveToElement(orders).build().perform();
			orders.click();

		} 	
		
	
	@FindBy(xpath="//*[@id=\"System_epRD9Fax\"]/div[1]/table/tbody/tr[1]/td[7]/a")
	private WebElement view_click;
	
	
		public void sendviewclickBtn() {
		
		this.view_click.click(); 
		
				
	}	
		
		
		
		
		
		
		
		
		
		
	/*	@FindBy(xpath="//I[@class='fa fa-user-o']")
		private WebElement order_icon_click;
		
		
		

		public void ordericon() {
			
			this.order_icon_click.click(); 
			
					
		}
		
		
		@FindBy(xpath="(//SPAN[@class='tb_text'])[12]")
		private WebElement orderinfo_click;
		
		
			public void sendorder() {
			
			//this.orderinfo_click.click(); 
			
			
			
			boolean breakIt = true;
	        while (true) {
	        breakIt = true;
	        try {
	        	this.orderinfo_click.click(); 
	        } catch (Exception e) {
	            if (e.getMessage().contains("element is not attached")) {
	                breakIt = false;
	            }
	        }
	        if (breakIt) {
	            break;
	        }

	        }*/
			
			
		
 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	

