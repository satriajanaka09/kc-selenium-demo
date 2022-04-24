package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator for nama PIC
	By pic = By.name("nama_pic");
	
	//Locator for gender radio button
	By gender = By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[2]/div/div[2]/div/div/label[1]/input");
	
	//Locator for position
	By position = By.xpath("//*[@id=\"root\"]/div/div[1]/section/div[2]/div[3]/div/div[2]/div/div/input");
	
}
