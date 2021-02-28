package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagement extends SeleniumWrapper {

	public UserManagement(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By link_admin = By.xpath("//a[@id = 'menu_admin_viewAdminModule']");
	By txt_search = By.xpath("//input[@id = 'searchSystemUser_userName']");
	By btn_search = By.xpath("//input[@id = 'searchBtn']");
	By tbl_firstRowSearch = By.xpath("//tbody/tr[1]/td[2]");
	By cb_chkSelectRecord = By.xpath("//input[@id= 'ohrmList_chkSelectAll']");
	By btn_delete = By.xpath("//input[@id ='btnDelete']");
	By btn_dialogDeleteBtn = By.xpath("//input[@id= 'dialogDeleteBtn']");
	
	//input[@id='ohrmList_chkSelectAll']
	//input[@id='ohrmList_chkSelectRecord_50']


	/*
	 * Validate logged successfully
	 */

	public void validateLogged() {
		reporterLog("Validate that you have logged in successfully");
		waitForElementPresent(link_admin, 10);
		takeScreenshot("AfterValideLogged");
		
	}

	/*
	 * Click Admin
	 */
	public void clickAdmin() {
		reporterLog("Click Admin - Go to the admin page");
		click(link_admin, "Admin");
		implicitlyWait(5);
		takeScreenshot("AfterClickAdmin");
	}
	

	/*
	 * Click No Records Found
	 */
	public void clickNoRecordsFound() {
		reporterLog("Click XYZ - Go to the admin page");
		click(link_admin, "XYZ");
		implicitlyWait(5);
	}

	/*
	 * Search User
	 */
	public void searchUser(String user, boolean clickSearch) {
		reporterLog("Search username in field");
		type(txt_search, user, "Search field");
		takeScreenshot("AfterType"+user);
		if (clickSearch) {
			click(btn_search, "Button Search");
		}
		implicitlyWait(5);
		takeScreenshot("SearhUser"+user);
	}

	/*
	 * Validate value from search table
	 */

	public void validateFromSearchTable(String expectedValue) {
		reporterLog("Verify value in search table");
		String actualValue = getText(tbl_firstRowSearch);
		assertEquals(actualValue, expectedValue);
	}

//	/*
//	 * Validate value from search table No Records Found
//	 */
// 
//	public void validateNoRecordsFoundFromSearchTable(String expectedValue) {
//		reporterLog("Verify username is not exist in table");
//		String actualValue = getText(tbl_noRecordsFoundSearch);
//		assertEquals(actualValue, expectedValue);
//	}
//	

	/*
	 * Validate value from search table
	 */

	public void validateFromSearchTable(String row, String column, String expectedValue) {
		reporterLog("Verify value in search table");
		String actualValue = getValueFromTable(row, column);
		assertEquals(actualValue, expectedValue);
		takeScreenshot("validateFromSearchTable");
	}
	
	/*
	 * Validate pop-window is displayed: "Delete Records?"
	 */
	
	/*
	 * Select User
	 */

	public void selectUser() {
		reporterLog("Select User");
		click(cb_chkSelectRecord, "Select User");
		click(btn_delete, "Click Delete");
//		waitForElementPresent(actualValue, expectedValue);
		implicitlyWait(5);
	}


	public void validateModal(String message, String expectedValue) {
		reporterLog("Validate pop-window is displayed: Delete Records?");
		String actualValue = popWindow(message);
		assertEquals(actualValue, expectedValue);
        click(btn_dialogDeleteBtn, "Delete records? OK");
		implicitlyWait(5);
	}

}