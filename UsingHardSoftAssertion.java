package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardSoftAssertion {
	
	//hard assertion --will stop executing the code and wont proceed further
  @Test(priority=1)
  public void start() {
	  String key="fail";
	  Assert.assertNull(key);
  }
  @Test(priority=2)
  public void bikestart() {
	  System.out.println("bike is started");
  }
  
  @Test(priority=3)
  public void bikeriding() {
	  System.out.println("bike is rided");
  }
  @Test(priority=4)
  public void breaks() {
	  System.out.println("break failure");
  }
}
