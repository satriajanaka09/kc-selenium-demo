package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class Login_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Use absolute path for chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satri\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://borrower-stg.klikcair.com/login");
		
		// Create object for login page
		LoginPage login = new LoginPage(driver);
		
		// Enter email address and password
		login.enterEmail("beroxa2217@ovout.com");
		login.enterPassword("Testpassw0rd#!");
		
		// Click masuk button
		login.clickLogin();
		Thread.sleep(3000);
		

	}

}
