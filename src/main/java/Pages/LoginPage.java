package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	WebDriver driver;
	//First web Element
	@FindBy (id="txtUsername")
	private WebElement username;
	
	//Second web Element
	@FindBy (id="txtPassword")
	private WebElement password;
	
	//css("#txtPassword")
	//Third web Element
	@FindBy (xpath="//input[@id='btnLogin']")
	private WebElement button;
	
	//Constructor initialization
	public LoginPage(WebDriver driver) throws IOException
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navToPage() {
		
		System.out.println("Refresh page ");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void enterCred(String name, String pass) {
		
		username.sendKeys(name);
		password.sendKeys(pass);
		
		
	}
	
	public void submit() {
		
		button.click();
	}
	

}
