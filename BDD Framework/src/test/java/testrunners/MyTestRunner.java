package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/HomePage.feature",
		"src/test/resources/Features/Services/TradingAccount.feature",
		"src/test/resources/Features/Services/StocksAndShares.feature",
		"src/test/resources/Features/Services/SIPP.feature",
		"src/test/resources/Features/Services/JuniorISA.feature" }, glue = { "stepdefinitions",
"appHooks" },
		monochrome = true,
		/* tags = "@tag1", */

		plugin = { "pretty" }

)
public class MyTestRunner {

}
