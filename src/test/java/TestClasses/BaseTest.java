package TestClasses;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public LoginPage login;
	public static  WebDriver driver;
	
	
	@BeforeSuite
	public void initalization() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@AfterSuite
	public void closing() {
		
		driver.close();
	
}
}
