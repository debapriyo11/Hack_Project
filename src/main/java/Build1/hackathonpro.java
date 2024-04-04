

package Build1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hackathonpro {
	
	
	static WebDriver driver;
	
	
	public void launchwebsite() throws InterruptedException 
	{
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.yatra.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	}
	
	  @Test
  public void f() throws InterruptedException {
		  
		  launchwebsite();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
		  //clicking on cab button:
	 driver.findElement(By.xpath("//span[normalize-space()='Cabs']")).click();
	  Thread.sleep(3000);
	 
	  //clicking on one way:
	   driver.findElement(By.xpath("//ul[@class='clearfix mt5']//li[2]")).click();
	
		 
	  //providing Source 
	  WebElement src=driver.findElement(By.xpath("//*[@id=\"BE_cabs_from_station\"]"));
	  src.click();
	  src.sendKeys("Delhi");
	  Thread.sleep(3000);
	  List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"booking_engine_modues\"]/div/div[1]/div[2]/ul[4]/li[1]/div/div/ul/div/div/div/li"));
	 for(int i =0; i<list.size();i++) 
		 if(list.get(i).getText().equals("Delhi")) {
			 list.get(i).click();
			 Thread.sleep(2000);
	 }
 
	 //providing Destination:
	  WebElement des=driver.findElement(By.xpath("//input[@id='BE_cabs_to_station']"));
	  des.click();
	  des.sendKeys("Manali");
	  Thread.sleep(3000);
	  List<WebElement> list1 = driver.findElements(By.xpath("//*[@id=\"booking_engine_modues\"]/div/div[1]/div[2]/ul[4]/li[3]/div/div/ul/div/div/div/li"));
	 for(int k =0; k<list1.size();k++)
		 if(list1.get(k).getText().equals("Manali")) {
			 list1.get(k).click();
			 Thread.sleep(2000);
			}  
	 
	 //journey date:
	 driver.findElement(By.xpath("//*[@id=\"BE_cabs_checkin_date\"]")).click();
	 for(int k=0; k<3; k++) {
		 try {
			 List<WebElement> list2 = driver.findElements(By.xpath("//*[@id=\"month-scroll1\"]/div/div[2]/table/tbody/tr/td"));
			 for(int i =0; i<list2.size();i++)
				 if(list2.get(i).getText().equals("16")) {
					 list2.get(i).click();

					//providing time:
					 driver.findElement(By.xpath("//*[@id=\"checkInTimeField\"]")).click();
					 List<WebElement> stime = driver.findElements(By.xpath("//*[@id=\"checkInTimeList\"]/ul/li"));
					 for(int j =0; j<stime.size();j++) 
						 if(stime.get(j).getText().equals("6:00 am")) {
							 stime.get(j).click();
						 }
				 }
			 break;
		}
 	catch (Exception e) {
			// TODO: handle exception
			System.out.println("Stale -> " + e.getMessage());
		}
	 }
	 
	 //clicking on the search button:
	 for(int i=0; i<3; i++) {
	    	try {
	    		WebElement search= driver.findElement(By.xpath("//input[@type='submit'][@value='Search Cabs']"));
	    		search.click();
	    		break;
			} catch (Exception e) {
				System.out.println("Stale : " + e.getMessage());
	  }
	    	
	 }
	 Thread.sleep(4000);
	// List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"srp-tuple\"]"));
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class=\"cName fs14\"]/h2"));
		for(WebElement e:ele)
		{
			if(e.getText().equals("SUV")) {
				WebElement ele1 = e.findElement(By.xpath("//*[@id=\"root\"]/div/div[6]/div[1]/div[1]/p"));
				System.out.println(ele1.getText());
				WebElement ele2 = e.findElement(By.xpath("//*[@id=\"root\"]/div/div[6]/div[1]/div[1]/h2"));
				System.out.println(ele2.getText());
			WebElement ele3 = e.findElement(By.xpath("//*[@id=\"root\"]/div/div[6]/div[1]/div[2]/div[1]/div[1]/button"));
			System.out.println(ele3.getText());
			}
}
		//Returning back to homepage:
		driver.navigate().back();
		Thread.sleep(3000);
		String parentWindow=driver.getWindowHandle();
		
		//Hovering on more option:
		WebElement el=driver.findElement(By.xpath("//*[@id=\"bEnginePos\"]/ul/li[7]/span"));
		Actions at =new Actions(driver);
		at.moveToElement(el).perform();
		Thread.sleep(2000);
		
		//clicking on gift Vouchers:
		driver.findElement(By.id("booking_engine_gift_voucher")).click();
		
		Set<String> windows=driver.getWindowHandles();
		for(String win : windows) {
			if(!win.equals(parentWindow)) {
				driver.switchTo().window(win);
			}
		}
		
		//clicking on the shop now button:
		driver.findElement(By.cssSelector("a.shop_now")).click();
		Thread.sleep(2000);
//		
//		//Adding details in gift card:
	  try {
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"denomination-and-quantity\"]/div[1]/div/div/div"));
		amt.sendKeys("500");
		WebElement quant=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
		quant.sendKeys("3");
	  }catch (Exception e) {
		   System.out.println("stale->"+e.getMessage());
	  }
		
		//WebElement sc=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		//js.executeScript("arguments[0].ScrollIntoView();",sc);
		//Adding senders data:
		WebElement sname=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		sname.sendKeys("Debapriyo");
		WebElement slname=driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		slname.sendKeys("Chandra");
		WebElement semail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		semail.sendKeys("Debapriyo@.com");
		WebElement sno=driver.findElement(By.xpath("//*[@id=\"sender-details\"]/div[2]/div/div[4]/div/label"));
		sno.sendKeys("8617252032");
		Thread.sleep(2000);
		
		//Adding receivers data:
				WebElement rname=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
				rname.sendKeys("Akash");
				WebElement rlname=driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
				rlname.sendKeys("Saha");
				WebElement remail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
				remail.sendKeys("Debapriyo@.com");
				WebElement messege=driver.findElement(By.xpath("//*[@id=\"giftMessage\"]"));
				messege.sendKeys("Surprise");
				Thread.sleep(2000);
		
		
		
		
	  }
}

	  