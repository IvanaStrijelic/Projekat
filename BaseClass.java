package AutomationTestingDemoqa;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public HomePage homePage;
	public ElementsPage elementsPage;
	public FormsPage formsPage;
	public InteractionsPage interactionsPage;
	public AlertsFrameWindowsPage alertsFrameWindowsPage;
	public BookStoreApplicationPage bookStoreApplicationPage;
	public WidgetsPage widgetsPage;
	public WebDriverWait wait; // waiter is created if needs to slow down test when cannot find some WebElement
	public JavascriptExecutor javascriptExecutor; // used for page scroll up or down to locate WebElements
	public ExcelReader excelReader; 
	public String homeUrl;
	public TextBoxPage textBoxPage;
	public CheckBoxPage checkBoxPage;
	public RadioButtonPage radioButtonPage;
	public WebTablesPage webTablesPage;
	public PracticeFormPage practiceFormPage;

	@BeforeClass //method will be run before the first test method in the current class is invoked
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		excelReader = new ExcelReader("C:\\Users\\Ivana\\Desktop\\FinalProject_ITBootcamp.xlsx");
		homeUrl = excelReader.getStringData("Excel Reader", 1, 0);
		homePage = new HomePage(driver);
		elementsPage = new ElementsPage(driver);
		formsPage = new FormsPage(driver);
		interactionsPage = new InteractionsPage(driver);
		alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver);
		bookStoreApplicationPage = new BookStoreApplicationPage(driver);
		widgetsPage = new WidgetsPage(driver);
		textBoxPage = new TextBoxPage(driver);
		checkBoxPage = new CheckBoxPage(driver);
		radioButtonPage = new RadioButtonPage(driver);
		webTablesPage = new WebTablesPage(driver);
		practiceFormPage = new PracticeFormPage(driver);
		wait = new WebDriverWait(driver, 20);

	}

	@AfterClass // created to perform after test method
	public void tearDown() {
		 driver.close();
		 driver.quit();
	}

}
