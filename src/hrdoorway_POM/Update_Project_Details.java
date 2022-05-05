package hrdoorway_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Update_Project_Details {

	WebDriver driver;

	public Update_Project_Details(WebDriver driver) {
		this.driver=driver;
	}

	By editProject = By.xpath("(//*[@class = 'feather icon-edit'])[1]");

	By updateProjectName = By.xpath("//*[contains(@placeholder,'Project name')]	");

	By updateDeliverable = By.xpath("(//*[(@id='exampleFormControlTextarea1')])[1]");

	By update_Goals_and_Objectives = By.xpath("(//*[(@id='exampleFormControlTextarea1')])[2]");

	By saveProjectButton = By.cssSelector(".btn.btn-primary.mr-2");


	public void editProject() {
		driver.findElement(editProject).click();
	}
	public void updateProjectName() {
		driver.findElement(updateProjectName).clear();
		driver.findElement(updateProjectName).sendKeys("UpdateProjectName251");
	}
	public void updateDeliverable() {
		driver.findElement(updateDeliverable).clear();
		driver.findElement(updateDeliverable).sendKeys("UpdatedDeliverable251");
	}
	public void update_Goals_and_Objectives() {
		driver.findElement(update_Goals_and_Objectives).clear();
		driver.findElement(update_Goals_and_Objectives).sendKeys("updated_Goals_and_Objectives251");
	}
	public void saveProjectButton() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		driver.findElement(saveProjectButton).click();
	}


}
