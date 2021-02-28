package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC004_Admin_DeleteUser_POM {

	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password, addUserName, noRecordsFound, message;

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		seleniumWrapper = new SeleniumWrapper(driver);
		driver = seleniumWrapper.chromeDriverConnection();
		login = new Login(driver);
		userManagement = new UserManagement(driver);
		
		
		//Datos tomados del JSON
		this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
		this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
		this.addUserName = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "addUserName");
		this.noRecordsFound = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "noRecordsFound");
		this.message = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "message");
		
		//Datos tomados del excel
//		this.username = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 0);
//		this.password = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 1);
//		this.addUserName = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 2);
//		this.noRecordsFound = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 3);
//		this.message = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 4);
		
		//Datos Hardcodeados
//		username = "Admin";
//		password = "admin123";
//		addUserName = "Richard Zamora269";
//		noRecordsFound = "No Records Found";
//		message = "OrangeHRM - Confirmation Required";
	}

	@Test
	public void TC004_Admin_DeleteUser_POM_TestScript() {

		// Step 1
		seleniumWrapper.launchBrowser(GlobalVariables.QA_URL);

		// Step 2
		login.loginOrange(username, password);

		// Step 3
		userManagement.validateLogged();

		// Step 4
		userManagement.clickAdmin();

		// Step 5
		// Step 6
		userManagement.searchUser(addUserName, true);

		// Step 7
		userManagement.validateFromSearchTable("1", "2", addUserName);

		// Step 8
		// Step 9
		userManagement.selectUser();
		// Step 10
		// Step 11
		userManagement.validateModal("OrangeHRM - Confirmation Required", message);

		// Step 12
		userManagement.searchUser(addUserName, true);
		userManagement.validateFromSearchTable("1", "1", noRecordsFound);

		// Step 13
		login.logoutOrange();

	}

	@AfterTest
	public void afterTest() {

		// Step 14
		seleniumWrapper.closeBrowser();

	}

}
