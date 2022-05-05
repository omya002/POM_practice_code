package hrdoorway_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut_User {

	WebDriver driver;

	public LogOut_User(WebDriver driver) {
		this.driver = driver;
	}

	By userIcon = By.xpath("//*[@class = 'icon feather icon-user']");

	By logOutIcon = By.xpath("//*[@class = 'feather icon-log-out']");

	public void userIcon() {
		driver.findElement(userIcon).click();
	}
	public void logOutIcon() {
		driver.findElement(logOutIcon).click();
	}

}
