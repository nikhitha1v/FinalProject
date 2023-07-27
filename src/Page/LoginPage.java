package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By icon = By.xpath("/html/body/div[4]/header/div[2]/div[1]/div/div[3]/div[1]/ul/li/a");
	By emeil = By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/form/fieldset/div[1]/div/input");
	By password = By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/form/fieldset/div[2]/div/input");
	By login = By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/form/fieldset/div[3]/div[1]/button");

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(icon).click();
	}
	public void passvalues()
	{
		driver.findElement(emeil).sendKeys("loanloanable@gmail.com");
		driver.findElement(password).sendKeys("tester@1234");		
	}
	public void log()
	{
		driver.findElement(login).click();
	}
}
