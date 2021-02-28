package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.admin.AddUser;
import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC005_Admin_CreateUserDisabled_POM {

	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	AddUser addUser;
	String username, password, employeeName, randomValue, statusUser, userPassword, userConfirmPassword;

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		seleniumWrapper = new SeleniumWrapper(driver);
		driver = seleniumWrapper.chromeDriverConnection();
		login = new Login(driver);
		userManagement = new UserManagement(driver);
		addUser = new AddUser(driver);
		randomValue = seleniumWrapper.GeneradorUser();

//		// DATA GENERATION
//		int random = (int) (Math.random() * 1000);

		// Datos tomados del JSON
//		this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
//		this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
//		this.employeeName = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "employeeName");
//		this.randomValue = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "randomValue");
//		this.userPassword = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "userPassword");
//		this.userConfirmPassword = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "userConfirmPassword");
//		this.statusUser = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "statusUser");

		// Datos tomados del excel
//		this.username = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 0);
//		this.password = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 1);
//		this.employeeName = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 2);
//		this.randomValue = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 3);
//		this.userPassword = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 4);
//		this.userConfirmPassword = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 5);
//		this.statusUser = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 6);

		// Datos Hardcodeados
		username = "Admin";
		password = "admin123";
		employeeName = "David Morris";
//		randomValue = "Richard Zamora" + random;
		userPassword = "Al1enw@re.2021";
		userConfirmPassword = "Al1enw@re.2021";
		statusUser = "Disable";

	}

	@Test
	public void TC005_Admin_CreateUserDisabled_POM_TestScript() {

		// Step 1
		seleniumWrapper.launchBrowser(GlobalVariables.QA_URL);

		// Step 2
		login.loginOrange(username, password);

		// Step 3
		userManagement.validateLogged();

		// Step 4
		userManagement.clickAdmin();

		// Step 5
		addUser.clickAdd();

		// Step 6
		// Step 7
		// Step 8
		// Step 9
		// Step 10
		addUser.saveUser(employeeName, randomValue, statusUser, userPassword, userConfirmPassword, true);

		// Step 11
		// Step 12
		userManagement.searchUser(randomValue, true);

		// Step 13
		userManagement.validateFromSearchTable("1", "2", randomValue);

		// Step 14
		login.logoutOrange();

	}

	@AfterTest
	public void afterTest() {

		// Step 9
		seleniumWrapper.closeBrowser();
	}

}
