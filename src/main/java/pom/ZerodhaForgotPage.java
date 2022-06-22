package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {
    
	@FindBy(xpath="//input[@id='radio-30']")private WebElement radiowithuserid;
	@FindBy(xpath="//lable[@for='radio-31']")private WebElement radioforgotuserid; 
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath="//button[@type='submit']")private WebElement reset;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement backtologin;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userid;
	@FindBy(xpath="//input[@id='radio-36']")private WebElement radiosms;
	@FindBy(xpath="//input[@id='radio-35']")private WebElement radioemail;
	@FindBy(xpath="//input[@placeholder='Mobile number (as on account)']")private WebElement number;
	
	public ZerodhaForgotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enteruserid(String id) {
		userid.sendKeys(id);
	}
	public void enterpan(String Pan) {
		pan.sendKeys(Pan);
	}
	public void enteremail(String emailid) {
		email.sendKeys(emailid);
	}
	public void clickonradioforgotuserid(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("Script=arguments[0].click",radioforgotuserid);
		radioforgotuserid.click();
	}
	public void clickonreset() {
		reset.click();
	}
	public void clickonbacktologin() {
		backtologin.click();
	}
	public void clickonsms() {
		radiosms.click();
	}
	public void clickonemail() {
		radioemail.click();
	}
	public void clickonradiowithuserid(WebDriver driver) {
		
		((JavascriptExecutor)driver).executeScript("Script=arguments[0].click",radiowithuserid);
		radiowithuserid.click();
	}
	public void enternumber(String no) {
		number.sendKeys(no);
	}
}
