package hrdoorway_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_New_User {
	
	WebDriver driver;

	public Add_New_User(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.xpath("//*[contains(@formcontrolname,'name')]");

	By companyName = By.xpath("//*[contains(@formcontrolname,'companyName')]");

	By emailID = By.xpath("//*[contains(@formcontrolname,'email')]");

	By confirmEmailID = By.xpath("//*[contains(@formcontrolname,'confirmEmail')]");

	By password = By.xpath("//*[(@placeholder = 'Password')]"); // //*[contains(@formcontrolname,'userPassword')]

	By confirmPassword = By.xpath("//*[contains(@formcontrolname,'userConfirmPassword')]");

	By selectCompanySize = By.xpath("//*[contains(@placeholder,'Select Company Size ')]");

	By selectCountry = By.xpath("//*[contains(@placeholder,'Select Country')]");

	By selectState =  By.xpath("//*[contains(@placeholder,'Select State ')]");

	By selectCity = By.xpath("//*[contains(@placeholder,'Select City ')]");

	By registerAndProceedButton = By.xpath("//a[contains(text(),'Register & Proceed')]");

	By passwordOnLoginPage = By.xpath("//*[contains(@formcontrolname,'password')]");

	By signInButton = By.xpath("//button[contains(text(),'Sign In')]");


	public void userName() {
		driver.findElement(userName).sendKeys("TestUser");
	}
	public void companyName() {
		driver.findElement(companyName).sendKeys("Company Pvt. Ltd.");
	}
	public void emailID() {
		driver.findElement(emailID).sendKeys("usertest251@gmail.com");
	}
	public void confirmEmailID() {
		driver.findElement(confirmEmailID).sendKeys("usertest251@gmail.com");
	}
	public void password() {
		driver.findElement(password).sendKeys("Admin@123");
	}
	public void confirmPassword() {
		driver.findElement(confirmPassword).sendKeys("Admin@123");
	}
	public void selectCompanySize() {
		driver.findElement(selectCompanySize).sendKeys("101");

		List<WebElement> companySize = driver.findElements(By.xpath("//li[@class = 'active-result']"));

		for (WebElement option : companySize) {
			if(option.getText().equalsIgnoreCase("101-1000")) {
				option.click();
				break;
			}
		}
	}
	public void selectCountry() {
		driver.findElement(selectCountry).sendKeys("New");
		List<WebElement> country = driver.findElements(By.xpath("//li[@class = 'active-result']"));

		for (WebElement option : country) {
			if(option.getText().equalsIgnoreCase("New Zealand")) {
				option.click();
				break;
			}
		}
	}
	public void selectState() {
		driver.findElement(selectState).sendKeys("Auc");
		List<WebElement> state = driver.findElements(By.xpath("//li[@class = 'active-result']"));

		for (WebElement option : state) {
			if(option.getText().equalsIgnoreCase("Auckland")) {
				option.click();
				break;
			}
		}
	}
	public void selectCity() {
		driver.findElement(selectCity).sendKeys("Hen");
		List<WebElement> city = driver.findElements(By.xpath("//li[@class = 'active-result']"));

		for (WebElement option : city) {
			if(option.getText().equalsIgnoreCase("Henderson Valley")) {
				option.click();
				break;
			}
		}
	}
	public void signInButton() {
		driver.findElement(signInButton).click();
	}
	public void registerAndProceedButton() throws InterruptedException {		
		driver.findElement(registerAndProceedButton).click();

		Thread.sleep(1000);

		String actualURL = "https://2hrdoorway.live1.dev.radixweb.net/hro-dashboard";
		String expectedURL = driver.getCurrentUrl();
		if(actualURL.equalsIgnoreCase(expectedURL)) {
			System.out.println("User Successfully Registered..!"); 

			Thread.sleep(2000);
			LogOut_User obj = new LogOut_User(driver);
			obj.userIcon();
			obj.logOutIcon();
			emailID();
			password();
			signInButton();
		}
		else
		{
			System.out.println("User Already Registered..!");

			Login_Page loginLink1 = new Login_Page(driver);
			loginLink1.logINLink();
			emailID();
			password();
			signInButton();
		}
	}

}
