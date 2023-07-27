package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescTextField;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDropDown;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Big Bang Company']")
	private WebElement bigBangCompanyCustomerButton;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement CustomerTitle;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name' and @type='text'])[2]")
	private WebElement projectNameTextField;
	
	@FindBy(xpath="//div[@class='selectedItem']/parent::div[@class='comboboxButton']/descendant::div[@class='dropdownButton']")
	private WebElement selectCustomerToAddProjectDropDown;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyProjectButton;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDescTextField;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectButton;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement ProjectTitle;
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTasksButton;
	
	@FindBy(xpath="((//div[@class='selectedItem']/parent::div[@class='comboboxButton']/descendant::div[@class='dropdownButton'])[1]")
	private WebElement customerDropDown;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Our company']")
	private WebElement OurCompanyDropDown;
	
	@FindBy(xpath="(//div[@class='selectedItem']/parent::div[@class='comboboxButton']/descendant::div[@class='dropdownButton'])[2]")
	private WebElement ProjectDropDown;
	
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Accounting']")
	private WebElement accountingButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement enterTaskNameTextField;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTaskButton;
	
	@FindBy(xpath="//div[text()='Training Institute']")
	private WebElement taskName;
	
	//Constructor Creation
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNewProjectButton() {
		return newProjectButton;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getSelectCustomerToAddProjectDropDown() {
		return selectCustomerToAddProjectDropDown;
	}

	public WebElement getOurCompanyProjectButton() {
		return ourCompanyProjectButton;
	}

	public WebElement getProjectDescTextField() {
		return projectDescTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public WebElement getProjectTitle() {
		return ProjectTitle;
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}

	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}

	public WebElement getCustomerDescTextField() {
		return customerDescTextField;
	}

	public WebElement getSelectCustomerDropDown() {
		return selectCustomerDropDown;
	}

	public WebElement getBigBangCompanyCustomerButton() {
		return bigBangCompanyCustomerButton;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCustomerTitle() {
		return CustomerTitle;
	}

	public WebElement getNewTasksButton() {
		return newTasksButton;
	}

	public WebElement getCustomerDropDown() {
		return customerDropDown;
	}

	public WebElement getOurCompanyDropDown() {
		return OurCompanyDropDown;
	}

	public WebElement getProjectDropDown() {
		return ProjectDropDown;
	}

	public WebElement getAccountingButton() {
		return accountingButton;
	}

	public WebElement getEnterTaskNameTextField() {
		return enterTaskNameTextField;
	}

	public WebElement getCreateTaskButton() {
		return createTaskButton;
	}

	public WebElement getTaskName() {
		return taskName;
	}
	
	
}
