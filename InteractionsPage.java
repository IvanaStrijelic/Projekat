package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InteractionsPage {

	WebDriver driver;
	WebElement pageTextInteractions;

	public InteractionsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageTextInteractions() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}

	public String getTextInteractions() {
		return this.getPageTextInteractions().getText();
	}
}
