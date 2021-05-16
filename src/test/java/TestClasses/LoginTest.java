package TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {
	

	@Test (priority=1)
	public void RefreshPage() throws IOException {
		
		Reporter.log("Refresh Start");
		LoginPage lp=new LoginPage(driver);
		
		lp.navToPage();
		Reporter.log("Refresh End");
		
	}
	
	@Test (priority=2)
	public void  login () throws IOException {
		
		
		LoginPage lp1=new LoginPage(driver);
		Reporter.log("Enter Cred");
		lp1.enterCred("Admin", "admin123");
		Reporter.log("Submit");
		lp1.submit();
		
	}
	
	
	

}
