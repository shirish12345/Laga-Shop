package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {
	
	
	WebDriver driver;
	

	public LoginPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"authentication\"]" )
	WebElement emailsignup;
	
	@FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span" )
	WebElement createaccount;
	
	@FindBy(id = "email" )
	WebElement signInemail;
	
	@FindBy(id = "passwd" )
	WebElement password;
	
	
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span" )
	WebElement Signinbtn;
	
	/*public void signUp() {
		emailsignup.sendKeys("shirish@gmail.com");
		createaccount.click();
	}*/

	public void signIn() {
		
		signInemail.sendKeys(RegisterPO.email);
		password.sendKeys("Activa@6424");
		Signinbtn.click();
	}
	

}
