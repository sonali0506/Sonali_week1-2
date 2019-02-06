  
 
 package com.training.pom;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.interactions.Actions;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
 import org.openqa.selenium.support.ui.Select;

 public class RegisterexcelPOM {
 	private WebDriver driver;

 	public RegisterexcelPOM(WebDriver driver) {
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
	private WebElement Username; 
	
	
	public void sendUserName(String fnuserName) {
		this.Username.clear();
		this.Username.sendKeys(fnuserName);
	}
	
	
	
	
	
	//Last Name
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	private WebElement lastUsername; 
	
	
	public void sendlastUserName123(String lsuserName) {
		
		this.lastUsername.clear();
		this.lastUsername.sendKeys(lsuserName);
		
	}


//  Email
	@FindBy(xpath="//*[@id=\"input-email\"]")
	private WebElement email; 
	
	
	public void sendemail1234(String mail) {
		this.email.clear();
		this.email.sendKeys(mail);
	}
	
	
	
//  Telephone
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	private WebElement tel; 
	
	
	public void sendtel(String telephone) {
		this.tel.clear();
		this.tel.sendKeys(telephone);
	}
	
	
//  Address1
	
	@FindBy(xpath="//*[@id=\"input-address-1\"]")
	private WebElement add; 
	
	
	public void sendaddress1(String a1) {
		this.add.clear();
		this.add.sendKeys(a1);
	}
	
//  Address2
	
	@FindBy(xpath="//*[@id=\"input-address-2\"]")
	private WebElement add2; 
	
	
	public void sendaddress2(String a2) {
		this.add2.clear();
		this.add2.sendKeys(a2);
	}
	
	
//  City
	@FindBy(xpath="//*[@id=\"input-city\"]")
	private WebElement city; 
	
	
	public void sendcity(String c1) {
		this.city.clear();
		this.city.sendKeys(c1);
	}
	
//  Postal code
	
	@FindBy(xpath="//*[@id=\"input-postcode\"]")
	private WebElement postal; 
	
	
	public void sendpostalcode(String p1) {
		this.postal.clear();
		this.postal.sendKeys(p1);
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
	private WebElement password; 
	
	
	public void sendpwd(String pw1) {
		this.password.clear();
		this.password.sendKeys(pw1);
	}	
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	private WebElement conpassword; 
	
	
	public void sendconpwd(String pw2) {
		this.conpassword.clear();
		this.conpassword.sendKeys(pw2);
	}	
	
	
	
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[4]/div/div/label[2]/input")
	
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
	
	
 	
 	
 }
