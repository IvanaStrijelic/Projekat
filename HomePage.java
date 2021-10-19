package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	WebElement sectionElements;
	WebElement sectionForms;
	WebElement sectionAlertsFrameWindows;
	WebElement sectionWidgets;
	WebElement sectionInteractions;
	WebElement sectionBookStoreApplication;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSectionElements() {
		return driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
	}

	public WebElement getSectionForms() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
	}

	public WebElement getSectionAlertsFrameWindows() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5"));
	}

	public WebElement getSectionWidgets() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
	}

	public WebElement getSectionInteractions() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
	}

	public WebElement getSectionBookStoreApplication() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
	}

	public void clickSectionElements() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionElements());
		this.getSectionElements().click();
	}

	public void clickSectionForms() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionForms());
		this.getSectionForms().click();
	}

	public void clickSectionAlertsFrameWindows() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				getSectionAlertsFrameWindows());
		this.getSectionAlertsFrameWindows().click();
	}

	public void clickSectionWidgets() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionWidgets());
		this.getSectionWidgets().click();
	}

	public void clickSectionInteractions() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionInteractions());
		this.getSectionInteractions().click();
	}

	public void clickSectionBookStoreApplication() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				getSectionBookStoreApplication());
		this.getSectionBookStoreApplication().click();
	}

	public String textElements() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionElements());
		return this.getSectionElements().getText();
	}

	public String textForms() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionForms());
		return this.getSectionForms().getText();
	}

	public String textAlertsFrameWindows() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				getSectionAlertsFrameWindows());
		return this.getSectionAlertsFrameWindows().getText();
	}

	public String textWidgets() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionWidgets());
		return this.getSectionWidgets().getText();
	}

	public String textInteractions() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getSectionInteractions());
		return this.getSectionInteractions().getText();
	}

	public String textBookStoreApplication() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				getSectionBookStoreApplication());
		return getSectionBookStoreApplication().getText();
	}
}
