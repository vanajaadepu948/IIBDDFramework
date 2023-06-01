package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.JuniorISAPage;
public class JuniorISAStepDef {

	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private JuniorISAPage juniorISAPage = new JuniorISAPage(DriverFactory.getDriver());

	@Given("click on Junior ISA link")
	public void click_on_junior_isa_link() {
		homePage.clickJuniorISA();
	}

	@Then("Junior ISA Page URL should be {string} shown")
	public void junior_isa_page_url_should_be_shown(String ExpectedURL) {
		String JISAURL = juniorISAPage.getJuniorISAPageURL();
		Assert.assertEquals(JISAURL, ExpectedURL);
	}

	@Then("Junior Stocks and Shares ISA text {string} should be displayed onjunior isa page")
	public void junior_stocks_and_shares_isa_text_should_be_displayed_onjunior_isa_page(String expectedtext) {
		String displayactualtext = juniorISAPage.getJuniorISAPageHeaderText();
		Assert.assertEquals(displayactualtext, expectedtext);
	}

}
