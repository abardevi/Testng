package groupstest;

import org.testng.annotations.Test;

public class Usingyocolor {
	 @Test(groups= {"ios.orange", "windows.smoke", "All"})
	  public void torino() {
		  System.out.println("torino owned");
	  }
	  @Test(groups= {"orange","windows.smoke", "All"})
	  public void mazza() {
		  System.out.println("mazza owned");
	  }
	 
	  
	  @Test(groups= {"brown","sanity","All"})
	  public void cococola() {
		  System.out.println("cocola owned");}
	  
		  @Test(groups= {"clear","regression","All"})
		  public void sprite() {
			  System.out.println("sprite owned");
	  }
		  @Test(groups= {"clear","regression","All"})
		  public void soda() {
			  System.out.println("soda owned");}
}