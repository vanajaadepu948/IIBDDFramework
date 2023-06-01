package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TradingAccountPage extends BaseClass {
	
	private WebDriver driver;
	
	private By HeaderText = By.xpath("//div[@class='ii-ardtul']/h1[text()='Trading Account']");
	private By OpenAnAccount = By.xpath("//span[text()='Open an account']");
	private By TransferToUs = By.xpath("//span[text()='Transfer to us']");
	private By GoToTransformationpage = By.xpath("(//div[text()='Cloud-only transformation'])[1]");
	
	public TradingAccountPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new util.ElementUtil(this.driver);
		javaScriptUtil = new util.JavaScriptUtil(this.driver);
	}
	
	public String getTradingAccountPageURL() {
		String tradingAccountPageURL = driver.getCurrentUrl();
		return tradingAccountPageURL;
	}
	
	public boolean getTradingAccountPageHeaderText() {
		return elementUtil.doIsDisplayed(HeaderText);
		
	}
	public boolean verifyOpenAnAccountDisplay() {
		return elementUtil.doIsDisplayed(OpenAnAccount);
		
	}
	public boolean verifyTransferToUsDisplay() {
		return elementUtil.doIsDisplayed(TransferToUs);
		
	}
	
	

}

