package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Usinparamettest {
	public WebDriver driver;
	@Parameters({"url","userid","password"})
  @Test
  public void loginsauce(@Optional("https://tutorialsninja.com/demo/")String ur, String uid, String pas) throws InterruptedException {
	  //using parameter at suite level runnin same test case with different parameters, at test level also we can send different parameters
	  driver= new ChromeDriver();
	  driver.get(ur);
	  driver.findElement(By.id("user-name")).sendKeys(uid);
	  driver.findElement(By.id("password")).sendKeys(pas);
	  driver.findElement(By.id("login-button")).click();
	  
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
