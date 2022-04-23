package newpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
//		WebElement completeProfile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/div[4]/div/div/nav/ul/li[2]"));
//		WebElement completeProfileFix = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")));
//		completeProfileFix.click();
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div/div/div/div[1]")));
//		WebElement scrollArea = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div/div/div/div[1]"));
//		System.out.println(scrollArea.isDisplayed());
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].scrollIntoView(true);", scrollArea);
//		
		
//		WebElement TnCCheck = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div/div/div/div[1]/div[2]/label/input"));
//		
		
//		WebElement TnCCheck = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/section/div/div/div/div[1]/div[2]/label/input"));
//		//		TnCCheck.click();
//		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(TnCCheck);
//		actions.click();
//		actions.perform();
		
//		TnCCheck.click();

	}

}
