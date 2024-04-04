package testcases;

import org.testng.annotations.Test;

import pageobjects.homePage;

public class Testhome extends baseclass{
	homePage hp = new homePage();
  
	@Test(priority=1,groups= {"Smoke","Regression"})
  	public void popup() {
		hp.closePopUp();
  	}
	@Test(priority=2,groups= {"Smoke","Regression"})
	public void cab() {
		hp.cabBook();
	}
	@Test(priority=3, groups= {"Smoke","Regression"})
	public void datetravel() throws InterruptedException {
		hp.date();
	}
	@Test(priority=4,groups= {"Smoke","Regression"})
	public void timetravel() throws Exception {
		hp.time();
		ss.takeScreenShot("cabbooking");
	}
	@Test(priority=5,groups= {"Smoke","Regression"})
	public void submittravel() throws InterruptedException {
		hp.submit();
		
	}
}
