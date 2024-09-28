package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage {

	public DashBoard(WebDriver driver) {
		super(driver);	
	}

	//elements
	@FindBy(css = ".oxd-userdropdown-name")WebElement click_logout_drp;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")WebElement Logout_button;
	
//	@FindBy(xpath="//h6[normalize-space()='Dashboard']")WebElement dashboard_text;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")WebElement click_admin_button;
	
	//Methods
	public void logout()
	{
		click_logout_drp.click();
		Logout_button.click();
	}
	
	public void validations() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
	
		if(title.equals("OrangeHRM"))
		{
			System.out.println(title);
			click_admin_button.click();
		}
	
	}
}
