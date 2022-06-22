package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
    
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement forgot;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterpin(String Pin,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(Pin);
	}
	public void clickonsubmit() {
		submit.click();
	}
	public void clickonforgot() {
		forgot.click();
	}
	public void clickonsignup() {
		signup.click();
		
	}
}
