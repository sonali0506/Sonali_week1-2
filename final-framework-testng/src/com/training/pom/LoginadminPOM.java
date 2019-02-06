package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginadminPOM {
	private WebDriver driver; 
	
	public LoginadminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/a/span/span/i ")
	private WebElement acc_icon_click;
	
	
	//     Clicking on Account icon

	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		this.acc_icon_click.click(); 
		
				
	}
	
//  Clicking on Register button
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/a")
	private WebElement register_button_click;
	
	public void clickregisterBtn() {
		// TODO Auto-generated method stub
		this.register_button_click.click(); 
	
}
	
	
//  First Name
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	private WebElement Firstname; 
	
	
	public void sendUserName(String Firstname) {
		this.Firstname.clear();
		this.Firstname.sendKeys(Firstname);
	}
	
	

	
	//Last Name
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	private WebElement Lastname; 
	
	
	public void sendlastUserName123(String Lastname) {
		
		this.Lastname.clear();
		this.Lastname.sendKeys(Lastname);
		
	}


//  Email
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement Email; 
	
	
	public void sendemail1234(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	
	
//  Telephone
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	private WebElement Telephone; 
	
	
	public void sendtel(String Telephone) {
		this.Telephone.clear();
		this.Telephone.sendKeys(Telephone);
	}
	
	
//  Address1
	
	@FindBy(xpath="//*[@id=\"input-address-1\"]")
	private WebElement Address1; 
	
	
	public void sendaddress1(String Address1) {
		this.Address1.clear();
		this.Address1.sendKeys(Address1);
	}
	
//  Address2
	
	@FindBy(xpath="//*[@id=\"input-address-2\"]")
	private WebElement Address2; 
	
	
	public void sendaddress2(String Address2) {
		this.Address2.clear();
		this.Address2.sendKeys(Address2);
	}
	
	
//  City
	@FindBy(xpath="//*[@id=\"input-city\"]")
	private WebElement City; 
	
	
	public void sendcity(String City) {
		this.City.clear();
		this.City.sendKeys(City);
	}
	
//  Postal code
	
	@FindBy(xpath="//*[@id=\"input-postcode\"]")
	private WebElement Postcode; 
	
	
	public void sendpostalcode(String Postcode) {
		this.Postcode.clear();
		this.Postcode.sendKeys(Postcode);
	}	
	
	
//  Select Country from dropdown
	public void sendcountry() {
				
		Select country = new Select(driver.findElement(By.xpath("//*[@id=\"input-country\"]"))); 
		country.selectByVisibleText("India");
//		country.selectByIndex(1); 
	}	
	

//  Select State from dropdown	
	public void sendcstate() {
		
		Select state = new Select(driver.findElement(By.xpath("//*[@id=\"input-zone\"]"))); 
		state.selectByVisibleText("Bihar");
	//	state.selectByIndex(1); 
	}	
	
	
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	private WebElement Password; 
	
	
	public void sendpwd(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}	
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	private WebElement Confirmpassword; 
	
	
	public void sendconpwd(String Confirmpassword) {
		this.Confirmpassword.clear();
		this.Confirmpassword.sendKeys(Confirmpassword);
	}	
	
	
	
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[4]/div/div/label[2]/input")
	//@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[4]/div/div/label[1]/input")
	WebElement radioBtn ;
	 
	
	
	
	public void sendradiobutton() {
			this.radioBtn.click();
	}	
	
	
	
	
	
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/form/div/div[1]/label/input")
	
WebElement checkboxagreement ;
	 
	
	
	public void sendcheckbox() {
			this.checkboxagreement.click();
	}	
	
	
	
	
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/form/div/div[2]/input")
	private WebElement contd_click;
	
	
		public void sendclickContinueBtn() {
		
		this.contd_click.click(); 
		
				
	}
	
	
	/*	
	
	
	@FindBy(id="input-password")
	private WebElement password;
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn; 
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	*/
	
	
	
	
}

