package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageClasses.homePage;
import PageClasses.signinPage;
import Utils.commonMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class stepClass {
	
	public WebDriver driver;
	
	public commonMethod cm;
	
	public homePage hp ;
	public signinPage sp;
	
	@Given("^I open URL \"([^\"]*)\"$")
	public void i_open_URL(String url) throws Throwable {
	    cm = new commonMethod();
	    cm.openURL(url);
	   cm.maximise();
	   // cm.takeSnapShot(this.driver,"C:\\Users\\Santhan\\git\\repository7\\cucumberTestDemo\\target\\failed.png");
	}

	@When("^User Navigate to signin Page$")
	public void user_Navigate_to_signin_Page() throws Throwable {
		this.driver = cm.getDriver();
	    hp = new homePage(this.driver);
	    
	    hp.clickSignInBtn();
	    cm.wait(4);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
	    sp = new signinPage(this.driver);
	    sp.enterEmailText(email);
	    sp.clickSignInBtn();
	    sp.enterPasswordText(password);
	    sp.clickSignInBtn();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    sp.verifyMessage("To better protect your account, please re-enter your password and then enter the characters as they are shown in the image below.");
	}
	
	
	
}
