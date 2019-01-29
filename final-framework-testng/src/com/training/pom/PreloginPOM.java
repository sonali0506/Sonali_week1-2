
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

public class PreloginPOM {
	private WebDriver driver;

	public PreloginPOM(WebDriver driver) {
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
	

	

}


 
