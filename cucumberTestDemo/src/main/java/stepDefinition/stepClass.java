package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class stepClass {
	
	public WebDriver driver;
	
	@Given("^I open the browser$")
	public void test1()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhan\\Desktop\\seleniumtraining1\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
	}

	@When("^I enter google url$")
	public void i_enter_google_url()  {
		this.driver.get("https://www.google.com/");
	}
	

@When("^I enter google url \"([^\"]*)\"$")
public void i_enter_google_url(String url) throws Throwable {
    
	this.driver.get(url);
}

@When("^I enter UserName \"([^\"]*)\" password \"([^\"]*)\"$")
public void i_enter_UserName_password(String userName, String Password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

	
	@When("^I enter Amazon url$")
	public void i_enter_amazon_url()  {
		this.driver.get("https://www.google.com/");
	}

	@Then("^Amazon site opens$")
	public void amazon_site_opens()  {
	   String title = this.driver.getTitle();
	   Assert.assertEquals("Google", title);
	}
	
	@Then("^Google site opens$")
	public void google_site_opens()  {
	   String title = this.driver.getTitle();
	   Assert.assertEquals("Google", title);
	}
	
	
	
}
