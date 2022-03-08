package learnmaven;
import org.testng.annotations.Test;

public class SeleniumTest {

	//Trigger TestNG XML file from Maven
	@Test
	public void BrowserAutomation() 
	{
		System.out.println("BrowserAutomation");
		
		//changes done by GITX
		System.out.println("WebAutomation");
	}
	
	@Test
	public void elementsUI() 
	{
		System.out.println("elementsUI");
	}
}

