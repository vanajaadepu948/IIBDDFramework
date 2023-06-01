package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JuniorISAPage extends BaseClass {
	private WebDriver driver;
	private By JuniorISAHeaderText = By.xpath("//div[@class='ii-ardtul']/h1[text()='Junior Stocks and Shares ISA']");

	public JuniorISAPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new util.ElementUtil(this.driver);
		javaScriptUtil = new util.JavaScriptUtil(this.driver);
	}
	public String getJuniorISAPageURL() {
		String JuniorISAPageUR = driver.getCurrentUrl();
		return JuniorISAPageUR;
	}
	
	public String getJuniorISAPageHeaderText() {
		return elementUtil.doGetText(JuniorISAHeaderText);
		
	}

}
