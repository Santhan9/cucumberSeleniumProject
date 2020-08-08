package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.commonMethod;

public class homePage  {
	
	
	WebDriver driver;
	
	WebElement TextField;
	
	private WebElement searchBtn;
	
	WebElement signInBtn;
	
	WebElement searchDropdown;
	
	commonMethod cm;
	
	// 
	
	
	public homePage(WebDriver driver) {
		
		
		signInBtn = driver.findElement(By.id("nav-link-accountList"));
		
		TextField = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBtn = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		
		searchDropdown = driver.findElement(By.id("searchDropdownBox"));
		this.driver = driver;
		
		
	}
	
	public void searchProduct(String product) {
		cm = new commonMethod();
		
		cm.type(product, TextField);
		
		//cm.clickElement(searchBtn);
		
		
		
		
	}
	
	public void clickSignInBtn() {
		
		signInBtn.click();
	}
	
	public String readTitle() {
		
		return cm.driver.getTitle();
	}
	
	public void selectOptionSearchDropdown(String text) {
		
		cm = new commonMethod();
		
		cm.selectDropdonOption(searchDropdown,text);
		
	}

}

