package com.Actitme.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.Generic.BaseClass;
import com.Actitime.Generic.FileLib;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskListPage;
@Listeners(com.Actitime.Generic.LisenerImplimentation.class)
public class ActitimeTestClass extends BaseClass {
	
	@Test
	public void createCustomerTest() throws EncryptedDocumentException, IOException, Throwable {
		HomePage h = new HomePage(driver);
		TaskListPage task=new TaskListPage(driver);
		FileLib f = new FileLib();
		h.setTaskTab();
		task.getAddNewButton().click();
		task.getNewCustomerButton().click();
		String customerName = f.getExcelData("CreateCustomer", 1, 3);
		String customerDescription=f.getExcelData("CreateCustomer", 1, 4);
		task.getCustomerNameTextField().sendKeys(customerName);
		task.getCustomerDescTextField().sendKeys(customerDescription);
		task.getSelectCustomerDropDown().click();
		task.getBigBangCompanyCustomerButton().click();
		task.getCreateCustomerButton().click();
		Thread.sleep(3000);
		String actualCustomerName = task.getCustomerTitle().getText();
		Assert.assertEquals(actualCustomerName,customerName,"Fail: Customer is not created and it is verified.");
		Reporter.log("Pass: Customer has Created Successfully and it is verified");	
	}
	
	@Test
	public void createProjectTest() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage h = new HomePage(driver);
		TaskListPage task=new TaskListPage(driver);
		FileLib f = new FileLib();
		h.setTaskTab();
		task.getAddNewButton().click();
		task.getNewProjectButton().click();
		String projectName = f.getExcelData("CreateProject", 1, 3);
		String ProjectDescription=f.getExcelData("CreateProject", 1, 4);
		task.getProjectNameTextField().sendKeys(projectName);
		task.getSelectCustomerToAddProjectDropDown().click();
		WebElement ourCompany = task.getOurCompanyProjectButton();
		Actions action= new Actions(driver);
		action.scrollToElement(ourCompany);
		ourCompany.click();
		task.getProjectDescTextField().sendKeys(ProjectDescription);
		task.getCreateProjectButton().click();
		Thread.sleep(3000);
		String actualProjectName = task.getProjectTitle().getText();
		Assert.assertEquals(actualProjectName, projectName,"Fail: Project has not created and it is verified.");
		Reporter.log("Pass: Project has created successfully and it is verified.");
	}
	
	@Test
	public void createTaskTest() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage h = new HomePage(driver);
		TaskListPage task=new TaskListPage(driver);
		FileLib f = new FileLib();
		h.setTaskTab();
		String taskName = f.getExcelData("CreateTask", 1, 3);
		task.getAddNewButton().click();
		task.getNewTasksButton().click();
		task.getEnterTaskNameTextField().sendKeys(taskName);
		task.getCreateTaskButton().click();
		Thread.sleep(3000);
		String actualtaskName = task.getTaskName().getText();
		Assert.assertEquals(actualtaskName, taskName,"Fail: Task is not created and it is verified.");
		Reporter.log("Pass: Task has created successfully and it is verified.",true);
			
	}
}