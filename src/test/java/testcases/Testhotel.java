package testcases;

import org.testng.annotations.Test;

import pageobjects.hotelPage;

public class Testhotel extends baseclass {
	hotelPage hop= new hotelPage();
	
	
  @Test(priority=10,groups= {"Smoke","Regression"})
  public void hoteladultdetails() throws Exception {
	  hop.checkhotels();
	  ss.takeScreenShot("hotel");
  }
}
