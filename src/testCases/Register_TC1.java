package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.RegisterPage;

public class Register_TC1 {

	public static void main(String[] args) throws InterruptedException {
		// Use absolute path for chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satri\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://borrower-stg.klikcair.com/register");
		
		//Create object for register page
		RegisterPage register = new RegisterPage(driver, wait);
		
		register.check();
		register.clickAgree();
		register.enterMobileNo("821174615882");
		register.clickOtp();
		register.enterOtp(6);
		register.clickOtp();
		register.enterEmailAddr("bigami3607@idurse.com");
		register.enterPass("P@ssword1!@?");
		register.enterConfPass("P@ssword1!@?");
		register.clickOtp();
		register.clickFinish();
		
		Thread.sleep(4000);

	}

}
