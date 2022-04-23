package newpackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class LoginTest {
	
	static ExtentReports extent;
	static ExtentTest test;
	
	public static void main(String[] args) {
		
		extent = new ExtentReports(System.getProperty("user.dir")+"test-output/TestReport.html", true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\satri\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://borrower-stg.klikcair.com/login");
		
		String emailAddress = "beroxa2217@ovout.com";
		String password = "Testpassw0rd#!";
		
		WebElement emailLoginInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/form/div[2]/div/input"));
		emailLoginInput.clear();
		emailLoginInput.click();
		emailLoginInput.sendKeys(emailAddress);
		
		WebElement passwordLoginInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/form/div[3]/div/input"));
		passwordLoginInput.clear();
		passwordLoginInput.click();
		passwordLoginInput.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/form/button"));
		loginButton.click();
		
		test = extent.startTest("passTest");
		test.log(LogStatus.PASS, "Test case is pass");

	}

}
