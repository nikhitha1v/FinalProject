package Test;

import org.testng.annotations.Test;
import Page.CheckoutPage;

public class CheckoutTest extends CartTest{
	@Test(priority=4)
	public void VerifyCheckout() throws Exception
	{
		CheckoutPage cc= new CheckoutPage(driver);
		Thread.sleep(4000);
		cc.setvalues();
		Thread.sleep(4000);
		cc.click();
		Thread.sleep(4000);
		cc.state();
		Thread.sleep(4000);
		cc.cont();
	}

}
