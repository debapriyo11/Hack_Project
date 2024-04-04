package testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utilities.Reportgenerator;
import utilities.Screenshot;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;

public class baseclass extends Reportgenerator{
	public static WebDriver driver;
	public static JavascriptExecutor jse;
	public static TakesScreenshot ts;
	public static Screenshot ss = new Screenshot();
  
  @BeforeSuite(groups="Smoke")
  @Parameters("browser")
  public void beforeSuite(String br) {
	  if(br.equalsIgnoreCase("chrome")) {
	  
	   driver = new ChromeDriver();   
	  }
	  else if(br.equalsIgnoreCase("edge")){
		  driver = new EdgeDriver();
	  }
	  else {
		  System.out.println("no browser found");  
	  }
	  
	  jse = (JavascriptExecutor)driver;
	  ts = (TakesScreenshot)driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.makemytrip.com/");
	  driver.manage().window().maximize();
  }

  @AfterSuite(groups="Smoke")
  public void afterSuite() {
	  System.out.println("Test finished");
	  driver.quit();
  }

}
