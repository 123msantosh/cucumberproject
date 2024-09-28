package stepDefinitions;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import pageObjects.DashBoard;
import pageObjects.LoginPage;



public class step {

	WebDriver driver;
	Logger logger;
	LoginPage lp;
	DashBoard db;
	 ResourceBundle rb;
	String br;
	 
	 
	@Before
	public void setup()
	{   //log for particular class
		logger=LogManager.getLogger(this.getClass());
		//Reading config.properties (for browser)
		rb=ResourceBundle.getBundle("config");
		  br=rb.getString("browser");	
	}
	
	@After
	public void tearDown(Scenario scenario)
	{ System.out.println(scenario.getStatus());
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		
		driver.quit();
	}
	
	
	
@Given("user launch the browser")
public void user_launch_the_browser() {
   if(br.equals("chrome")) {
	   
	   driver=new ChromeDriver();
   }
   else if (br.equals("edge")) {
	driver=new EdgeDriver();
   }
   else if (br.equals("firefox")) {
	driver=new FirefoxDriver();
   }
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   logger.info("**** Launch the browser ***");
}

@Given("opens the URL {string}")
public void opens_the_url(String url) {
   driver.get(url);
   driver.manage().window().maximize();
   logger.info(" open the url ");
}

@When("user enter username as {string}")
public void user_enter_username_as(String username) {
    lp=new LoginPage(driver);
    lp.username_pass(username);
    logger.info("Enter the username username");
}

@When("user enters password as {string}")
public void user_enters_password_as(String password) {
    lp.password_pass(password);
    logger.info("Entered the password");
}

@When("click on login button")
public void click_on_login_button() {
   lp.clickButton();
   logger.info("click on login button");
}

@Then("user navigates to dashboard page")
public void user_navigates_to_dashboard_page() throws InterruptedException {
   db=new DashBoard(driver);
   db.validations();
}

	
	
}
