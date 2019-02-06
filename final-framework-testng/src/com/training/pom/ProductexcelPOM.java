
package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductexcelPOM {
	private WebDriver driver;

	public ProductexcelPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"input-username\"]")

	private WebElement Email1;

	public void sendun(String Emailadd) throws InterruptedException

	{
		Thread.sleep(10000);
		this.Email1.clear();
		this.Email1.sendKeys(Emailadd);
	}

	@FindBy(id = "input-password")
	private WebElement Pass12;

	public void sendpassword12(String passwd) {
		this.Pass12.clear();
		this.Pass12.sendKeys(passwd);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement login_click1;

	public void sendclickloginBtn1() {

		this.login_click1.click();

	}

	public void sendmouseOverOnethnicClick1() {

		WebElement element = driver.findElement(By.id("menu-catalog"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.linkText("Products")).click();
	}

	// *[@id="content"]/div[1]/div/div/a

	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
	private WebElement click_product1;

	public void Click_selected_product1() {

		this.click_product1.click();

	}

	@FindBy(xpath = "//*[@id=\"input-name1\"]")
	private WebElement Productname;

	public void sendProductName(String fnuserName) {
		this.Productname.clear();
		this.Productname.sendKeys(fnuserName);
	}

	@FindBy(xpath = "//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
	private WebElement Productdesc;

	public void sendProductdesc(String fnuserName) {
		this.Productdesc.clear();
		this.Productdesc.sendKeys(fnuserName);
	}

	@FindBy(id = "input-meta-title1")
	private WebElement Productmetatag;

	public void sendProductmetatag(String fnuserName) {
		this.Productmetatag.clear();
		this.Productmetatag.sendKeys(fnuserName);
	}

	@FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[2]/a")
	private WebElement datatab;

	public void senddatatab() {
		// this.datatab.clear();
		this.datatab.click();
	}

	@FindBy(id = "input-model")
	private WebElement Model;

	public void sendModel(String fnuserName) {
		this.Model.clear();
		this.Model.sendKeys(fnuserName);
	}

	// id="input-price"

	@FindBy(id = "input-price")
	private WebElement Price;

	public void sendPrice(String pri) {
		this.Price.clear();
		this.Price.sendKeys(pri);
	}

	@FindBy(id = "input-quantity")
	private WebElement Qty;

	public void sendqty(String q) {
		this.Qty.clear();
		this.Qty.sendKeys(q);
	}

	@FindBy(xpath = "//*[@id=\"form-product\"]/ul/li[3]/a")
	private WebElement linktab;

	public void sendlinktab() {

		this.linktab.click();
	}

	

	@FindBy(id = "input-category")
	private WebElement Cat;

	public void sendCat() {
		this.Cat.clear();
		this.Cat.click();
	}

	
	
	@FindBy(id = "input-category")
	private WebElement sendethnic;

	public void sendmouseOvercatClick1(String ethnic) throws InterruptedException {

		
		
		

			driver.findElement(By.id("input-category")).sendKeys("Ethnic");
			Thread.sleep(5000);

			WebElement s = driver.findElement(By.linkText("Ethnic"));
			Actions action = new Actions(driver);
			action.moveToElement(s).click().perform();
			Thread.sleep(5000);

		}

	



	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[7]/a")
 		private WebElement distab;

	public void senddistab() {

		this.distab.click();
	}

	@FindBy(xpath="//*[@id=\"discount\"]/tfoot/tr/td[2]/button")
 		private WebElement click_discicon;

	public void sendClick_discounticon() {

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

	// Start Date

	@FindBy(xpath="//*[@id=\"discount-row0\"]/td[5]/div/span/button")
	
 		private WebElement Editicon;

	public void sendclickEditicon() {
		this.Editicon.click();

	}

	
	@FindBy(xpath="//*[@id=\"discount-row0\"]/td[6]/div/span/button")
 		
    private WebElement Editicon1;

	public void sendclickEditicon1() {
		this.Editicon1.click();

		
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

	// save

	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button/i")
 		
 		
 	 	private WebElement save_click1;

	public void sendclicksave() {

		this.save_click1.click();

	}

	

	@FindBy(xpath="//*[@id=\"header\"]/ul/li[4]/a/span")
	//*[@id="search_button"]
 	 		
 	 		
 	 	 	private WebElement logout_click1;

	public void sendclicklogout() {

		this.logout_click1.click();

	}
	
	
	
	
	
	
	//Mouse Hover to select Ethnic
	
		public void sendmouseOverOnethnicClick()
		{
		
		WebElement element = driver.findElement(By.linkText("SHOP NOW"));
		 
	    Actions action = new Actions(driver);

	    action.moveToElement(element).build().perform();
		 driver.findElement(By.linkText("Ethnic")).click();
		}
		
		//click on search
		
	
 
		
		@FindBy(xpath="//*[@id=\"search_button\"]")
		
		private WebElement click_search;
				 
			
		public void sendsearchtext() throws InterruptedException {
			//this.click_search.clear();
			this.click_search.click();
			driver.findElement(By.xpath("//*[@id=\"filter_keyword\"]")).sendKeys("DurgaShivProductshiv");
			Thread.sleep(1000);
			this.click_search.click();
			
			
			
			
		}
		
		
		

}
