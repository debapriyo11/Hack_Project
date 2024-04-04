package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testcases.baseclass;

public class hotelPage extends baseclass {
	
	WebElement hotel,guest,adult;
	
	//locators
	By hotelclick = By.xpath("//*[@id='SW']/div/div/div/div/nav/ul/li[2]/span/a");
	By guestclick = By.xpath("//*[@id='top-banner']/div[2]/div/div[1]/div[2]/div/div[1]/div[4]");
	By adultclick = By.xpath("//*[@id='top-banner']/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div");
	By li_adult = By.xpath("//*[@id='top-banner']/div[2]/div/div[1]/div[2]/div/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/ul/li");
	
	
	//actions
	public void checkhotels() throws InterruptedException {
		Thread.sleep(3000);
		hotel=driver.findElement(hotelclick);
		jse.executeScript("arguments[0].click();", hotel);
		Thread.sleep(5000);	
		guest=driver.findElement(guestclick);
		guest.click();
		adult=driver.findElement(adultclick);
		adult.click();
		List<WebElement>adlist = driver.findElements(li_adult);
		Thread.sleep(5000);
		System.out.println(adlist);
    	for(WebElement w :adlist) {
    		System.out.println(w.getText());
    		}
    	Thread.sleep(3000);
 
    }
		
	}

