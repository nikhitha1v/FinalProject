package Test;

import org.testng.annotations.Test;
import Page.LoginPage;
import Base.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test(priority=1)
	public void logon() throws Exception
	{
		LoginPage h = new LoginPage(driver);
		Thread.sleep(3000);
		h.click();
		Thread.sleep(3000);
		h.passvalues();
		Thread.sleep(3000);
		h.log();
		
	}
	

}
