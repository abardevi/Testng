package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Usinghardassrt {
	WebDriver driver;
  @Test
  public void samplemethod() {
	  driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
	  
	 String actualtitle= driver.getTitle();
	  String expectedtitle="Your Store";
	  Assert.assertEquals(actualtitle, expectedtitle);
	  
	  String actualUrl=driver.getCurrentUrl();
	  
	  String expectedurl="https://tutorialsninja.com/demo/";
	  Assert.assertEquals(actualUrl, expectedurl);
	  
	  driver.findElement(By.name("search")).sendKeys("HP" +Keys.ENTER);
	  Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	  driver.quit();
	  
  }
}
