package enable;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Usingignore {
	
	
@Ignore
 @Test
	  public void facebook() throws InterruptedException {
	 WebDriver driver;
		  driver= new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(2000);
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(3000);
		  driver.close();}
}
