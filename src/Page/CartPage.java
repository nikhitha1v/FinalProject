package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	By cart = By.xpath("/html/body/div[4]/header/div[2]/div[3]");
	By view= By.xpath("/html/body/div[4]/header/div[2]/div[3]/div/div/div/div[2]/div[5]/div/a");
	By checkout= By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div/div[1]/ul/li/button");
	
	public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void cart()
	{
		driver.findElement(cart).click();
	}
	public void view()
	{
		driver.findElement(view).click();
	}
	public void checkout()
	{
		driver.findElement(checkout).click();
	}
	

}
