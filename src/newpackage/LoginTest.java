package newpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")));
		
		driver.navigate().to("https://borrower-stg.klikcair.com/lengkapi-profil");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("nama_pic")));
		WebElement picName = driver.findElement(By.name("nama_pic"));
		picName.click();
		picName.sendKeys("Lorem Ipsum");
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[2]/div/div[2]/div/div/label[1]/input"));
		gender.click();
		
		WebElement position = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[3]/div/div[2]/div/div/input"));
		position.click();
		position.sendKeys("Lorem Ipsum");
		
		WebElement idNumber = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[4]/div/div[2]/div/div/input"));
		idNumber.click();
		idNumber.sendKeys("1234567890123456");
		
		WebElement idUpload = driver.findElement(By.xpath("//*[@id=\"upload-cid_file\"]"));
		idUpload.sendKeys("C:\\Users\\satri\\OneDrive\\Documents\\works\\ktp-example\\identity_card_example.b686f703.jpg");
		
		test = extent.startTest("passTest");
		test.log(LogStatus.PASS, "Test case is pass");

	}

}
