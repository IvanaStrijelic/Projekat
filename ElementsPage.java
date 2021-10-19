package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

	WebDriver driver;
	WebElement pageTextElements;
	WebElement buttonTextBox;
	WebElement buttonCheckBox;
	WebElement radioButton;
	WebElement webTables;

	public ElementsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageTextElements() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}

	public String getTextElements() {
		return this.getPageTextElements().getText();
	}

	public WebElement getButtonTextBox() {
		return driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
	}

	public WebElement getButtonCheckBox() {
		return driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
	}

	public WebElement getRadioButton() {
		return driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
	}

	public WebElement getWebTables() {
		return driver.findElement(By.xpath("//span[contains(text(),'Web Tables')]"));
	}

	public void pressButtonTextBox() {
		this.getButtonTextBox().click();
	}

	public void pressButtonCheckBox() {
		this.getButtonCheckBox().click();
	}

	public void clickRadioButton() {
		this.getRadioButton().click();
	}

	public void pressButtonWebTables() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getWebTables());
		this.getWebTables().click();
	}

}
