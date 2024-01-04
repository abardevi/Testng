package groupstest;

import org.testng.annotations.Test;
@Test(groups="all")

public class Usingcolorgroup {
  @Test(groups= {"windows.brown","sanity","All"})
  public void pepsi() {
	  System.out.println("pepsi owned");
  }
  @Test(groups= {"windows.orange", "smoke", "All"})
  public void slice() {
	  System.out.println("slice owned");}
  @Test(groups= {"windows.brown","sanity","All"})
  public void bovonto() {
	  System.out.println("bovonto owned");
  }
  @Test(groups= {"ios.clear","regression","All"})
  public void sevenup() {
	  System.out.println("sevenup owned");
}
  @Test(groups= {"ios.clear","regression","All"})
  public void paneer() {
	  System.out.println("panner owned");} 
}
