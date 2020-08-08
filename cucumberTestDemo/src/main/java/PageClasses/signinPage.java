package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.commonMethod;
import Utils.testReport;
import junit.framework.Assert;

public class signinPage {
	
	private WebDriver driver;
	
	private WebElement signinBtn;
	
	private WebElement createAccount;
	
	private WebElement emailText;
	
	private WebElement passwordText;
	
	private WebElement actualMess;
	
	private commonMethod cm;
	
	private testReport tr;
	
	
	public signinPage(WebDriver driver) {
		
		 
		this.driver =driver ;
		//tr = new testReport();
		
		emailText = driver.findElement(By.id("ap_email"));
		passwordText = driver.findElement(By.id("ap_password"));
		createAccount = driver.findElement(By.id("createAccountSubmit"));
		signinBtn = driver.findElement(By.id("signInSubmit"));
		actualMess = driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div/div/ul/li/span"));
		
		
	}
	public void clickSignInBtn() {
		
		signinBtn.click();
		
	}
	
	public void clickCreateAccount() {
		
		createAccount.click();
	}
	
	public void enterEmailText(String s) {
		
		emailText.sendKeys(s);
	}
	
	public void enterPasswordText(String e) {
		
		passwordText.sendKeys(e);
		
	}
	
	public void verifyMessage(String expectedMss) {
		
		Assert.assertEquals(expectedMss, actualMess.getText());
		
	}

}
