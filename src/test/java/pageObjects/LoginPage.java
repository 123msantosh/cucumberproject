package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	//elements
	@FindBy(name ="username")WebElement username_loc;
	
	@FindBy(name ="password")WebElement password_loc;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")WebElement login_btn_loc;
	
	
	
	//Action Methods
	
	public void username_pass(String username)
	{
		username_loc.sendKeys(username);
	}
	
	public void password_pass(String password)
	{
		password_loc.sendKeys(password);
	}
	
	public void clickButton()
	{
		login_btn_loc.click();
	}

}
