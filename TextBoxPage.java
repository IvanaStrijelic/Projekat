package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

	WebDriver driver;
	WebDriverWait wait;
	WebElement fullNameField;
	WebElement emailField;
	WebElement currentAddressField;
	WebElement permanentAddressField;
	WebElement buttonSubmit;
	WebElement successMessage;

	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFullNameField() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("userEmail"));
	}

	public WebElement getCurrentAddressField() {
		return driver.findElement(By.id("currentAddress"));
	}

	public WebElement getPermanentAddressField() {
		return driver.findElement(By.id("permanentAddress"));
	}

	public WebElement getButtonSubmit() {
		return driver.findElement(By.cssSelector(".btn.btn-primary"));
	}

	public WebElement getSuccessMessage() {
		return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
	}

	public void insertFullName(String nameData) {
		this.getFullNameField().clear();
		this.getFullNameField().sendKeys(nameData);
	}

	public void insertEmail(String emailData) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(emailData);
	}

	public void insertCurrentAddress(String currentAddressData) {
		this.getCurrentAddressField().clear();
		this.getCurrentAddressField().sendKeys(currentAddressData);
	}

	public void insertPermanentAddress(String permanentAddressData) {
		this.getPermanentAddressField().clear();
		this.getPermanentAddressField().sendKeys(permanentAddressData);
	}

	public void pressSubmitButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getButtonSubmit());
		// wait.until(ExpectedConditions.elementToBeClickable(getButtonSubmit()));
		this.getButtonSubmit().click();
	}

	public String textSuccessMessage() {
		return getSuccessMessage().getText();
	}

}
