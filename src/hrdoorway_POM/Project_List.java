package hrdoorway_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_List {
	WebDriver driver;

	public Project_List(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.xpath("//*[contains(@name,'q')]");

	By checkBox = By.xpath("//*[contains(@for,'hrc-3885')]");

	By requestProposal = By.xpath("//*[contains(@class,'btn btn-primary  mr-2')]");

	By cancelButton = By.xpath("//button[contains(text(),'Cancel')]");


	public void searchBox() {
		driver.findElement(searchBox).sendKeys("Hr Kunal");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	public void checkBox() {
		driver.findElement(checkBox).click();
	}
	public void requestProposal() {
		driver.findElement(requestProposal).click();
	}
	public void cancelButton() {
		driver.findElement(cancelButton).click();
	}


}
