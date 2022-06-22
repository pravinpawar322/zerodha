package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaDashboardPage;
import pom.ZerodhaLoginPage;
import pom.ZerodhaPinPage;
import utility.Parameterization;

public class ZerodhaDashboardPageTest {
    
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		driver = Browser.openbrowser();
	}
	@Test
	public void buytatamotorsshare() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		String userid = Parameterization.getdata(0, 1);
		zerodhaloginpage.enteruserid(userid);
		Thread.sleep(3000);
		String password = Parameterization.getdata(1, 1);
		zerodhaloginpage.enterpassword(password);
		Thread.sleep(3000);
		zerodhaloginpage.clickonlogin();
		ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
		String pin = Parameterization.getdata(2, 1);
		Thread.sleep(3000);
		zerodhapinpage.enterpin(pin,driver);
		zerodhapinpage .clickonsubmit();
		Thread.sleep(3000);
		ZerodhaDashboardPage zerodhadashboardpage = new ZerodhaDashboardPage(driver);
		zerodhadashboardpage.searchforstock("TATAMOTORS AUG FUT");
		zerodhadashboardpage.action(driver);
		Thread.sleep(2000);
		zerodhadashboardpage.action2(driver);
		
	}
}
