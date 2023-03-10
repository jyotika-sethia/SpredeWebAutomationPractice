package runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"rerun:target/rerun.txt"},

		glue = { "sprede.stepdefinitions" },
		monochrome =true,
		 //tags = { "@smoke" },
		 features = { "@target/failedrerun.txt" }

)

public class CukeRunnerTestFailedScenarios{
	@BeforeClass
	public static void setup() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		String userDir = System.getProperty("user.dir");
		extentProperties.setReportPath(
				userDir + "/target/CucumberReportForEveryTestWithTimeStamp/Report_" + timeStamp + ".html");
	}

}
