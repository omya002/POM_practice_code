package hrDoorwayTestcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import hrdoorway_POM.Add_New_User;
import hrdoorway_POM.LogOut_User;
import hrdoorway_POM.Login_Page;
import hrdoorway_POM.My_Project_Module;
import hrdoorway_POM.Project_List;
import hrdoorway_POM.Update_Project_Details;

public class HrDoorwat_Test_Case {

	public WebDriver driver;

	@BeforeSuite
	public void launchApp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://2hrdoorway.live1.dev.radixweb.net/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void page1() throws InterruptedException {

		Login_Page page1 = new Login_Page(driver);

		Thread.sleep(1000);
		page1.logINLink();
		Thread.sleep(1000);
		page1.roleDropDown();
		Thread.sleep(1000);
		page1.yesButton();
	}

	@Test(priority = 2)
	public void page2() throws InterruptedException {

		Add_New_User page2 = new Add_New_User(driver);

		page2.userName();
		page2.companyName();
		page2.emailID();
		page2.confirmEmailID();
		page2.password();
		page2.confirmPassword();
		page2.selectCompanySize();
		Thread.sleep(1000);
		page2.selectCountry();
		Thread.sleep(1000);
		page2.selectState();
		Thread.sleep(1000);
		page2.selectCity();
		Thread.sleep(1000);
		page2.registerAndProceedButton();
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void page4() throws InterruptedException {

		My_Project_Module page4 = new My_Project_Module(driver);

		page4.myProjectOption();
		Thread.sleep(1000);
		page4.createProjectButton();
		Thread.sleep(1000);
		page4.projectName();
		Thread.sleep(1000);
		page4.calendar();
		Thread.sleep(1000);
		page4.radioButton();
		Thread.sleep(1000);
		page4.employeeDropdown();
		Thread.sleep(1000);
		page4.deliverable();
		Thread.sleep(1000);
		page4.uploadFile();
		Thread.sleep(1000);
		page4.hrProgramdropdown();
		Thread.sleep(1000);
		page4.yesrdDropdown();
		Thread.sleep(1000);
		page4.investment();
		Thread.sleep(1000);
		page4.goals_and_objectives();
		Thread.sleep(1000);
		page4.uploadFile2();
		Thread.sleep(1000);
		page4.checkBox1();
		Thread.sleep(1000);
		page4.checkBox2();
		Thread.sleep(1000);
		page4.subCheckBox1();
		Thread.sleep(1000);
		page4.subCheckBox2();
		Thread.sleep(1000);
		page4.subdivScrollAction();
		Thread.sleep(1000);
		page4.subCheckBox3();
		Thread.sleep(1000);
		page4.maindivScroll();
		Thread.sleep(1000);
		page4.addProjectButton();
		Thread.sleep(1000);
	}

	@Test(priority = 4)
	public void page5() throws InterruptedException {

		Project_List page5 = new Project_List(driver);

		page5.searchBox();
		Thread.sleep(1000);
		page5.checkBox();
		Thread.sleep(1000);
		page5.requestProposal();
		Thread.sleep(10000);
		page5.cancelButton();
		Thread.sleep(1000);
	}

	@Test(priority = 5)
	public void page6() throws InterruptedException {

		Update_Project_Details page6 = new Update_Project_Details(driver);

		page6.editProject();
		Thread.sleep(1000);
		page6.updateProjectName();
		Thread.sleep(1000);
		page6.updateDeliverable();
		Thread.sleep(1000);
		page6.update_Goals_and_Objectives();
		Thread.sleep(10000);
		page6.saveProjectButton();
	}

	@Test(priority = 6)
	public void page3() throws InterruptedException {

		LogOut_User page3 = new LogOut_User(driver);

		Thread.sleep(1000);
		page3.userIcon();
		Thread.sleep(2000);
		page3.logOutIcon();
	}

	@AfterSuite
	public void closeApp() {

		driver.quit();
	}

}
