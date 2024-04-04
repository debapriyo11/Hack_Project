package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testcases.baseclass;

public class cabPage extends baseclass {

	WebElement Suv,menu,giftcard;
	
	//locators
	By suv_click = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[3]/span");
	By car_options = By.className("font28");
	By hovermenu = By.xpath("//*[@id='root']/div/div[1]/div/div/div/nav/ul/li[10]/span/span[2]/span[1]");
	By hovergiftcard = By.xpath("//*[@id='root']/div/div[1]/div/div/div/nav/ul/li[10]/div/a[2]");
	
	
	//actions
		public void lowestprice() throws InterruptedException {
			Thread.sleep(3000);
			Suv=driver.findElement(suv_click);
			Suv.click();
			Thread.sleep(3000);
			List<WebElement> carprice = driver.findElements(car_options);
			System.out.println(carprice.get(0).getText());
		}
		public void menuclick() throws InterruptedException {
			Thread.sleep(3000);
			menu=driver.findElement(hovermenu);
			Actions at=new Actions(driver);
			at.moveToElement(menu).perform();
			giftcard=driver.findElement(hovergiftcard);
			at.moveToElement(giftcard).perform();
			giftcard.click();
		}
}
