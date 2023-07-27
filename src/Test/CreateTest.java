package Test;

import org.testng.annotations.Test;

import Base.BaseClass;
import Page.CreatePage;

public class CreateTest extends BaseClass{
	
	@Test
	public void verify() throws Exception
	{
		CreatePage g = new CreatePage(driver);
		Thread.sleep(3000);
		g.icon();
		Thread.sleep(3000);
		g.create();
		Thread.sleep(3000);
		g.setvalues();
		Thread.sleep(3000);
		g.conf();
		Thread.sleep(3000);
		g.sign();
		
	}
	

}
