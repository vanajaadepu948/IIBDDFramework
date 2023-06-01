package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SIPPPage extends BaseClass {
	
	private WebDriver driver;
	private By SIPPHeaderText = By.xpath("//div[@class='ii-ardtul']/h1[text()='Stocks and Shares ISA']");
	private By OpenaSIPP = By.xpath("(//span[@title='Open a SIPP'])[1]");
	private By TransferYourPension = By.xpath("(//span[@title='Transfer your pension'])[1]");


	public SIPPPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new util.ElementUtil(this.driver);
		javaScriptUtil = new util.JavaScriptUtil(this.driver);
	}
	public String getSippURL() {
		String StocksandSharesISAPageURL = driver.getCurrentUrl();
		return StocksandSharesISAPageURL;
	}

	public String verifyOpenaSippDisplay() {
		return elementUtil.doGetText(OpenaSIPP);
		
	}
	public String verifyTransferYourPensionADisplay() {
		return elementUtil.doGetText(TransferYourPension);
		
	}

}
