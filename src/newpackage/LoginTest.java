package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
	
	public static void main(String[] args) {
		
		
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

	}

}
