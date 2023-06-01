package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import util.ConfigReader;
import util.ElementUtil;
import util.JavaScriptUtil;

public class BaseClass extends ConfigReader {
	public WebDriver driver;
	public ElementUtil elementUtil;
	public JavaScriptUtil javaScriptUtil;
	private HomePage homePage;
	public TradingAccountPage TradingAccountPage;
	public Properties prop;
	
	
	//prop = configReader.init_prop();
	//private Properties prop = new Properties();

	/*
	 * public TradingAccountPage tradingAccountPage; public StocksandSharesISAPage
	 * stocksandSharesISAPage; public SIPPPage sIPPPage; public JuniorISAPage
	 * juniorISAPage; public ElementUtil elementUtil; public JavaScriptUtil
	 * javaScriptUtil;
	 */

	/*
	 * @Before public void setup() {
	 * 
	 * prop = super.init_prop(); driver =
	 * super.init_driver(prop.getProperty("browser")); homepage = new
	 * HomePage(driver); tradingAccountPage = new TradingAccountPage(driver);
	 * stocksandSharesISAPage = new StocksandSharesISAPage(driver); sIPPPage = new
	 * SIPPPage(driver); juniorISAPage = new JuniorISAPage(driver);
	 * 
	 * }
	 */
}
