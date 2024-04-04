package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testcases.baseclass;

public class giftcardPage extends baseclass {
	
	WebElement diwalicard,amount,quantity;
	
	//locator
	By diwali_click = By.xpath("//div[@class='gc__right']//div[2]//ul[1]//li[2]//div[1]//img[1]");
	By amount_click = By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[2]/ul/li[2]");
	By quantity_click = By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div[1]/div/div/div[2]/div/span[3]");
	
	//actions
		public void selectgiftcard() throws InterruptedException {
			Thread.sleep(3000);
			diwalicard=driver.findElement(diwali_click);
			diwalicard.click();
			Thread.sleep(2000);
			amount=driver.findElement(amount_click);
			Actions at=new Actions(driver);
			at.moveToElement(amount).click().perform();
			Thread.sleep(2000);
			quantity=driver.findElement(quantity_click);
			at.doubleClick(quantity).click().perform();
		}

}
