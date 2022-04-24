package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator for email address field
	By emailAddress = By.name("email");
	
	//Locator for password field
	By password = By.name("password");
	
	//Locator for button masuk
	By enterBtn = By.xpath("//button[text()=\"MASUK\"]");
	
	//Method for enter email address
	public void enterEmail(String email) {
		driver.findElement(emailAddress).sendKeys(email);
	}
	
	//Method for enter password
	public void enterPassword(String psswd) {
		driver.findElement(password).sendKeys(psswd);
	}
	
	//Method for click login
	public void clickLogin() {
		driver.findElement(enterBtn).click();
	}
	
	
	
}
