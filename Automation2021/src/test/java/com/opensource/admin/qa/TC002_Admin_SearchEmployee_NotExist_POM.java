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

public class TC002_Admin_SearchEmployee_NotExist_POM {

	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, usernamexyz, password, noRecordsFound;

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		seleniumWrapper = new SeleniumWrapper(driver);
		driver = seleniumWrapper.chromeDriverConnection();
		login = new Login(driver);
		userManagement = new UserManagement(driver);
		

		
		//Datos tomados del JSON
		this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
		this.usernamexyz = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "usernamexyz");
		this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
		this.noRecordsFound = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "noRecordsFound");
		
		
		//Datos tomados del excel
//		this.username = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 0);
//		this.usernamexyz = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 1);
//		this.password = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 2);
//		this.noRecordsFound = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 3);
		
		//Datos Hardcodeados
//		username = "Admin";
//		usernamexyz = "XYZ";
//		password = "admin123";
//		noRecordsFound = "No Records Found";
	}

	@Test
	public void TC002_Admin_SearchEmployee_NotExist_POM_TestScript() {

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
		userManagement.searchUser(usernamexyz, true);

		// Step 7
		userManagement.validateFromSearchTable("1", "1", noRecordsFound);

		// Step 8
		login.logoutOrange();

	}

	@AfterTest
	public void afterTest() {

		// Step 9
		seleniumWrapper.closeBrowser();

	}

}
