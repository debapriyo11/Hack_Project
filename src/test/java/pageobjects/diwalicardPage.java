package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testcases.baseclass;

public class diwalicardPage extends baseclass {
	
	WebElement sendername,phoneno,emailid,submit;
	
	//locators
	By sender = By.xpath("//*[@id='deliveredSection']/div/div/div[1]/div/input");
	By phone = By.xpath("//*[@id='deliveredSection']/div/div/div[2]/div[2]/div/input");
	By email = By.xpath("//*[@id='deliveredSection']/div/div/div[3]/div/input");
	By sub = By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div[1]/div[3]/div[2]/div[1]/div[3]/button");
	
	
	//actions
	public void carddetailsinput() throws InterruptedException {
		Thread.sleep(8000);
		sendername=driver.findElement(sender);
		jse.executeScript("arguments[0].click();", sendername);
		sendername.sendKeys("sneha");
		Thread.sleep(3000);
		phoneno=driver.findElement(phone);
		jse.executeScript("arguments[0].click();", phoneno);
		phoneno.sendKeys("9876543210");
		Thread.sleep(3000);
		emailid=driver.findElement(email);
		jse.executeScript("arguments[0].click();", emailid);
		emailid.sendKeys("abc@.com");
		Thread.sleep(3000);
		submit=driver.findElement(sub);
		submit.click();
		
		
	}
}
