package testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSignupPage;
import utility.Parameterization;

public class ZerodhaSignupPageTest {
    
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		driver = Browser.openbrowser();
	}
	@Test
	public void signuptozerodha() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickonsignup();
		ZerodhaSignupPage zerodhasignuppage = new ZerodhaSignupPage(driver);
		String no = Parameterization.getdata(3,1);
		zerodhasignuppage.enternumber(no);
		Thread.sleep(3000);
		zerodhasignuppage.clickonsubmit();
	}
	@Test
	public void clickonnrilink() {
		ZerodhaSignupPage zerodhasignuppage = new ZerodhaSignupPage(driver);
		zerodhasignuppage.clickonnri();
	}
}
