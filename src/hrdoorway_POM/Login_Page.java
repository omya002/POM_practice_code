package hrdoorway_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login_Page {
	WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	By logINLink = By.xpath("(//*[(@href= 'javascript:void(0)')])[2]");		//	//a[contains(text(),'Create An Account Here For Free')]

	By roleDropDown = By.xpath("//*[contains(@class,'form-control ng-untouched ng-pristine ng-valid')]");

	By yesButton = By.xpath("//*[contains(@class,'bttn-primary bttn-icon')]");


	public void logINLink() {

		driver.findElement(logINLink).click();
	}
	public void roleDropDown() {
		WebElement roleDropdown = driver.findElement(roleDropDown);
		Select roleDropdown1 = new Select(roleDropdown);
		roleDropdown1.selectByValue("2");
	}
	public void yesButton() {
		driver.findElement(yesButton).click();
	}

}
