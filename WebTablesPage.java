package AutomationTestingDemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {

	WebDriver driver;
	WebElement buttonAdd;
	WebElement firstName;
	WebElement lastName;
	WebElement email;
	WebElement age;
	WebElement salary;
	WebElement department;
	WebElement buttonSubmit;
	WebElement textRow;

	public WebTablesPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getButtonAdd() {
		return driver.findElement(By.id("addNewRecordButton"));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.cssSelector("#lastName"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.cssSelector("#userEmail"));
	}

	public WebElement getAge() {
		return driver.findElement(By.cssSelector("#age"));
	}

	public WebElement getSalary() {
		return driver.findElement(By.cssSelector("#salary"));
	}

	public WebElement getDepartment() {
		return driver.findElement(By.cssSelector("#department"));
	}

	public WebElement getButtonSubmit() {
		return driver.findElement(By.cssSelector(".text-right.col-md-2.col-sm-12"));
	}

	public WebElement getTextRow() {
		return driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]"));
	}

	public void pressButtonAdd() {
		this.getButtonAdd().click();
	}

	public void insertFirstName(String nameData) {
		this.getFirstName().clear();
		this.getFirstName().sendKeys(nameData);
	}

	public void insertLastName(String lastnameData) {
		this.getLastName().clear();
		this.getLastName().sendKeys(lastnameData);
	}

	public void insertEmail(String email) {
		this.getEmail().clear();
		this.getEmail().sendKeys(email);
	}

	public void insertAge(String age1) {
		this.getAge().clear();
		this.getAge().sendKeys(age1);
	}

	public void insertSalary(String salary1) {
		this.getSalary().clear();
		this.getSalary().sendKeys(salary1);
	}

	public void insertDepartment(String department) {
		this.getDepartment().clear();
		this.getDepartment().sendKeys(department);
	}

	public void pressButtonSubmit() {
		this.getButtonSubmit().click();
	}

	public String textRowTest() {
		return getTextRow().getText();
	}
}
