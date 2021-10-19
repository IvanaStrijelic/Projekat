package AutomationTestingDemoqa;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

@Test
public class Tests extends BaseClass {

	@BeforeMethod //created to perform before each test cases
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
	}

	@Test(priority = 10)

	public void homePageContainsAllSections() throws InterruptedException {
		String section1 = excelReader.getStringData("Excel Reader", 1, 5);
		String section2 = excelReader.getStringData("Excel Reader", 2, 5);
		String section3 = excelReader.getStringData("Excel Reader", 3, 5);
		String section4 = excelReader.getStringData("Excel Reader", 4, 5);
		String section5 = excelReader.getStringData("Excel Reader", 5, 5);
		String section6 = excelReader.getStringData("Excel Reader", 6, 5);

		Assert.assertTrue(homePage.textElements().equals(section1));// 6 asserts, for each elements 
		Assert.assertTrue(homePage.textForms().equals(section2));
		Assert.assertTrue(homePage.textAlertsFrameWindows().equals(section3));
		Assert.assertTrue(homePage.textInteractions().equals(section5));
		Assert.assertTrue(homePage.textWidgets().equals(section4));
		Assert.assertTrue(homePage.textBookStoreApplication().equals(section6));
	}

	@Test(priority = 20)
	public void sectionElementsAreLinkedToRelatedPage() {
		homePage.clickSectionElements();
		String urlElements = excelReader.getStringData("Excel Reader", 2, 0);
		String pageName = excelReader.getStringData("Excel Reader", 1, 8);

		Assert.assertTrue(elementsPage.getTextElements().equals(pageName));// checking that page contains correct name
		Assert.assertTrue(driver.getCurrentUrl().equals(urlElements));//checking URL on the page

	}

	@Test(priority = 30)
	public void sectionFormsAreLinkedToRelatedPage() {
		homePage.clickSectionForms();
		String urlForms = excelReader.getStringData("Excel Reader", 4, 0);
		String pageName1 = excelReader.getStringData("Excel Reader", 2, 8);

		Assert.assertTrue(formsPage.getTextForms().equals(pageName1));
		Assert.assertTrue(driver.getCurrentUrl().equals(urlForms));

	}

	@Test(priority = 40)
	public void sectionAlertsFrameWindowsAreLinkedToRelatedPage() {
		homePage.clickSectionAlertsFrameWindows();
		String urlAlertsFrameWindows = excelReader.getStringData("Excel Reader", 5, 0);
		String pageName2 = excelReader.getStringData("Excel Reader", 3, 8);

		Assert.assertTrue(alertsFrameWindowsPage.getTextAlertsFrameWindows().equals(pageName2));
		Assert.assertTrue(driver.getCurrentUrl().equals(urlAlertsFrameWindows));

	}

	@Test(priority = 50)
	public void sectionWidgetsAreLinkedToRelatedPage() {
		homePage.clickSectionWidgets();
		String urlWidgets = excelReader.getStringData("Excel Reader", 6, 0);
		String pageName3 = excelReader.getStringData("Excel Reader", 4, 8);

		Assert.assertTrue(widgetsPage.getTextWidgets().equals(pageName3));
		Assert.assertTrue(driver.getCurrentUrl().equals(urlWidgets));

	}

	@Test(priority = 60)
	public void sectionInteractionsAreLinkedToRelatedPage() {
		homePage.clickSectionInteractions();
		String urlInteractions = excelReader.getStringData("Excel Reader", 7, 0);
		String pageName4 = excelReader.getStringData("Excel Reader", 5, 8);

		Assert.assertTrue(interactionsPage.getTextInteractions().equals(pageName4));
		Assert.assertTrue(driver.getCurrentUrl().equals(urlInteractions));

	}

	@Test(priority = 70)
	public void sectionBookStoreApplicationAreLinkedToRelatedPage() throws InterruptedException {
		homePage.clickSectionBookStoreApplication();
		Thread.sleep(3000);
		String urlBookStoreApplication = excelReader.getStringData("Excel Reader", 8, 0);
		String pageName5 = excelReader.getStringData("Excel Reader", 6, 8);

		Assert.assertTrue(bookStoreApplicationPage.getTextBookStoreApplication().equals(pageName5));
		Assert.assertTrue(driver.getCurrentUrl().equals(urlBookStoreApplication));
	}

	@Test(priority = 80)
	public void userCanSubmitCompletedFormOnPageTextBox() {
		String fullName = excelReader.getStringData("Excel Reader", 1, 1);
		String email = excelReader.getStringData("Excel Reader", 1, 2);
		String currentAddress = excelReader.getStringData("Excel Reader", 1, 4);
		String permanentAddress = excelReader.getStringData("Excel Reader", 1, 3);
		String successMessage5 = excelReader.getStringData("Excel Reader", 5, 7);

		homePage.clickSectionElements();
		elementsPage.pressButtonTextBox();
		textBoxPage.insertFullName(fullName);
		textBoxPage.insertEmail(email);
		textBoxPage.insertCurrentAddress(currentAddress);
		textBoxPage.insertPermanentAddress(permanentAddress);
		textBoxPage.pressSubmitButton();

		Assert.assertEquals(textBoxPage.textSuccessMessage(), successMessage5);//verify that success message contains all added personal info

	}

	@Test(priority = 90)
	public void userCanSelectMoreDifferentOptionsOnPageCheckBox() {
		String successMessage6 = excelReader.getStringData("Excel Reader", 6, 7);
		homePage.clickSectionElements();
		elementsPage.pressButtonCheckBox();
		checkBoxPage.clikexpendAll();
		checkBoxPage.clickReact();
		checkBoxPage.clickExcelFile();
		checkBoxPage.clickNotes();
		checkBoxPage.clickPrivate();

		Assert.assertEquals(checkBoxPage.textSuccessMessage(), successMessage6);//verify that success message contains all checked options
	}

	@Test(priority = 100)
	public void userCanSelectOnlyOneOptionOnPageRadioButton() {

		String successMessage7 = excelReader.getStringData("Excel Reader", 7, 7);
		String successMessage8 = excelReader.getStringData("Excel Reader", 8, 7);
		homePage.clickSectionElements();
		elementsPage.clickRadioButton();
		radioButtonPage.clickYesCheck();
		radioButtonPage.clickImpressiveCheck();

		Assert.assertEquals(radioButtonPage.textsuccessMessage(), successMessage7);//verify that success message contains selected option
		Assert.assertNotEquals(radioButtonPage.textsuccessMessage(), successMessage8);//verify that success message doesn't contain another option
	}

	@Test(priority = 110)
	public void userCanAddNewRowInTableOnPageWebTables() throws InterruptedException {

		String firstName = excelReader.getStringData("Excel Reader", 1, 12);
		String lastName = excelReader.getStringData("Excel Reader", 1, 13);
		String email = excelReader.getStringData("Excel Reader", 1, 2);
		String age = excelReader.getStringData("Excel Reader", 1, 9);
		String salary = excelReader.getStringData("Excel Reader", 1, 10);
		String department = excelReader.getStringData("Excel Reader", 1, 11);

		homePage.clickSectionElements();
		elementsPage.pressButtonWebTables();
		webTablesPage.pressButtonAdd();
		Thread.sleep(3000);
		webTablesPage.insertFirstName(firstName);
		webTablesPage.insertLastName(lastName);
		webTablesPage.insertEmail(email);
		webTablesPage.insertAge(age);
		webTablesPage.insertSalary(salary);
		webTablesPage.insertDepartment(department);
		webTablesPage.pressButtonSubmit();

		Assert.assertTrue(webTablesPage.textRowTest().contains(firstName));//verify that all submitted data have been contained in new table row
		Assert.assertTrue(webTablesPage.textRowTest().contains(lastName));
		Assert.assertTrue(webTablesPage.textRowTest().contains(email));
		Assert.assertTrue(webTablesPage.textRowTest().contains(age));
		Assert.assertTrue(webTablesPage.textRowTest().contains(salary));
		Assert.assertTrue(webTablesPage.textRowTest().contains(department));

	}

	@Test(priority = 120)
	public void userCanSubmitValidCompletedRegistartionFormOnPagePracticeForm() {
		String name = excelReader.getStringData("Excel Reader", 1, 12);
		String lastname = excelReader.getStringData("Excel Reader", 1, 13);
		String email = excelReader.getStringData("Excel Reader", 1, 2);
		String mobile = excelReader.getStringData("Excel Reader", 1, 14);
		String address = excelReader.getStringData("Excel Reader", 1, 4);
		String successMessage10 = excelReader.getStringData("Excel Reader", 9, 7);

		homePage.clickSectionForms();
		formsPage.pressButtonPracticeForms();
		practiceFormPage.insertFirstName(name);
		practiceFormPage.insertLastName(lastname);
		practiceFormPage.insertEmail(email);
		practiceFormPage.selectGender();
		practiceFormPage.insertMobile(mobile);
		practiceFormPage.insertDateOfBirth();
		practiceFormPage.selectMonth();
		practiceFormPage.selectYear();
		practiceFormPage.selectDate();
		practiceFormPage.insertAddress(address);
		practiceFormPage.pressSubmit();

		Assert.assertEquals(practiceFormPage.textSuccessMessage(), successMessage10);//verify that success message contains all added personal info 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				practiceFormPage.getbuttonClose());
		Assert.assertTrue(practiceFormPage.getbuttonClose().isDisplayed());//verify that button close is displayed
	}

	@Test(priority = 130)
	public void userCanRegisterOnPageBooKStoreWithValidCredentials() throws InterruptedException {
		String name = excelReader.getStringData("Excel Reader", 1, 12);
		String lastname = excelReader.getStringData("Excel Reader", 1, 13);
		String username = excelReader.getStringData("Excel Reader", 1, 15);
		String password = excelReader.getStringData("Excel Reader", 1, 16);
		String logout = excelReader.getStringData("Excel Reader", 1, 17);

		homePage.clickSectionBookStoreApplication();
		bookStoreApplicationPage.pressLogin();
		bookStoreApplicationPage.pressNewuser();
		bookStoreApplicationPage.insertFirstName(name);
		bookStoreApplicationPage.insertLastName(lastname);
		bookStoreApplicationPage.insertUserName(username);
		bookStoreApplicationPage.insertPassword(password);
		bookStoreApplicationPage.pressButtonRegister();
		driver.navigate().refresh();
		bookStoreApplicationPage.pressGoToLogin();
		bookStoreApplicationPage.insertUserName1(username);
		bookStoreApplicationPage.insertPassword1(password);
		bookStoreApplicationPage.pressLogin1();

		Assert.assertTrue(bookStoreApplicationPage.getLogout().isDisplayed());//verify that button close is displayed
		Assert.assertEquals(bookStoreApplicationPage.textLogout(), logout);
	}

}
