package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreApplicationPage {

	WebDriver driver;
	WebElement pageTextBookStoreApplication;
	WebDriverWait wait;
	WebElement login;
	WebElement newUser;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement passwordField;
	WebElement usernameField;
	WebElement buttonRegister;
	WebElement goToLogin;
	WebElement password1Field;
	WebElement username1Field;
	WebElement login1;
	WebElement logout;

	public BookStoreApplicationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPageTextBookStoreApplication() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]"));
	}

	public WebElement getLogin() {
		return driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
	}

	public WebElement getGoToLogin() {
		return driver.findElement(By.id("gotologin"));
	}

	public WebElement getNewUser() {
		return driver.findElement(By.xpath("//button[@id='newUser']"));
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.xpath("//input[@id='firstname']"));
	}

	public WebElement getLastNameField() {
		return driver.findElement(By.xpath("//input[@id='lastname']"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.xpath("//input[@id='userName']"));
	}

	public WebElement getLogout() {
		return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	}

	public WebElement getPassword1Field() {
		return driver.findElement(By.xpath("//*[@id=\"password\"]"));
	}

	public WebElement getUsername1Field() {
		return driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	}

	public WebElement getButtonRegister() {
		return driver.findElement(By.cssSelector("#register"));
	}

	public WebElement getLogin1() {
		return driver.findElement(By.xpath("//button[@id='login']"));
	}

	public String getTextBookStoreApplication() {
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".pattern-backgound.playgound-header")));
		return this.getPageTextBookStoreApplication().getText();
	}

	public void pressLogin() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getLogin());
		this.getLogin().click();
	}

	public void pressNewuser() {
		this.getNewUser().click();
	}

	public void pressGoToLogin() {
		this.getGoToLogin().click();
	}

	public void pressLogin1() {
		this.getLogin1().click();
	}

	public void insertFirstName(String name) {
		this.getFirstNameField().sendKeys(name);
	}

	public void insertLastName(String lastname) {
		this.getLastNameField().sendKeys(lastname);
	}

	public void insertUserName(String username) {
		this.getUsernameField().sendKeys(username);
	}

	public void insertPassword(String password) {
		this.getPasswordField().sendKeys(password);
	}

	public void insertUserName1(String username) {
		this.getUsername1Field().sendKeys(username);
	}

	public void insertPassword1(String password) {
		this.getPassword1Field().sendKeys(password);
	}

	public void pressButtonRegister() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getButtonRegister());
		Thread.sleep(20000);
		this.getButtonRegister().click();
	}

	public String textLogout() {
		return this.getLogout().getText();
	}

}
