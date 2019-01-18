   
 package com.training.pom;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;
 import org.openqa.selenium.support.ui.Select;

 import common.Assert;

 public class EditprofilePOM {
 	private WebDriver driver; 
 	
 	public EditprofilePOM(WebDriver driver) {
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
		
		
		@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/align/ul/li[1]/a")
		private WebElement editaccinfo_click;
		
		
			public void sendeditaccinfo() {
			
			this.editaccinfo_click.click(); 
			
					
		}
			
			
			
			
			
			@FindBy(xpath="//*[@id=\"input-firstname\"]")
			private WebElement Username; 
			
			
			public void sendUserName(String fnuserName) {
				this.Username.clear();
				this.Username.sendKeys(fnuserName);
			}
			
			
			
			
		
			@FindBy(xpath="//*[@id=\"input-lastname\"]")
			private WebElement lastUsername; 
			
			
			public void sendlastUserName123(String lsuserName) {
				
				this.lastUsername.clear();
				this.lastUsername.sendKeys(lsuserName);
				
			}


			
			@FindBy(xpath="//*[@id=\"input-email\"]")
			private WebElement email; 
			
			
			public void sendemail1234(String mail) {
				this.email.clear();
				this.email.sendKeys(mail);
			}
			
			
			@FindBy(xpath="//*[@id=\"input-telephone\"]")
			private WebElement tel; 
			
			
			public void sendtel(String telephone) {
				this.tel.clear();
				this.tel.sendKeys(telephone);
			}
		
		
			@FindBy(xpath="//*[@id=\"edit_account_form\"]/div/div[2]/input")
			private WebElement contd_click;
			
			
				public void sendclickContinueBtneditprofile() {
				
				this.contd_click.click(); 
				
						
			}
			
		

					
		
		
		
		
		
		
		
		
		
 	
 	
}
