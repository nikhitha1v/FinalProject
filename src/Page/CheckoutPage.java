package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	WebDriver driver;
	By gst = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/div/form/fieldset/div/div/input");
	By phone = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[3]/div/input");
	By company = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input");
	By address = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input");
	By city = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/input");
	By pin = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/input");
	By title = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[12]/div/span[1]");
	By state = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form/div/div[6]/div/select");
	By cont = By.xpath("/html/body/div[4]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button");
	
	public CheckoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void setvalues()
	{
		driver.findElement(gst).sendKeys("NIL");
		driver.findElement(phone).sendKeys("1234567890");
		driver.findElement(company).sendKeys("lumnr");
		driver.findElement(address).sendKeys("Flat no 12B");
		driver.findElement(city).sendKeys("Kochi");
		driver.findElement(pin).sendKeys("688550");
	}
	public void click()
	{
		driver.findElement(title).click();
	}
	public void state()
	{
		WebElement w=driver.findElement(state);
		Select s=new Select(w);
		s.selectByVisibleText("Kerala");
	}
	public void cont()
	{
		driver.findElement(cont).click();
	}

}
