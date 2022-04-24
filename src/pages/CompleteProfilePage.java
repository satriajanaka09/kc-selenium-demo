package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteProfilePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CompleteProfilePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	//Locator for lengkapi profile
	By lengkapiProfil = By.xpath("//a[@href=\"/lengkapi-profil\"]");
	
	//Locator for nama PIC
	By pic = By.name("nama_pic");
	
	//Locator for position
	By position = By.name("jabatan");
	
	//Locator for KTP Number
	By idNumber = By.name("ktp");
	
	//Locator for KTP Photo
	By idPhoto = By.name("cid_file");
	
	//Locator for Selfie Photo
	By selfie = By.name("selfie_file");
	
	//Locator for kota tempat lahir
	By bornCity = By.name("tempat_lahir");
	
	//Locator for label lihat data
	By seeData = By.xpath("//label[@class=\"label-kc blue link\"]");
	
	//Locator for tanggal lahir
	By bornDate = By.name("tgl_lahir");
	
	//Locator for provinsi
	By provinsi = By.name("provinsi");
	
	//Method for navigate to complete profile page
	public void navigateToCompleteProfile() {
		wait.until(ExpectedConditions.elementToBeClickable(lengkapiProfil));
		driver.navigate().to("https://borrower-stg.klikcair.com/lengkapi-profil");
	}
	
	public void fillPic(String picFilled) {
		wait.until(ExpectedConditions.elementToBeClickable(pic));
		driver.findElement(pic).sendKeys(picFilled);
	}
	
	public void chooseGender(String genderOpt) {
		By gender = By.xpath(String.format("//input[@name=\"jenkel\" and @value=\"%s\"]", genderOpt));
		driver.findElement(gender).click();
	}
	
	public void fillPosition(String positionFilled) {
		driver.findElement(position).sendKeys(positionFilled);
	}
	
	public void fillKTPNumber(String ktpNo) {
		driver.findElement(idNumber).sendKeys(ktpNo);
	}
	
	public void uploadId(String fileLocation) {
		driver.findElement(idPhoto).sendKeys(fileLocation);
	}
	
	public void uploadSelfie(String fileLocation) {
		//wait.until(ExpectedConditions.textToBePresentInElementValue(seeData,"Lihat Data"));
		driver.findElement(selfie).sendKeys(fileLocation);
	}
	
	public void fillBornPlace(String bornPlace) {
		driver.findElement(bornCity).sendKeys(bornPlace);
	}
	
	public void fillBornDate(String dateOfBorn) {
		driver.findElement(bornDate).sendKeys(dateOfBorn);
	}
	
	public void selectProvinsi(String selectedProvinsi) {
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(provinsi, By.tagName("option")));
		Select drpState = new Select(driver.findElement(provinsi));
		drpState.selectByVisibleText(selectedProvinsi);
	}
	
	
	
}
