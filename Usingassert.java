 package testng;

  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Usingassert {
 
  	public WebDriver driver;
    @Test
    public void assertequalmethod() {
  	  driver= new ChromeDriver();
  	  driver.get("https://www.leafground.com/dashboard.xhtml");
  	  
  	 String actual=driver.getTitle();
  	 String expected="Dashboard";
  	 //1.  Assert.assertEquals
  	assertEquals(actual, expected);
  	 
  	 //2. Assert.assertNotEquals
  	 String exp1="Dominos";
  	 assertNotEquals(actual,exp1);
  	 
  	 //3. Assert.assertTrue 
  	 Assert.assertTrue(expected.contains("ash"));
  	 
  	 //4.Assert.assertFalse
  	 Assert.assertFalse(expected.contains("gaurd"));
  	 
  	 //5. Assert.assertNull
  	 
  	 String f= null;
  	 Assert.assertNull(f);
  	 
  	 //6.Assert.assertNotNull
  	 Assert.assertNotNull(exp1);
  	 //instead of giving Assert.assertEquals we vcan make import as static and just giver assert.equal// import static org.testng.Assert;
  	 
  	 
  	 
}
}