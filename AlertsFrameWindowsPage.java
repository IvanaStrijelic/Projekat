package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsFrameWindowsPage {

	WebDriver driver;
	WebElement pageTextAlertsFrameWindows;

	public AlertsFrameWindowsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageTextAlertsFrameWindows() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}

	public String getTextAlertsFrameWindows() {
		return this.getPageTextAlertsFrameWindows().getText();
	}
}
