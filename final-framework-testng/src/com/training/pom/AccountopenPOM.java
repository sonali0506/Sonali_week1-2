package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.Assert;

public class AccountopenPOM {
	private WebDriver driver; 
	
	public AccountopenPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/a/span/span/i ")
	private WebElement acc_icon_click;
	
	
	//      /html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/ul/li[1]/a/span

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
		
		
		//*reading of page title=========
		
		
	
		public void validateloginaccountpage() {
			 
			
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		String expectedurl ="http://retail.hommelle.com/account/account";
		
		if(actualurl.equals(expectedurl))
		 System.out.println("Title Matched");
		 else
		 System.out.println("Title didn't match");
		}

		
}
	
	
	
		
	
	
