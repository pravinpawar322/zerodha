package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaForgotPage;
import pom.ZerodhaLoginPage;
import utility.Parameterization;

public class ZerodhaForgotPageTest {
    
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		driver = Browser.openbrowser();
	}
	@Test
	public void resetwithuserid() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickonforgot();
		Thread.sleep(3000);
		ZerodhaForgotPage zerodhaforgotpage = new ZerodhaForgotPage(driver);
		zerodhaforgotpage.clickonradiowithuserid(driver);
		String userid = Parameterization.getdata(0, 1);
		zerodhaforgotpage.enteruserid(userid);
		String Pan = Parameterization.getdata(4,1);
		zerodhaforgotpage.enterpan(Pan);
		String email = Parameterization.getdata(5,1);
		zerodhaforgotpage.enteremail(email);
		Thread.sleep(3000);
		zerodhaforgotpage.clickonreset();
		}
	@Test
	public void resetwithoutuserid() throws InterruptedException, EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		zerodhaloginpage.clickonforgot();
		Thread.sleep(3000);
		ZerodhaForgotPage zerodhaforgotpage = new ZerodhaForgotPage(driver);
		zerodhaforgotpage.clickonradioforgotuserid(driver);
		String Pan = Parameterization.getdata(4,1);
		zerodhaforgotpage.enterpan(Pan);
		Thread.sleep(3000);
		zerodhaforgotpage.clickonsms();
		Thread.sleep(3000);
		String no = Parameterization.getdata(3, 1);
		zerodhaforgotpage.enternumber(no);
		Thread.sleep(3000);
		zerodhaforgotpage.clickonreset();
	}
	@Test
	public void clickonbacktologin() {
		ZerodhaForgotPage zerodhaforgotpage = new ZerodhaForgotPage(driver);
		zerodhaforgotpage.clickonbacktologin();
	}
	
}
