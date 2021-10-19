package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {

	WebDriver driver;
	WebElement expendAll;
	WebElement checkNotes;
	WebElement checkReact;
	WebElement checkPrivate;
	WebElement checkExcelFile;
	WebElement successMessage;

	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getexpendAll() {
		return driver.findElement(By.cssSelector(".rct-option.rct-option-expand-all"));
	}

	public WebElement getCheckNotes() {
		return driver.findElement(By.xpath("//span[contains(text(),'Notes')]"));
	}

	public WebElement getCheckReact() {
		return driver.findElement(By.xpath("//span[contains(text(),'React')]"));
	}

	public WebElement getCheckPrivate() {
		return driver.findElement(By.xpath("//span[contains(text(),'Private')]"));
	}

	public WebElement getCheckExcelFile() {
		return driver.findElement(By.xpath("//span[contains(text(),'Excel File.doc')]"));
	}

	public WebElement getSuccessMessage() {
		return driver.findElement(By.xpath("//*[@id=\"result\"]"));
	}

	public void clikexpendAll() {
		this.getexpendAll().click();
	}

	public void clickNotes() {
		this.getCheckNotes().click();
	}

	public void clickReact() {
		this.getCheckReact().click();
	}

	public void clickPrivate() {
		this.getCheckPrivate().click();
	}

	public void clickExcelFile() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getCheckExcelFile());
		this.getCheckExcelFile().click();
	}

	public String textSuccessMessage() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSuccessMessage());
		return this.getSuccessMessage().getText();
	}

}
