package testcases;

import org.testng.annotations.Test;

import pageobjects.cabPage;

public class Testcab extends baseclass {
	cabPage cp=new cabPage();
	
	
	@Test(priority=6,groups= {"Smoke","Regression"})
  public void showprice() throws Exception{
		cp.lowestprice();
		ss.takeScreenShot("lowcost");
	}
	@Test(priority=7,groups= {"Smoke","Regression"})
	public void menu() throws InterruptedException{
		cp.menuclick();
	}
}
