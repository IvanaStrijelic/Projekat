package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

	WebDriver driver;
	WebElement yesCheck;
	WebElement impressiveCheck;
	WebElement successMessage;

	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getYesCheck() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
	}

	public WebElement getImpressiveCheck() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
	}

	public WebElement getSuccessMessage() {
		return driver.findElement(By.className("mt-3"));
	}

	public String textsuccessMessage() {
		return getSuccessMessage().getText();
	}

	public void clickYesCheck() {
		this.getYesCheck().click();
	}

	public void clickImpressiveCheck() {
		this.getImpressiveCheck().click();
	}

}
