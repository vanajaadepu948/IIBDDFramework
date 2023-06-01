package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.BaseClass;
import pages.HomePage;
import pages.TradingAccountPage;

public class TradingAccountStepDef extends BaseClass {

	private TradingAccountPage tradingAccountPage = new TradingAccountPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user click on homepage Services Menu feature")
	public void user_click_on_homepage_services_menu_feature() {
		homePage.clickAcceptCookiesButton();
		homePage.clickServicesDropDownMenu();
	}

	@Given("click on Trading Account link")
	public void click_on_trading_account_link() {
		homePage.clickTradingAccount();
	}

	@Then("Trading Account Page URL should be {string}")
	public void trading_account_page_url_should_be(String TradingAccountPageURL) {
		String TAPURL = tradingAccountPage.getTradingAccountPageURL();
		Assert.assertEquals(TAPURL, TradingAccountPageURL);
	}

	@Then("Open an account button {string} should be displayed on trading account page")
	public void open_an_account_button_should_be_displayed_on_trading_account_page(String OpenAnAccountButtonName) {
		boolean status = tradingAccountPage.verifyOpenAnAccountDisplay();
		Assert.assertEquals(true, status);
	}

	@Then("Transfer to us button {string} should be displayed on trading account page")
	public void transfer_to_us_button_should_be_displayed_on_trading_account_page(String string) {
		boolean status = tradingAccountPage.verifyTransferToUsDisplay();
		Assert.assertEquals(true, status);
	}

	@Then("Trading account text {string} should be displayed on trading account page")
	public void trading_account_text_should_be_displayed_on_trading_account_page(String string) {
		boolean status = tradingAccountPage.getTradingAccountPageHeaderText();
		Assert.assertEquals(true, status);
	}

}
