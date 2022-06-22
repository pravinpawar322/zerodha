package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaDashboardPage {
     
	 @FindBy(xpath="//input[@type='text']")private WebElement searchbox;
	 @FindBy(xpath="//span[text()='TATAMOTORS AUG FUT']")private WebElement tatamotors;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement buybutton;
	// @FindBy(xpath="//button[@class='button-blue buy']")private WebElement buybutton;
	 
	 public ZerodhaDashboardPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void searchforstock(String stockname) {
		 searchbox.sendKeys("TATAMOTORS AUG FUT");
	 }
	 
	 public void action(WebDriver driver) throws InterruptedException {
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 act.moveToElement(tatamotors);
		 act.perform();
	 }
	 public void action2(WebDriver driver) throws InterruptedException{
		 Actions act = new Actions(driver);
		 WebDriverWait wait = new  WebDriverWait(driver,Duration.ofMillis(3000));
		 wait.until(ExpectedConditions.visibilityOf(buybutton));
		 act.moveToElement(buybutton);
		 act.perform();
		 Thread.sleep(3000);
		 act.click();
		 act.perform();
	 }
}
