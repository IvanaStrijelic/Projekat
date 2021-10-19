package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WidgetsPage {

	WebDriver driver;
	WebElement pageTextWidgets;

	public WidgetsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageTextWidgets() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}

	public String getTextWidgets() {
		return this.getPageTextWidgets().getText();
	}
}
