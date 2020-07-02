package SetepDep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdep {
	WebDriver driver;
	
	@Given("^LUNCH URL$")
	public void lunch_URL(){
		System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
	}
	

	@Then("^CLICK ON REGISTER LINK$")
	public void click_ON_REGISTER_LINK() {
		driver.findElement(By.linkText("REGISTER")).click();
	    
	}

	@Then("^VERIFY REGISTER PAGE DISPLAY$")
	public void verify_REGISTER_PAGE_DISPLAY() {
		boolean jahan = driver.findElement(By.xpath("//font[contains(text(), 'Contact')]")).isDisplayed();
		
		Assert.assertTrue(jahan);
	    
		driver.quit();
		
	}
	@Then("^VERIFY Contact Information TEXT DISPLAY$")
	public void VERIFY_Contact_Information_TEXT_DISPLAY() {
		boolean jahan = driver.findElement(By.xpath("//font[contains(text(), 'Contact')]")).isDisplayed();
		
		Assert.assertTrue(jahan);
	    
		driver.quit();
		
	}


}
