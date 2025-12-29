package base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Baseclass {
	public Logger log;
	 public static WebDriver driver;
	 
	 
	 @BeforeSuite
	 public void openURL() {
	 driver=new ChromeDriver();
	 driver.get("https://www.livelyroot.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 log=Logger.getLogger("HybridLivelyRoot");
	 
	 PropertyConfigurator.configure("Log4j.prorperties");
	 }
	 
	 @AfterSuite
	 public void closeURL() {
		 driver.quit();
	 }
	 
	 public String screenshot(String tname) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source =ts.getScreenshotAs(OutputType.FILE);
		 String dest=System.getProperty("user.dir")+"\\Screenshots\\"+timestamp+"-"+timestamp+"-"+"_img.png";
		 try {
			 FileUtils.copyFile(source, new File(dest));
		 }
		 catch(Exception e) {
			 e.getMessage();
		 }
		 return dest;
		 
	 }
	 
}