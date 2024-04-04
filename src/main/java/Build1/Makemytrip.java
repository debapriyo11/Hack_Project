package Build1;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BaseObject;

public class Makemytrip extends BaseObject{
  
//  public  WebDriver driver= new ChromeDriver() ;
//  @Test(priority=2)
//  	public void popup() {
//  		try {
//  		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"notification-frame-b8a5ca96\"]")));
//  		Thread.sleep(5000);
//  	    driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]")).click();
//  	    driver.switchTo().defaultContent();
//  	}catch(Exception e) {
//  		System.out.println(e.getMessage());
//  	}
//  	}
//  
//  @Test(priority=1)
//	public void login() throws InterruptedException {
//
//		driver .get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//		driver.getTitle();
//		popup();
//		Thread.sleep(4000);
//			}
// 
 @Test(priority=3)
 	public void location() throws InterruptedException
 	{
 		driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[7]/span/a/span[1]/span")).click();
 		Thread.sleep(3000);
 		WebElement from=driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
 		  from.click();
 		  Thread.sleep(2000);
 		 driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("delhi");
 		 Thread.sleep(3000);
 		 try {
 		 List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul/li"));
 		 
 		 for(int i =0; i<list.size();i++)
 		 {
 			 if(list.get(i).getText().equals("Delhi, India")) {
 				 list.get(i).click();
 				 break;
 			 }
 		 }
 		 }catch(Exception e) {
 			 
 		 }
 		 
// 		 
		 driver.findElement(By.xpath("//*[@id=\'top-banner\']/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("manali");
		 Thread.sleep(2000);
		 try {
		 List<WebElement> list1 = driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul/li"));
		 for(int i =0; i<list1.size();i++)
		 {
			 if(list1.get(i).getText().equals("Manali, Himachal Pradesh, India")) {
				 list1.get(i).click();
			 }
		 }
		 }catch(Exception e) {
		 }
 	}
		 
		 @Test(priority=4)
		public void date() throws InterruptedException{ 
			 Thread.sleep(5000);
			 try {
			 List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div"));
			 for(int i =0; i<date.size();i++) {
				 if(date.get(i).getText().equals("16")) {
					 date.get(i).click();
		 }	 
			 }
			 }catch(Exception e) {
				 
			 }
}
		 
		 @Test(priority=5)
		 public void time() throws InterruptedException {
			 Thread.sleep(2000);
			 List<WebElement> timesubmit1 = driver.findElements(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div/div[5]/div[1]/div[2]/ul[1]/li"));
			 for(int i =0; i<timesubmit1.size();i++) {
				 if(timesubmit1.get(i).getText().equals("09 Hr")) {
					 timesubmit1.get(i).click();
				 }
			 }
			 List<WebElement> timesubmit2 = driver.findElements(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div/div[5]/div[1]/div[2]/ul[2]/li"));
			 for(int i =0; i<timesubmit2.size();i++) {
				 if(timesubmit2.get(i).getText().equals("05 min")) {
					 timesubmit2.get(i).click();
				 }
			 }
			 List<WebElement> timesubmit3 = driver.findElements(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div/div[5]/div[1]/div[2]/ul[3]/li"));
			 for(int i =0; i<timesubmit3.size();i++) {
				 if(timesubmit3.get(i).getText().equals("Am")) {
					 timesubmit3.get(i).click();
				 }
			 }
					 
					 //Clicking on apply:
					 driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div/div[5]/div[1]/div[1]/div[5]/span")).click();
					 
					 //Clicking on submit:
					 driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/p/a")).click();
					 
					 //Clicking on SUV:
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[3]/span/label")).click();

		 }
		 @Test(priority=6)
		 public void selectcar() throws InterruptedException {
			 Thread.sleep(3000);
//		 List<WebElement> carname = driver.findElements(By.xpath("span[.='latoBlack']"));
//				 System.out.println(carname.get(0).getText());
	 
			 List<WebElement> carprice = driver.findElements(By.className("font28"));
				 System.out.println(carprice.get(0).getText());
		 }
		 @Test(priority=7)
			public void moreMenu() throws InterruptedException
			{
				Thread.sleep(3000);
				WebElement hover=driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div/div/div/nav/ul/li[10]/span/span[2]/span[1]"));
				Actions act=new Actions(driver);
				act.moveToElement(hover).perform();

				WebElement hoverMenu=driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div/div/div/nav/ul/li[10]/div/a[2]"));
				Actions act1=new Actions(driver);
				act1.moveToElement(hoverMenu).perform();
				hoverMenu.click();
			}
			@Test(priority=8)
			public void selectCard() throws InterruptedException
			{
				Thread.sleep(3000);
				//click card 
			WebElement diwaliCard=driver.findElement(By.xpath("//div[@class='gc__right']//div[2]//ul[1]//li[2]//div[1]//img[1]"));
			diwaliCard.click();
			Thread.sleep(2000);
			//Enter card details
			//WebElement amount=driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/div/div[1]"));
			//amount.click();
			//input amount
			WebElement amount=driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[2]/ul/li[2]"));
			Actions act2=new Actions(driver);
			act2.moveToElement(amount).click().perform();
			//amount.click();
			//act2.sendKeys("BACKSPACE").perform();
			Thread.sleep(3000);

			//click numbers
			WebElement quantity=driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/div/div[2]/div/span[3]"));
			Actions act3=new Actions(driver);
			act3.doubleClick(quantity).perform();
			quantity.click();
			
			}

			@Test(priority=9)
			public void cardDetails() throws InterruptedException, IOException
			{
				JavascriptExecutor js= (JavascriptExecutor)driver;
//				WebElement scrool=driver.findElement(By.xpath("//*[@id=\\\"deliveredSection\\\"]/div/div/div[1]/div/input"));
//			     js.executeScript("arguments[0].scrollIntoView();", scrool);
				
				Thread.sleep(8000);
				
				WebElement sender=driver.findElement(By.xpath("//*[@id=\"deliveredSection\"]/div/div/div[1]/div/input"));
				js.executeScript("arguments[0].click();", sender);
				sender.sendKeys("Sneha");
				Thread.sleep(5000);
				WebElement phnNo=driver.findElement(By.xpath("//*[@id=\"deliveredSection\"]/div/div/div[2]/div[2]/div/input"));
				js.executeScript("arguments[0].click();", phnNo);
				phnNo.sendKeys("9876543210");
				Thread.sleep(5000);
				WebElement email=driver.findElement(By.xpath("//*[@id=\"deliveredSection\"]/div/div/div[3]/div/input"));
				js.executeScript("arguments[0].click();", email);
				email.sendKeys("abc@.com");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/div[3]/div[2]/div[1]/div[3]/button")).click();
				
				screenshot("mail validation");//calling screenshot method to screenshot
				}
			
			@Test(priority=10)
			  public void clickRooms() throws InterruptedException {
				Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
			    	WebElement ele=  driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/nav/ul/li[2]/span/a"));
			    	js.executeScript("arguments[0].click();", ele);
			    	 Thread.sleep(5000);
			    	
			    	 //clicking on rooms and guest:
			    	driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[4]")).click();
			    	
			    	//clicking on adults:
			     driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div")).click();
			    	List<WebElement>adlist = driver.findElements(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/ul/li"));
			    	Thread.sleep(5000);
			    	for(WebElement w :adlist) {
			    		System.out.println(w.getText());
			    		}
			    	Thread.sleep(3000);
			 
			    }

			
  public void f() throws InterruptedException {
	  popup();
//	  
//	  location();
//	  date();
//	  time();
//	  selectcar();
//	  moreMenu();
//	  selectCard();
//	  cardDetails();
//	  clickRooms();
//	  
  }
}
