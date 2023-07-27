package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePage {
	WebDriver driver;
	
	By icon = By.xpath("/html/body/div[4]/header/div[2]/div[1]/div/div[3]/div[1]/ul/li/a");
	By create= By.xpath("//*[@id=\"social-form-login\"]/fieldset/div[4]/div/a");
	By firstname= By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/fieldset[1]/div[1]/div/input");
	By lastname = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/fieldset[1]/div[2]/div/input");
	By email = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/fieldset[1]/div[3]/div/input");
	By password = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/fieldset[2]/div[1]/div/input");
	By confirm = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/fieldset[2]/div[2]/div/input");
	By signup = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/div[2]/div/form/div/div/button");
	public CreatePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void icon()
	{
		driver.findElement(icon).click();
		
	}
	public void create()
	{
		driver.findElement(create).click();
	}
	public void setvalues()
	{
		driver.findElement(firstname).sendKeys("Test");
		driver.findElement(lastname).sendKeys("g");
		driver.findElement(email).sendKeys("loanloanable@gmail.com");
		driver.findElement(password).sendKeys("tester@1234");
		driver.findElement(confirm).sendKeys("tester@1234");
	}
	public void conf()
	{
		driver.findElement(confirm).click();
	}
	public void sign()
	{
		driver.findElement(signup).click();
	}
	

}
