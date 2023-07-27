package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;
	By accessories = By.xpath("/html/body/div[4]/div[1]/div/nav/div/ul/li[2]/a/span");
	By audio = By.xpath("/html/body/div[4]/div[1]/div/nav/div/ul/li[2]/div[2]/div/div/div/div/div/ul/li[2]/p/a/img");
	By syskabuds = By.xpath("/html/body/div[4]/main/div[4]/div[1]/div[3]/div/div/ol/li[6]/div/div[1]/a");
	By cart = By.xpath("/html/body/div[4]/main/div[2]/div/div[1]/div[4]/form/div/div/div[2]/button");
	
	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void mouse()
	{
		
		driver.get("https://syska.co.in/accessories.html");
	}
	public void audio()
	{
		driver.findElement(audio).click();
	}
	public void buds()
	{
		driver.findElement(syskabuds).click();
	}
	public void cart()
	{
		driver.findElement(cart).click();
	}
	 

}
