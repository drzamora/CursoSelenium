package com.opensource.admin.qa;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.Login;
import com.opensource.admin.UserManagement;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;

public class TC001_Admin_SearchEmployee_POM {

	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	Login login;
	UserManagement userManagement;
	String username, password;

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		seleniumWrapper = new SeleniumWrapper(driver);
		driver = seleniumWrapper.chromeDriverConnection();
		login = new Login(driver);
		userManagement = new UserManagement(driver);
		
		
		//Datos tomados del JSON
		this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
		this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
		 
		//Datos tomados del excel
//		this.username = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 0);
//		this.password = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 1);
		
		//Datos Hardcodeados
//		username = "Admin";
//		password = "admin123";

	}

	@Test
	public void TC001_Admin_SearchEmployee_POM_TestScript() {

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
		userManagement.searchUser(username, true);

		// Step 7
		userManagement.validateFromSearchTable("1", "2", username);

		// Step 8
		login.logoutOrange();
	}

	@AfterTest
	public void afterTest() {

		// Step 9
		seleniumWrapper.closeBrowser();
	}

}