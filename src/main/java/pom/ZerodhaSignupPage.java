package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPage {

	  @FindBy(xpath="//input[@type='text']")private WebElement number;
	  @FindBy(xpath="//button[@type='submit']")private WebElement submit;
	  @FindBy(xpath="//a[text()='Want to open an NRI account?']")private WebElement nri;
	  
	  public ZerodhaSignupPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  public void enternumber(String no) {
		  number.sendKeys(no);
	  }
	  public void clickonsubmit() {
		  submit.click();
	  }
	  public void clickonnri() {
		  nri.click();
	  }
}
