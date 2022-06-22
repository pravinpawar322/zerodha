package testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.ZeerodhaDashboardPage;
import pom.ZerodhaLoginPage;
import pom.ZerodhaPinPage;
import utility.Parameterization;

public class ZerodhaPinPageTest {
    
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		driver = Browser.openbrowser();
		
	}
	@Test
	public void enterpin() throws EncryptedDocumentException, IOException, InterruptedException {
		 ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		 String userid = Parameterization.getdata(0, 1);
		 zerodhaloginpage.enteruserid(userid);
		 String password = Parameterization.getdata(1, 1);
		 zerodhaloginpage.enterpassword(password);
		 zerodhaloginpage.clickonlogin();
		 Thread.sleep(3000);
		 ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
		 String pin = Parameterization.getdata(2, 1);
		 Thread.sleep(3000);                                                                                                  
		 zerodhapinpage.enterpin(pin,driver);
		 zerodhapinpage.clickonsubmit();
		 Thread.sleep(3000);
		 String actualtitle= "Dashboard/kite";
		 String acceptedtitle="Dashboard/kite";
		 Assert.assertEquals(actualtitle,acceptedtitle );
		 }
	@Test
	public void buystock() throws EncryptedDocumentException, IOException, InterruptedException {
		 ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		 String userid = Parameterization.getdata(0, 1);
		 zerodhaloginpage.enteruserid(userid);
		 String password = Parameterization.getdata(1, 1);
		 zerodhaloginpage.enterpassword(password);
		 zerodhaloginpage.clickonlogin();
		 Thread.sleep(3000);
		 ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
		 String pin = Parameterization.getdata(2, 1);
		 Thread.sleep(3000);                                                                                                  
		 zerodhapinpage.enterpin(pin,driver);
		 zerodhapinpage.clickonsubmit();
		 Thread.sleep(3000);
		 ZeerodhaDashboardPage zerodhadashboardpage = new ZeerodhaDashboardPage(driver);
		// zerodhadashboardpage.clickonsearchtab();
		 zerodhadashboardpage.searchforshare("RELIANCE JUN FUT");
		 Thread.sleep(3000);
		 zerodhadashboardpage.actionclass(driver);
		
		 
		 
		 
	}
}
