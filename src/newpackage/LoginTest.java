package newpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
		
		WebElement selfieUpload = driver.findElement(By.xpath("//*[@id=\"upload-selfie_file\"]"));
		selfieUpload.sendKeys("C:\\Users\\satri\\OneDrive\\Documents\\works\\ktp-example\\selfie_example.b686f703.jpg");
		
		WebElement bornPlace = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[8]/div/div[2]/div/div/input"));
		bornPlace.sendKeys("Lorem inpsum");
		
		WebElement bornDate = driver.findElement(By.xpath("//*[@id=\"tgl_lahir\"]"));
		bornDate.sendKeys("01-01-1989");
		
		Select drpState = new Select(driver.findElement(By.xpath("//*[@id=\"provinsi\"]")));
		drpState.selectByVisibleText("Banten");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.xpath("//*[@id=\"kota\"]"), By.tagName("option")));
		
		Select drpCity = new Select(driver.findElement(By.xpath("//*[@id=\"kota\"]")));
		drpCity.selectByVisibleText("Tangerang Selatan Kota");
		
		Select drpKecamatan = new Select(driver.findElement(By.xpath("//*[@id=\"kecamatan\"]")));
		drpKecamatan.selectByVisibleText("Pamulang");
		
		Select drpKelurahan = new Select(driver.findElement(By.xpath("//*[@id=\"kelurahan\"]")));
		drpKelurahan.selectByVisibleText("Pondok Benda");
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[16]/div/div[2]/div/textarea"));
		address.click();
		address.sendKeys("Jl Makmur Jaya RT 002 RW 005");
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[17]/button"));
		nextButton.click();
		
		test = extent.startTest("passTest");
		test.log(LogStatus.PASS, "Test case is pass");

	}

}
