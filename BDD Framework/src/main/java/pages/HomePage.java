package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass {
	private WebDriver driver;
	
	private By ServicesDropdownMenu = By.xpath("//span[@title='Services']");
	private By TradingAccount = By.xpath("//a[text()='Trading Account']");
	private By StockAndSharesISA = By.xpath("//a[@href='/ii-accounts/isa']");
	private By SIPP = By.xpath("//a[text()='Open a SIPP']");
	private By JuniorISA = By.xpath("//a[text()='Junior ISA']");
	private By CashSavings = By.xpath("//a[text()='Cash Savings']");
	private By SeeAllAcounts = By.xpath("//a[text()='See all accounts']");
	private By InvestingwithII = By.xpath("//a[text()='Investing with ii']");
	private By OurCharges = By.xpath("//a[text()='Our charges']");
	private By TransfertoII = By.xpath("//a[text()='Transfer to ii']");
	private By RecommendII = By.xpath("//a[text()='Recommend ii']");
	private By FriendsandFamily = By.xpath("//a[text()='Friends and Family']");
	private By Shares = By.xpath("(//a[text()='Shares'])[1]");
	private By Funds = By.xpath("(//a[text()='Funds'])[1]");
	private By InvestmentTrusts = By.xpath("(//a[text()='Investment trusts'])[1]");
	private By ETFs = By.xpath("(//a[text()='ETFs'])[1]");
	private By BondsandGifts = By.xpath("//a[text()='Bonds and Gilts']");
	private By IPOnewIssues = By.xpath("//a[text()='IPOs and new issues']");
	private By USandinternationalInvesting = By.xpath("//a[text()='US and international investing']");
	private By HomePageText = By.xpath("//p[@class='text-display']");
	private By AcceptButton = By.xpath("//button[text()='Accept']");

	//2.Constructor of the page class

	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new util.ElementUtil(this.driver);
		javaScriptUtil = new util.JavaScriptUtil(this.driver);
	}

	public void clickAcceptCookiesButton() {
		elementUtil.clickWhenReady(AcceptButton, 20);
	}

	public String verifyHomePageDisplayText() {
		elementUtil.clickWhenReady(AcceptButton, 20);
		String HomepageDisplayText = elementUtil.doGetText(HomePageText);
		return HomepageDisplayText;
	}
	public void clickServicesDropDownMenu() {
		elementUtil.clickWhenReady(ServicesDropdownMenu,20);
	}

	public void clickTradingAccount() {
		elementUtil.clickWhenReady(TradingAccount,20);
	}
	public void clickStocksandSharesISA() {
		elementUtil.clickWhenReady(StockAndSharesISA,20);
	}
	public void clickSIPP() {
		elementUtil.clickWhenReady(SIPP,20);
	}
	public void clickJuniorISA() {
		elementUtil.clickWhenReady(JuniorISA,20);
	}
	public void clickCashSavings() {
		elementUtil.clickWhenReady(CashSavings,20);
	}
	public void clickSeeAllAcounts() {
		elementUtil.clickWhenReady(SeeAllAcounts,20);
	}
	public void clickIncestingwithII() {
		elementUtil.clickWhenReady(InvestingwithII,20);
	}
	public void clickOurCharges() {
		elementUtil.clickWhenReady(OurCharges,20);
	}
	public void clickTransfertoII() {
		elementUtil.clickWhenReady(TransfertoII,20);
	}
	public void clickRecommendII() {
		elementUtil.clickWhenReady(RecommendII,20);
	}
	public void clickFriendsandFamily() {
		elementUtil.clickWhenReady(FriendsandFamily,20);
	}
	public void clickShares() {
		elementUtil.clickWhenReady(Shares,20);
	}
	public void clickFunds() {
		elementUtil.clickWhenReady(Funds,20);
	}
	public void clickInvestmentTrusts() {
		elementUtil.clickWhenReady(InvestmentTrusts,20);
	}
	public void clickETFs() {
		elementUtil.clickWhenReady(ETFs,20);
	}
	public void clickBondsandGifts() {
		elementUtil.clickWhenReady(BondsandGifts,20);
	}
	public void clickIPOsandNewIssues() {
		elementUtil.clickWhenReady(IPOnewIssues,20);
	}
	public void clickUSandInternationalInvesting() {
		elementUtil.clickWhenReady(USandinternationalInvesting,20);
	}

}
