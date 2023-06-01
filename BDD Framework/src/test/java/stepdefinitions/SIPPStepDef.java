package stepdefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SIPPPage;
public class SIPPStepDef  {
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private SIPPPage sIPPPage = new SIPPPage(DriverFactory.getDriver());
	
	@Given("click on SIPP link")
	public void click_on_sipp_link() {
		homePage.clickSIPP();
	}

	@Then("SIPP Page URL should be {string}")
	public void sipp_page_url_should_be(String ExpectedURL) {
		String SIPPURL = sIPPPage.getSippURL();
		Assert.assertEquals(SIPPURL, ExpectedURL);
	}

	@Then("Open a SIPP button {string} should be displayed on SIPP")
	public void open_a_sipp_button_should_be_displayed_on_sipp(String expectedtext) {
		String displayactualtext = sIPPPage.verifyOpenaSippDisplay();
		Assert.assertEquals(displayactualtext, expectedtext);
	}

	@Then("Transfer your pension {string} should be displayed on SIPP")
	public void transfer_your_pension_should_be_displayed_on_sipp(String expectedtext) {
		String displayactualtext = sIPPPage.verifyTransferYourPensionADisplay();
		Assert.assertEquals(displayactualtext, expectedtext);
	}

}
