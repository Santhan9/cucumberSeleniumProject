package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class stepClass {
	
	public WebDriver driver;
	
	@Given("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhan\\Desktop\\seleniumtraining1\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get("https://www.amazon.in/s?k=monitor+big+size&ref=nb_sb_noss_1");
	    //throw new PendingException();
	}

	@When("^I enter url$")
	public void i_enter_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Amazon site opens$")
	public void amazon_site_opens() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
