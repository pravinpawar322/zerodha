package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Parameterization;

@Listeners(TestListeners.class)

public class ZerodhaLoginPageTest {
       
	   WebDriver driver; 
	   @BeforeMethod
	   public void openbrowser() {
		  driver = Browser.openbrowser();
	   }
	  
	   
	   @Test
	   public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException {
		 ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		 String userid = Parameterization.getdata(0, 1);
		 zerodhaloginpage.enteruserid(userid);
		 String password = Parameterization.getdata(1, 1);
		 zerodhaloginpage.enterpassword(password);
		 zerodhaloginpage.clickonlogin();
	   }
	   @Test(dependsOnMethods = {"loginwithvalidcredentialsTest"})
	   public void clickonforgotlinkTest() {
		 ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		 zerodhaloginpage .clickonforgot();
	   }
	   @Test
	   public void clickonsignupTest() {
		   ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		   zerodhaloginpage.clickonsignup();
	   }
	   
}
