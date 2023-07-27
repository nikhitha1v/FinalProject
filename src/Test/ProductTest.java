package Test;

import org.testng.annotations.Test;
import Page.ProductPage;

public class ProductTest extends LoginTest{
	@Test(priority=2)
	public void VerifyProduct() throws Exception
	{
		ProductPage pp= new ProductPage(driver);
		Thread.sleep(4000);
		pp.mouse();
		//Thread.sleep(3000);
		//pp.audio();
		Thread.sleep(3000);
		pp.buds();
		Thread.sleep(5000);
		pp.cart();
		
	}

}
