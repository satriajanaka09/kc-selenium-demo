package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;

import java.time.Duration;


public class RegisterTest {
	  public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\satri\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://borrower-stg.klikcair.com/register");
		  
		  String mobilePhoneNumber = "81655537121";
		  String emailAddress = "beroxa2217@ovout.com";
		  String password = "Testpassw0rd#!";
		  
		  WebElement disclaimerCheck = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/label/input"));
		  boolean expectedDisclaimerCheckOnBeginning = false;
		  
		  Assert.assertEquals(disclaimerCheck.isSelected(), expectedDisclaimerCheckOnBeginning, "Disclaimer check is true");
		  System.out.println("Pass assertion 1");
		  
		  disclaimerCheck.click();
		  System.out.println("Disclaimer check is checked" + disclaimerCheck.isSelected());
		  
		  WebElement agreeButton = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button"));
		  agreeButton.click();
		  
		  WebElement mobilePhoneNoInput = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/input"));
		  mobilePhoneNoInput.clear();
		  mobilePhoneNoInput.click();
		  mobilePhoneNoInput.sendKeys(mobilePhoneNumber);
		  System.out.println("Current mobile phone number : " + mobilePhoneNoInput.getAttribute("value"));
		  System.out.println("Current mobile phone number regex test result : " + mobilePhoneNoInput.getAttribute("value").matches("[0-9]{3,}"));
		  Assert.assertEquals(mobilePhoneNoInput.getAttribute("value").matches("[0-9]{3,}"), true);
		  System.out.println("Pass Assertion 2");
		  
		  WebElement sendOTPButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/button"));
		  sendOTPButton.click();
		  String currentSendOTPButtonClass = sendOTPButton.getAttribute("class");
		  String expectedCurrentSendOTPButtonClass = " block btn-kc disable";
		  
		  System.out.println("current class of send otp button is : " + currentSendOTPButtonClass);
		  Assert.assertEquals(currentSendOTPButtonClass, expectedCurrentSendOTPButtonClass);
		  System.out.println("Pass assertion on send OTP Button");
		  
		  
		  String firstPartOTPPath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div/div/div[";
		  String secondPartOTPPath = "]/input";
		  
		  
		  for(Integer x = 1; x < 7; x++) {
			  WebElement OTPInput = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.elementToBeClickable(By.xpath(firstPartOTPPath + x + secondPartOTPPath)));
			  OTPInput.click();
			  OTPInput.sendKeys(x.toString());
		  }
		  
		 WebElement secondSendOTPButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/button"));
		 secondSendOTPButton.click();
		 
		 WebElement emailInput = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/input")));
		 emailInput.clear();
		 emailInput.click();
		 emailInput.sendKeys(emailAddress);
		 
		 WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/div/input"));
		 passwordInput.clear();
		 passwordInput.click();
		 passwordInput.sendKeys(password);
		 
		 System.out.println("Regex password test result : " + passwordInput.getAttribute("value").matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$"));
		 
		 WebElement confirmationPasswordInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[3]/div/input"));
		 confirmationPasswordInput.clear();
		 confirmationPasswordInput.click();
		 confirmationPasswordInput.sendKeys(password);
		 
		 System.out.println("Regex password test result : " + confirmationPasswordInput.getAttribute("value").matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$"));
		 
		 WebElement sendOTPCodeButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/button"));
		 
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", sendOTPCodeButton);
		 
		 WebElement finishButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/button"));
		 executor.executeScript("arguments[0].click();", finishButton);
		  
	  }
}
