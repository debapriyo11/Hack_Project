package testcases;

import org.testng.annotations.Test;

import pageobjects.diwalicardPage;

public class TestDiwalicard extends baseclass {
	diwalicardPage dp= new diwalicardPage();
	
	
  @Test(priority=9,groups= {"Smoke","Regression"})
   public void carddata() throws Exception {
	  dp.carddetailsinput();
	  ss.takeScreenShot("diwalicard");
  }
}
