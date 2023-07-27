package Test;

import org.testng.annotations.Test;
import Page.CartPage;

public class CartTest extends ProductTest{
	@Test(priority=3)
	public void VerifyCart() throws Exception
	{
		CartPage cp= new CartPage(driver);
		Thread.sleep(3000);
		cp.cart();
		Thread.sleep(3000);
		cp.view();
		Thread.sleep(3000);
		cp.checkout();
		
	}
	

}
