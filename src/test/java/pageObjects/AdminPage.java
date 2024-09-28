package pageObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class AdminPage extends BasePage {
Actions ac;
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	//elements
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")WebElement click_admin_button;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")WebElement click_add_button;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")WebElement select_role_drp_loc;
	
	@FindBy(css ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")WebElement select_status_drp_loc;
	
	@FindBy(xpath="//div[@class='oxd-select-option']//span[text()='Admin']")WebElement click_admin_role_drp;
	
	@FindBy(xpath="//div//span[text()='Enabled']")WebElement click_enabled_status_drp;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")WebElement select_empname_loc;

	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")WebElement select_username_loc;
	

	//@FindBys(value= { @FindBy(xpath = "//div[@role='option']") })List<WebElement> lists_empName_options_loc;
	
	@FindBy(xpath="(//span[normalize-space()='Peter Mac Anderson']")WebElement ename_loc;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")WebElement username_loc;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")WebElement password_loc;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")WebElement confirm_password_loc;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")WebElement click_save_button;
	
	//Action methods
	
	public void clickOnAdminButton()
	{
		click_admin_button.click();
	}
	
	

	public void clickOnAddButton()
	{
		click_add_button.click();
	}
	

	public void handleRoleDropdown()
	{
		select_role_drp_loc.click();
		click_admin_role_drp.click();
		
	}
	

	public void handleStatusDropdown()
	{
		select_status_drp_loc.click();
		click_enabled_status_drp.click();
	}
	

	public void selectEmpName() {
//	{ int size = lists_empName_options_loc.size();
	select_empname_loc.sendKeys("Peter Mac Anderson");
//	ename_loc.click();
//	 ac=new Actions(driver);

//	for (WebElement lists : lists_empName_options_loc) {
//		System.out.println(size);
//	
//			String text = lists.getText();
//			if (text.equals("Linda Jane Anderson")) {
//				lists.click();
//			}
//	}
		
	}
	
	public void selectUsername(String username)
	{
		select_username_loc.sendKeys(username);
	}
	

	public void enterPassword(String password)
	{
		password_loc.sendKeys(password);
	}
	

	public void confirmPassword(String cnf_password)
	{
		confirm_password_loc.sendKeys(cnf_password);
	}
	
	public void clickOnSaveButton()
	{
		click_save_button.click();
	}
	
	

}
