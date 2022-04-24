package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CompleteProfilePage;
import pages.LoginPage;

public class CompleteProfile_TC1 {

	public static void main(String[] args) throws InterruptedException {
				// Use absolute path for chrome driver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\satri\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://borrower-stg.klikcair.com/login");
				
				// Create object for login page
				LoginPage login = new LoginPage(driver);
				CompleteProfilePage dashboard = new CompleteProfilePage(driver, wait);
				
				// Enter email address and password
				login.enterEmail("beroxa2217@ovout.com");
				login.enterPassword("Testpassw0rd#!");
				
				// Click masuk button
				login.clickLogin();
				
				dashboard.navigateToCompleteProfile();
				dashboard.fillPic("Lorem Ipsum");
				dashboard.chooseGender("L");
				dashboard.fillPosition("CEO");
				dashboard.fillKTPNumber("1234567890123456");
				dashboard.uploadId("C:\\Users\\satri\\OneDrive\\Documents\\works\\ktp-example\\identity_card_example.b686f703.jpg");
				dashboard.uploadSelfie("C:\\Users\\satri\\OneDrive\\Documents\\works\\ktp-example\\selfie_example.b686f703.jpg");
				dashboard.fillBornPlace("DKI Jakarta");
				dashboard.fillBornDate("01-01-1989");
				dashboard.selectProvinsi("Banten");

	}

}
