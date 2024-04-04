package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testcases.baseclass;

public class homePage extends baseclass{

	WebElement frame,closeOption,cab,source,sourceValue,destination,apply,search;
	
	//locators
	By iframe_loc = By.xpath("//*[@id='webklipper-publisher-widget-container-notification-frame']");
	By closeop_loc = By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']");
	By cab_click = By.xpath("//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[7]/span/a/span[1]/span");
	By From_loc = By.xpath("//*[@id='fromCity']");
	By From_value = By.xpath("//*[@id='top-banner']/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input");
	By li_value = By.xpath("//*[@id='react-autowhatever-1']/div/ul/li");
	By Des_value = By.xpath("//*[@id='top-banner']/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input");
	By li_value2 = By.xpath("//*[@id='react-autowhatever-1']/div/ul/li");
	By li_value3 = By.xpath("//*[@id='top-banner']/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div");
	By li_value4 = By.xpath("//*[@id='top-banner']/div[2]/div/div/div[2]/div/div[5]/div[1]/div[2]/ul[1]/li");
	By li_value5 = By.xpath("//*[@id='top-banner']/div[2]/div/div/div[2]/div/div[5]/div[1]/div[2]/ul[2]/li");
	By li_value6 = By.xpath("//*[@id='top-banner']/div[2]/div/div/div[2]/div/div[5]/div[1]/div[2]/ul[3]/li");
	By apply_click = By.xpath("//span[text()='APPLY']");
	By search_click = By.xpath("//a[text()='Search']");
	
	//actions
	public void closePopUp() {
		try {
		frame = driver.findElement(iframe_loc);
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		closeOption = driver.findElement(closeop_loc);
		closeOption.click();
		driver.switchTo().defaultContent();
		}
		catch(Exception e) {
			System.out.println("no popup");
		}
	}
	public void cabBook() {
		try {
			cab=driver.findElement(cab_click);
			cab.click();
			source=driver.findElement(From_loc);
			source.click();
			Thread.sleep(2000);
			sourceValue=driver.findElement(From_value);
			sourceValue.sendKeys("delhi");
			Thread.sleep(2000);
			List<WebElement> list1 = driver.findElements(li_value);
			for(int i =0; i<list1.size();i++)
	 		 {
	 			 if(list1.get(i).getText().equals("Delhi, India")) {
	 				 list1.get(i).click();
	 				 break;
	 			 }
	 		 }
			destination=driver.findElement(Des_value);
			destination.sendKeys("manali");
			Thread.sleep(2000);
			List<WebElement> list2 = driver.findElements(li_value2);
			for(int i =0; i<list2.size();i++)
			 {
				 if(list2.get(i).getText().equals("Manali, Himachal Pradesh, India")) {
					 list2.get(i).click();
					 break;
				 }
			 }
		}
			catch(Exception e) {
				System.out.println("error : " + e.getMessage() );
			}
	}
		public void date() throws InterruptedException {
			Thread.sleep(2000);
			try {
			List<WebElement> list3 = driver.findElements(li_value3);
			for(int i =0; i<list3.size();i++) {
				 if(list3.get(i).getText().equals("16")) {
					 list3.get(i).click();
		 }	 
			 }
		}
		catch(Exception e) {}
	}
		public void time() throws InterruptedException {
			Thread.sleep(2000);
			List<WebElement> list4 = driver.findElements(li_value4);
			 for(int i =0; i<list4.size();i++) {
				 if(list4.get(i).getText().equals("09 Hr")) {
					 list4.get(i).click();
				 }
			 }
			 List<WebElement> list5 = driver.findElements(li_value5);
			 for(int i =0; i<list5.size();i++) {
				 if(list5.get(i).getText().equals("05 min")) {
					 list5.get(i).click();
				 }
			 }
			 List<WebElement> list6 = driver.findElements(li_value5);
			 for(int i =0; i<list6.size();i++) {
				 if(list6.get(i).getText().equals("Am")) {
					 list6.get(i).click();
				 }
			 }
			 Thread.sleep(1000);
			 apply=driver.findElement(apply_click);
			 apply.click();
			 
		}	
	public void submit() throws InterruptedException { 
		Thread.sleep(1000);
		search=driver.findElement(search_click);
		search.click();	 
}
}
