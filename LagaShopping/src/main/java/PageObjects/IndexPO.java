package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPO {

	WebDriver driver;
	

	public IndexPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;

	@FindBy(id = "email_create")
	WebElement emailTxt;

	@FindBy(id = "SubmitCreate")
	WebElement createAccount;

	public void clicksignin() throws InterruptedException {
		System.out.println("Inside Index");

		signIn.click();
		Thread.sleep(2000);

		emailTxt.sendKeys("amol13414@gmail.com");
		Thread.sleep(2000);
		createAccount.click();

		// return PageFactory.initElements(BrowserLaunch.driver, RegisterPO.class);
	}
}
