package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.StocksandSharesISAPage;

public class StocksandSharesStepDef {
	private StocksandSharesISAPage stocksandSharesISAPage = new StocksandSharesISAPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("click on Stocks and Shares ISA link")
	public void click_on_stocks_and_shares_isa_link() {
		
		homePage.clickStocksandSharesISA();
	}

	@Then("Stocks and Shares ISA Page URL should be {string}")
	public void stocks_and_shares_isa_page_url_should_be(String ExpectedSSISAPageURL) {
		String ActualSASISAURL = stocksandSharesISAPage.getStocksandSharesISAURL();
		Assert.assertEquals(ActualSASISAURL, ExpectedSSISAPageURL);
	}

	@Then("Open an ISA button {string} should be displayed on SSISA page")
	public void open_an_isa_button_should_be_displayed_on_ssisa_page(String expectedtext) {
		String displayactualtext = stocksandSharesISAPage.verifyOpenAnISADisplay();
		Assert.assertEquals(displayactualtext, expectedtext);
	}

	@Then("Transfer an ISA button {string} should be displayed on SSISA page")
	public void transfer_an_isa_button_should_be_displayed_on_ssisa_page(String expectedtext) {
		String displayactualtext = stocksandSharesISAPage.verifyTransferAnISADisplay();
		Assert.assertEquals(displayactualtext, expectedtext);
	}

	@Then("Stocks and Shares ISA text {string} should be displayed on SSISA page")
	public void stocks_and_shares_isa_text_should_be_displayed_on_ssisa_page(String expectedtext) {
		String displayactualtext = stocksandSharesISAPage.getStocksandSharesPageHeaderText();
		Assert.assertEquals(displayactualtext, expectedtext);
	}

}
