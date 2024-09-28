package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"./Features/Login.feature" },
		//features="@targer/rerun.txt",
		
		glue="stepDefinitions",
		plugin= {"pretty",
				"html:reports/myreport.html",
				"json:reports/myreport.json",
				"rerun:target/rerun.txt"},
		dryRun=false,
		monochrome=true,
//		tags="@Sanity",
		tags={"@P1 or @P2"}
		)

public class testRunner {

}
