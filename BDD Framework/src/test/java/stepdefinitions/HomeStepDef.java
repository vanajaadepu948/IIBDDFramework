package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BaseClass;
import pages.HomePage;

public class HomeStepDef extends BaseClass {

	//private WebDriver driver;

	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private String ActualTitle;

	@Given("user on homepage")
	public void user_on_homepage() {
		prop = super.init_prop();
		DriverFactory.getDriver().get(prop.getProperty("url"));

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {

		ActualTitle = homePage.verifyHomePageDisplayText();
		System.out.println(ActualTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
