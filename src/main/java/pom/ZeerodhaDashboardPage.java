package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZeerodhaDashboardPage {
     
	@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")private WebElement searchtab;
	@FindBy(xpath="//span[text()='TATASTEEL']")private WebElement TATASTEEL;
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement buybutton;
	@FindBy(xpath="//button[@class='button-orange sell']")private WebElement sellbutton;
	@FindBy(xpath="(//button[@class='button-outline'])[1]")private WebElement marketdepthbutton;
	@FindBy(xpath="(//button[@class='button-outline'])[2]")private WebElement chartbutton;
	@FindBy(xpath="(//button[@class='button-outline'])[3]")private WebElement deletebutton;
	@FindBy(xpath="//button[@class='context-menu-button button-outline']")private WebElement morebutton;
	@FindBy(xpath="//input[@id='radio-190']")private WebElement intradaybutton;
	@FindBy(xpath="//input[@id='radio-163']")private WebElement marketorderbutton;
	@FindBy(xpath="//button[@type='submit']")private WebElement submitbutton;
	
	public ZeerodhaDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonsearchtab() {
		searchtab.click();
	}
	public void searchforshare(String sharename)  {
		searchtab.sendKeys(sharename);
		 }
	public void actionclass(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.moveToElement(TATASTEEL);
		 action.perform();
		 Thread.sleep(4000);
	    action.moveToElement(buybutton);
	    action.perform();
	    action.click(buybutton);
	    action.perform();
	}
	public void clickonintradaybutton() {
		intradaybutton.click();
	}
	public void clickonmarketorderbutton() {
		marketorderbutton.click();
	}
	public void clickonsubmitbutton() {
		submitbutton.click();
	}
}
