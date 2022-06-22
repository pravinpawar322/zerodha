package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
    
	public static void getscreenshot(WebDriver driver,String name) throws IOException {
		
		String d = Screenshot.date();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\screenshot\\"+ name + d +".jpg");
		FileHandler.copy(source, destination);
		
	}
	
	public static String date() {
		
		DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime localdatetime = LocalDateTime.now();
		String d = datetimeformatter.format(localdatetime);
		return d;
	}
	
	
}
