package testcases;

import org.testng.annotations.Test;

import pageobjects.giftcardPage;

public class Testgiftcard extends baseclass {
	giftcardPage gp= new giftcardPage();
	
	
  @Test(priority=8,groups= {"Smoke","Regression"})
  public void giftcard() throws Exception {
	  gp.selectgiftcard();
	  ss.takeScreenShot("giftcard");
  }

}
