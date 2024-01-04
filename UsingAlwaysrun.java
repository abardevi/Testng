package testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class UsingAlwaysrun {
  @Test(enabled=false)
  public void firstyear() {
	  String m=null;
	  
	 
	  System.out.println("first year passed");
  }
  @Test(dependsOnMethods="firstyear", alwaysRun=true)
  public void secondyear() {
	  System.out.println("second year passed");
	  
  }
  @Test(dependsOnMethods="secondyear")
  public void thirdyear() {
	  System.out.println("third year passed");
	  
  }
}
