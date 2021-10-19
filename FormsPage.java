package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPage {

	WebDriver driver;
	WebElement pageTextForms;
	WebElement buttonPracticeForms;

	public FormsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageTextForms() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}

	public WebElement getbuttonPracticeForms() {
		return driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
	}

	public String getTextForms() {
		return this.getPageTextForms().getText();
	}

	public void pressButtonPracticeForms() {
		this.getbuttonPracticeForms().click();
	}

}
