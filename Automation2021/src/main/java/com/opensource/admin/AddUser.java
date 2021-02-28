package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class AddUser extends SeleniumWrapper {

	/*
	 * Constructor
	 */
	public AddUser(WebDriver driver) {
		super(driver);
	}

	By btn_add = By.xpath("//input[@id= 'btnAdd']");
	By txt_employeeName = By.xpath("//input[@id= 'systemUser_employeeName_empName']");
	By txt_addUserName = By.xpath("//input[@id= 'systemUser_userName']");
	By txt_userPassword = By.xpath("//input[@id= 'systemUser_password']");
	By txt_userConfirmPassword = By.xpath("//input[@id= 'systemUser_confirmPassword']");
	By sdd_status = By.xpath("//select[@id= 'systemUser_status']");
	By btn_edit = By.xpath("//input[@id= 'btnSave']");
	By btn_save = By.xpath("//input[@id= 'btnSave']");

	/*
	 * Click Add
	 */
	public void clickAdd() {
		reporterLog("Click Add");
		click(btn_add, "Add");
		implicitlyWait(5);
	}
	

	/*
	 * Add User and Save
	 */
	public void saveUser(String employeeName, String randomValue, String statusUser, String userPassword, String userConfirmPassword, boolean clickSave) {
		reporterLog("Add User");
		type(txt_employeeName, employeeName, "Employee Name");
		type(txt_addUserName, randomValue, "Username");
		type(sdd_status, statusUser, "Status");
		type(txt_userPassword, userPassword, "Password");
		type(txt_userConfirmPassword, userConfirmPassword, "Confirm Password");
//		waitForElementPresent
		
		if (clickSave) {
			click(btn_save, "Button Save");
		}
		implicitlyWait(10);
	}

}
