package hrdoorway_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class My_Project_Module {
	WebDriver driver;
	public My_Project_Module(WebDriver driver) {
		this.driver = driver;
	}

	By myProjectOption = By.xpath("//span[contains(text(),'My Projects')]");

	By createProjectButton = By.xpath("//button[contains(text(),'Create Project')]");

	By projectName = By.xpath("//*[contains(@placeholder,'Project name')] ");

	By calendar = By.xpath("//*[contains(@class,'fa fa-calendar')]");

	By nextMonthButton = By.xpath("//div//i[@class=\"fa fa-chevron-right\"]");

	By radioButton = By.xpath("//label[contains(text(),'Single')]");

	By employeeDropdown = By.xpath("(//*[@class=\"custom-select placeholder-text-muted\"])[1]");

	By deliverable = By.xpath("//*[contains(@id,'text')]");

	By uploadFile = By.id("file1");

	By hrProgramdropdown = By.xpath("(//*[@class=\"custom-select placeholder-text-muted\"])[2]");

	By yesrdDropdown = By.xpath("(//*[@class=\"custom-select placeholder-text-muted\"])[3]");

	By investment = By.xpath("//*[contains(@placeholder,'Allocated investment')]");

	By goals_and_objectives = By.id("exampleFormControlTextarea1");

	By uploadFile2 = By.id("file2");

	By checkBox1 = By.xpath("//*[contains(@for,'exp_2')]");

	By checkBox2 = By.xpath("//*[contains(@for,'exp_5')]");

	By subCheckBox1 = By.xpath("//*[contains(@for,'Sub_16')]");

	By subCheckBox2 = By.xpath("//*[contains(@for,'Sub_18')]");

	By subdivScrollAction = By.xpath("//*[contains(@class,'exprtiseboxlist-wrap')]");

	By subCheckBox3 = By.xpath("//*[contains(@for,'Sub_50')]");

	By maindivScroll = By.xpath("(//*[contains(@class,'card')])[1]");

	By addProjectButton = By.xpath("//*[contains(@class,'btn btn-primary  mr-2')]");



	public void myProjectOption() {
		driver.findElement(myProjectOption).click();
	}

	public void createProjectButton() {
		driver.findElement(createProjectButton).click();
	}
	public void projectName() {
		driver.findElement(projectName).sendKeys("TestProject251");
	}
	public void calendar() throws InterruptedException {

		driver.findElement(calendar).click();
		driver.findElement(nextMonthButton).click();

		List<WebElement> allDates = driver.findElements(By.cssSelector(".day"));

		int count = driver.findElements(By.cssSelector(".day")).size();
		Thread.sleep(2000);

		for(int i =0;i<count;i++) {

			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("5")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				Thread.sleep(2000);
				break;
			}
		}

		Actions action = new Actions(driver);							//for calendar disable after click anywhere on page
		action.moveByOffset(1003, 210).click().build().perform();
	}
	public void radioButton() {
		driver.findElement(radioButton).click();
	}
	public void employeeDropdown() {
		WebElement employees = driver.findElement(employeeDropdown);
		Select employeesDropdown = new Select(employees);
		employeesDropdown.selectByVisibleText(" 101-1000 ");
	}
	public void deliverable() {
		driver.findElement(deliverable).sendKeys("Testing.....!");
	}
	public void uploadFile() {
		WebElement uploadFile1 = driver.findElement(uploadFile);
		uploadFile1.sendKeys("C:\\Users\\om.bagade.RADIXLOCAL\\Downloads\\sample.pdf");
	}
	public void hrProgramdropdown() {
		WebElement hrProgram = driver.findElement(hrProgramdropdown);
		Select hrProgramDropdown = new Select(hrProgram);
		hrProgramDropdown.selectByVisibleText("Needs updating ");
	}
	public void yesrdDropdown() {
		WebElement years = driver.findElement(yesrdDropdown);
		Select yearsDropdown = new Select(years);
		yearsDropdown.selectByVisibleText(" 1-5 ");
	}
	public void investment() {
		driver.findElement(investment).sendKeys("500");
	}
	public void goals_and_objectives() {
		driver.findElement(goals_and_objectives).sendKeys("Welcome to Radixweb");
	}
	public void uploadFile2() {
		WebElement uploadFile = driver.findElement(uploadFile2);
		uploadFile.sendKeys("C:\\Users\\om.bagade.RADIXLOCAL\\Downloads\\sample.pdf");
	}
	public void checkBox1() {
		driver.findElement(checkBox1).click();
	}
	public void checkBox2() {
		driver.findElement(checkBox2).click();
	}
	public void subCheckBox1() {
		driver.findElement(subCheckBox1).click();
	}
	public void subCheckBox2() {
		driver.findElement(subCheckBox2).click();
	}
	public void subdivScrollAction() {
		driver.findElement(subdivScrollAction);
		Actions subDivscroll = new Actions(driver);
		subDivscroll.sendKeys(Keys.DOWN).build().perform();
	}
	public void subCheckBox3() {
		driver.findElement(subCheckBox3).click();
	}
	public void maindivScroll() {
		driver.findElement(maindivScroll);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
	}
	public void addProjectButton() {
		driver.findElement(addProjectButton).click();
	}


}
