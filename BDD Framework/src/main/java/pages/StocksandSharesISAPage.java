package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StocksandSharesISAPage extends BaseClass {
	
	private WebDriver driver;
	private By StocksandSharesHeaderText = By.xpath("//div[@class='ii-ardtul']/h1[text()='Stocks and Shares ISA']");
	private By OpenAnISA = By.xpath("(//span[@class='chakra-button ii-1bxdl5'][@title='Open an ISA'])[1]");
	private By TransferAnISA = By.xpath("//span[@title='Transfer an ISA']");


	public StocksandSharesISAPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new util.ElementUtil(this.driver);
		javaScriptUtil = new util.JavaScriptUtil(this.driver);
	}
	public String getStocksandSharesISAURL() {
		String StocksandSharesISAPageURL = driver.getCurrentUrl();
		return StocksandSharesISAPageURL;
	}
	
	public String getStocksandSharesPageHeaderText() {
		return elementUtil.doGetText(StocksandSharesHeaderText);
		
	}
	public String verifyOpenAnISADisplay() {
		return elementUtil.doGetText(OpenAnISA);
		
	}
	public String verifyTransferAnISADisplay() {
		return elementUtil.doGetText(TransferAnISA);
		
	}
}
