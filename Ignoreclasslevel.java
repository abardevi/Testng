package enable;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore

public class Ignoreclasslevel {
  
  @Test
  public void woodcut() {
	  System.out.println("wood cutted");
  }
  @Test
  public void table() {
	  System.out.println("Makingtable");
  }
  @Test
  public void sell() {
	  System.out.println("sellingtable");
  }
}
