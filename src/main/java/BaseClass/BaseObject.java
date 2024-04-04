package BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseObject {
	
	 public  WebDriver driver= new ChromeDriver() ;
	 
	 @Test(priority=1)
		public void login() throws InterruptedException {

			driver .get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.getTitle();
			popup();
			Thread.sleep(4000);
				}
	 
//	  @Test(priority=2)
//	  	public void popup() {
//	  		try {
//	  		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"notification-frame-b8a5ca96\"]")));
//	  		Thread.sleep(5000);
//	  	    driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
//	  	    driver.switchTo().defaultContent();
//	  	}catch(Exception e) {
//	  		System.out.println(e.getMessage());
//	  	}
//	  	}
//	  
	  @Test(priority=2)
	  	public void popup() {
	  		try {
	  		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-frame']")));
	  		Thread.sleep(2000);
	  	    driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	  	    driver.switchTo().defaultContent();
	  	}catch(Exception e) {
	  		System.out.println(e.getMessage());
	  	}
	  	}
	  public void quit() {
		  driver.quit();
	  }
	  
	  
	  

		public String screenshot(String name) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

			TakesScreenshot takesScreenshot = (TakesScreenshot)driver;

			File file = takesScreenshot.getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir")+"\\Screenshots\\"+name+" " +timeStamp+".png";

			File targetLocation = new File(path);

			FileUtils.copyFile(file, targetLocation);

			return path;

		}
	  

}
