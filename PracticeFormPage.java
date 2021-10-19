package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage {

	WebDriver driver;
	WebDriverWait wait;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement emailField;
	WebElement genderSelect;
	WebElement mobileField;
	WebElement dateOfBirthField;
	WebElement currentAddressField;
	WebElement buttonSubmit;
	WebElement selectMonth;
	WebElement selectYear;
	WebElement selectDate;
	WebElement buttonClose;
	WebElement successMessage;

	public PracticeFormPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("firstName"));
	}

	public WebElement getLastNameField() {
		return driver.findElement(By.id("lastName"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.cssSelector("#userEmail"));
	}

	public WebElement getGenderSelect() {
		return driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
	}

	public WebElement getMobileField() {
		return driver.findElement(By.xpath("//input[@id='userNumber']"));
	}

	public WebElement getDateOfBirthField() {
		return driver.findElement(By.id("dateOfBirthInput"));
	}

	public WebElement getCurrentAddressField() {
		return driver.findElement(By.cssSelector("#currentAddress"));
	}

	public WebElement getbuttonSubmit() {
		return driver.findElement(By.cssSelector("#submit"));
	}

	public WebElement getselectMonth() {
		return driver.findElement(By.className("react-datepicker__month-select"));
	}

	public WebElement getselectYear() {
		return driver.findElement(By.className("react-datepicker__year-select"));
	}

	public WebElement getselectDate() {
		return driver.findElement(By.xpath("//div[contains(text(),'26')]"));
	}

	public WebElement getbuttonClose() {
		return driver.findElement(By.id("closeLargeModal"));
	}

	public WebElement getsuccessMessage() {
		return driver.findElement(By.cssSelector(".modal-title.h4"));
	}

	public void insertFirstName(String name) {
		this.getFirstNameField().clear();
		this.getFirstNameField().sendKeys(name);
	}

	public void insertLastName(String lastname) {
		this.getLastNameField().clear();
		this.getLastNameField().sendKeys(lastname);
	}

	public void insertEmail(String email) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(email);
	}

	public void selectGender() {
		this.getGenderSelect().click();
	}

	public void insertDateOfBirth() {
		this.getDateOfBirthField().click();

	}

	public void insertMobile(String mobile) {
		this.getMobileField().clear();
		this.getMobileField().sendKeys(mobile);
	}

	public void insertAddress(String address) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCurrentAddressField());
		this.getCurrentAddressField().clear();
		this.getCurrentAddressField().sendKeys(address);
	}

	public void pressSubmit() {
		this.getbuttonSubmit().click();
	}

	public void selectMonth() {
		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByIndex(5);
	}

	public void selectYear() {
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByIndex(86);
	}

	public void selectDate() {
		this.getselectDate().click();
	}

	public String textSuccessMessage() {
		return this.getsuccessMessage().getText();
	}

}
