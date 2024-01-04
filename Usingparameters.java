package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Usingparameters {
	@Parameters("url")
  @Test
  public void verifycredientials(String ur) throws InterruptedException {
	  
	  WebDriver driver;
	  driver= new ChromeDriver();
	  driver.get(ur);
	  driver.findElement(By.xpath("//a[@title='My Account']")).click();
	  driver.findElement(By.linkText("Login")).click();
	  
	  driver.findElement(By.id("input-email")).sendKeys("amatooricap9@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("12345");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  Thread.sleep(3330);
	  driver.quit();
	  
  }
}

