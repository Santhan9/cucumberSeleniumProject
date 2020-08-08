package Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class commonMethod {
	
	public WebDriver driver;
	
	public void openURL(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santhan\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.get(url);
		
	}
	
	
	
	public void maximise() {
		this.driver.manage().window().maximize();
	}
	
	public void type(String text,WebElement e) {
		e.clear();
		e.sendKeys(text);
	}
	
	public WebDriver getDriver() {
		
		return this.driver;
	}
	
	public void clickElement(WebElement e) {
		
		e.click();
	}
	
	public void wait(int time) throws InterruptedException {
		
		int t =time*1000;
		
		Thread.sleep(t);
	}
	
	public void selectDropdonOption(WebElement we ,String text) {
		
		Select s = new Select(we);
		
		s.selectByVisibleText(text);
		
	}
	
	public String getVissibleText(WebElement e) {
		
		return e.getText();
	}
	
	public String getPageTittle(WebDriver driver) {
		
		return driver.getTitle();
	}
	
	public void close() {
		
		this.driver.close();
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{


		File SrcFile =((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
          

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	

}
