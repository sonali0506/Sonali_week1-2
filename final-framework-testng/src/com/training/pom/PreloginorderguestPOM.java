  
 
 
 

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

public class PreloginorderguestPOM {
	private WebDriver driver;

	public PreloginorderguestPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	//Mouse Hover to select Ethnic
	
	public void sendmouseOverOnethnicClick()
	{
	
	WebElement element = driver.findElement(By.linkText("SHOP NOW"));
	 
   Actions action = new Actions(driver);

   action.moveToElement(element).build().perform();
	 driver.findElement(By.linkText("Ethnic")).click();
	}
	
	//click on product
	
	
	
	@FindBy(xpath="//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div/div/div[3]/div/div/div[1]/h4/a")
	private WebElement click_product;
			 
	public void Click_selected_product()
	{
	
		this.click_product.click();

	}
	
	
	
	//Add to cart
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
		private WebElement addcart;
				 
		public void sendaddcart()
		{
		
			this.addcart.click();

		}
		
		
	//	Mouse Hover to select cart icon
		public void sendmouseOverCartClick()
		{
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li/h3/a/i"));
		 
	    Actions action = new Actions(driver);

	    action.moveToElement(element).build().perform();
	
		}	
		
		
	//click view cart
		
		@FindBy(xpath="//*[@id=\"cart\"]/ul/li/div/div/div[3]/a[1]")
		private WebElement viewcart;
				 
		public void sendviewcart()
		{
		
			this.viewcart.click();

		}
	
		//click check out button
	
		@FindBy(xpath="//*[@id=\"System_V2Exp1o9\"]/div[3]/div[2]/a")
		private WebElement checkout;
				 
		public void sendcheckout()
		{
		
			this.checkout.click();

		}
	

	
		
		
		
		
		
		
		@FindBy(xpath="//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[1]/div/div[2]/label")
		
		WebElement radioBtn ;
		 
		
		
		
		public void sendradiobutton() {
				this.radioBtn.click();
		}	
		
		
		
		
		
		@FindBy(xpath="//*[@id=\"button-account\"]")
		private WebElement contd_click;
		
		
			public void sendclickContinueBtn() {
			
			this.contd_click.click(); 
			
					
		}
		
	
			
			
			
			
			
			
		//  First Name
			
			@FindBy(xpath="//*[@id=\"input-payment-firstname\"]")
			private WebElement Username; 
			
			
			public void sendUserName(String fnuserName) {
				this.Username.clear();
				this.Username.sendKeys(fnuserName);
			}
			
			
			
			
			//Last Name
			@FindBy(xpath="//*[@id=\"input-payment-lastname\"]")
			private WebElement lastUsername; 
			
			
			public void sendlastUserName123(String lsuserName) {
				
				this.lastUsername.clear();
				this.lastUsername.sendKeys(lsuserName);
				
			}


		//  Email
			@FindBy(xpath="//*[@id=\"input-payment-email\"]")
			private WebElement email; 
			
			
			public void sendemail1234(String mail) {
				this.email.clear();
				this.email.sendKeys(mail);
			}
			
			
			
		//  Telephone
			@FindBy(xpath="//*[@id=\"input-payment-telephone\"]")
			private WebElement tel; 
			
			
			public void sendtel(String telephone) {
				this.tel.clear();
				this.tel.sendKeys(telephone);
			}
			
			
		//  Address1
			
			@FindBy(xpath="//*[@id=\"input-payment-address-1\"]")
			private WebElement add; 
			
			
			public void sendaddress1(String a1) {
				this.add.clear();
				this.add.sendKeys(a1);
			}
			
		//  Address2
			
			@FindBy(xpath="//*[@id=\"input-payment-address-2\"]")
			private WebElement add2; 
			
			
			public void sendaddress2(String a2) {
				this.add2.clear();
				this.add2.sendKeys(a2);
			}
			
			
		//  City
			@FindBy(xpath="//*[@id=\"input-payment-city\"]")
			private WebElement city; 
			
			
			public void sendcity(String c1) {
				this.city.clear();
				this.city.sendKeys(c1);
			}
			
		//  Postal code
			
			@FindBy(xpath="//*[@id=\"input-payment-postcode\"]")
			private WebElement postal; 
			
			
			public void sendpostalcode(String p1) {
				this.postal.clear();
				this.postal.sendKeys(p1);
			}	
			
			
		//  Select Country from dropdown
			public void sendcountry() {
						
				Select country = new Select(driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]"))); 
				country.selectByVisibleText("India");
//				country.selectByIndex(1); 
			}	
			

		//  Select State from dropdown	
			public void sendcstate() {
				
				Select state = new Select(driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]"))); 
				state.selectByVisibleText("Bihar");
			//	state.selectByIndex(1); 
			}	
			
			
		/*	
			@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/div[2]/div[1]/label")
			
			WebElement checkboxagreementguest ;
				 
				
				
				public void sendcheckboxguest() {
						this.checkboxagreementguest.click();
				}	
				
				*/
				
				
				
				@FindBy(xpath="//*[@id=\"button-guest\"]")
				private WebElement contdguest_click;
				
				
					public void sendclickContinueguestBtn() {
					
					this.contdguest_click.click(); 
					
							
				}	
					
					
					//comment
					@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
					private WebElement comment; 
					
					
					public void sendcomment(String comment) {
						
						this.comment.clear();
						this.comment.sendKeys(comment);
						
					}
		
					
					
					@FindBy(xpath="//*[@id=\"button-shipping-method\"]	")
					private WebElement contdcomment_click;
					
					
						public void sendclickContinuecomment() {
						
						this.contdcomment_click.click(); 
						
								
					}	
					
					
			
								
						
						@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div[1]/label/input")
						
						WebElement checkboxagreementguest ;
							 
							
							
							public void sendcheckboxguest() {
									this.checkboxagreementguest.click();
							}	
									
						
							//payment-continue button
						
							@FindBy(xpath="//*[@id=\"button-payment-method\"]")
							private WebElement contdpayment_click;
							
							
								public void sendclickContinuepayment() {
								
								this.contdpayment_click.click(); 
								
										
							}	
							
					
		
								
								
								
								
								//confirm button
								
								@FindBy(xpath="//*[@id=\"button-confirm\"]")
								private WebElement confirm_click;
								
								
									public void sendclickContinueconfirm() {
									
									this.confirm_click.click(); 
									
											
								}	
								
								

}




