package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	//Locator disclaimer check
	By disclaimerCheck = By.name("setuju");
	
	//Locator for setuju button
	By agreeBtn = By.xpath("//button[text()=\"Setuju\"]");
	
	//Locator for mobile phone number
	By mobileNo = By.name("noponsel");
	
	//Locator for 'kirim kode OTP button'
	By sendotpbtn = By.xpath("//button[text()=\"KIRIM KODE OTP\"]");
	
	//Locator for email field
	By emailAddr = By.name("email_regist");
	
	//Locator for password field
	By password = By.name("pass_regist");
	
	//Locator for confirmation password field
	By confPass = By.name("repass");
	
	//Locator for selesai button
	By finishBtn = By.xpath("//button[text()=\"SELESAI\"]");
	
	//Method fo enter OTP
	public void enterOtp(Integer length) {
		
		for (Integer i = 1; i <= length; i++ ) {
			By orderOtpField = By.name(i.toString());
			wait.until(ExpectedConditions.elementToBeClickable(orderOtpField));
			driver.findElement(orderOtpField).sendKeys(i.toString());
		}
	}
	
	//Method for check disclaimer
	public void check() {
		driver.findElement(disclaimerCheck).click();
	}
	
	//Method for click setuju button
	public void clickAgree() {
		driver.findElement(agreeBtn).click();
	}
	
	//Method for enter mobile no
	public void enterMobileNo(String mobileNumber) {
		driver.findElement(mobileNo).click();
		driver.findElement(mobileNo).sendKeys(mobileNumber);
	}
	
	//Method for click kirim kode otp button
	public void clickOtp() {
			driver.findElement(sendotpbtn).click();
	}
	
	public void enterEmailAddr(String emailAddress) {
		wait.until(ExpectedConditions.elementToBeClickable(emailAddr));
		driver.findElement(emailAddr).sendKeys(emailAddress);
	}
	
	public void enterPass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void enterConfPass(String confirmationPass) {
		driver.findElement(confPass).sendKeys(confirmationPass);
	}
	
	public void clickFinish() {
		wait.until(ExpectedConditions.elementToBeClickable(finishBtn));
		driver.findElement(finishBtn).click();
	}
	

}
