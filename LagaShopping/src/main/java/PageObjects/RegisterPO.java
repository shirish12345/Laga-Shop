package PageObjects;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPO {

	WebDriver driver;

	public RegisterPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "uniform-id_gender1")
	WebElement chkBox;

	@FindBy(id = "customer_firstname")
	WebElement personal_firstName;

	@FindBy(id = "customer_lastname")
	WebElement personal_Lastname;

	@FindBy(id = "email")
	WebElement personal_email;

	@FindBy(id = "passwd")
	WebElement personal_password;

	@FindBy(id = "firstname")
	WebElement address_firstName;

	@FindBy(id = "lastname")
	WebElement address_lastName;

	@FindBy(id = "company")
	WebElement companyName;

	@FindBy(id = "address1")
	WebElement lineone_Address;

	@FindBy(id = "address2")
	WebElement linetwo_Address;

	@FindBy(id = "city")
	WebElement cityName;

	@FindBy(id = "postcode")
	WebElement postCode;

	@FindBy(id = "id_state")
	WebElement stateTxt;

	@FindBy(id = "id_country")
	WebElement countryTxt;

	@FindBy(xpath = "//*[@id=\"other\"]")
	WebElement addressInformation;

	@FindBy(id = "phone")
	WebElement phoneDetails;

	@FindBy(id = "phone_mobile")
	WebElement mobileNumber;

	@FindBy(xpath = "//*[@id=\"alias\"]")
	WebElement futurerefEmail;

	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	WebElement submitClick;

	@FindBy(id = "days")
	WebElement days;

	@FindBy(id = "months")
	WebElement months;

	@FindBy(id = "years")
	WebElement year;
	
	
	
	@FindBy(linkText="Sign out")
	WebElement signOut;
	
	
	static String email;

	public void register() throws InterruptedException {

		System.out.println("Inside registrartion..");

		chkBox.click();

		Thread.sleep(1000);
		personal_firstName.clear();
		personal_firstName.sendKeys("Shrish");

		Thread.sleep(1000);
		personal_Lastname.clear();
		personal_Lastname.sendKeys("Dixit");

		Thread.sleep(1000);
		personal_email.clear();
		
		Random rand = new Random(); 
        int rand_num = rand.nextInt(8000); 
		
		email = "ss12dixit"+rand_num+"@gmail.com";
		personal_email.sendKeys(email);

		Thread.sleep(1000);
		personal_password.clear();
		personal_password.sendKeys("Activa@6424");

		Select s = new Select(days);
		s.selectByValue("2");

		Select s1 = new Select(months);
		s1.selectByIndex(4);

		Select s2 = new Select(year);
		s2.selectByIndex(6);

		Thread.sleep(1000);
		address_firstName.clear();
		address_firstName.sendKeys("shirish");

		Thread.sleep(1000);
		address_lastName.clear();
		address_lastName.sendKeys("Dixit");

		Thread.sleep(1000);
		companyName.clear();
		companyName.sendKeys("Amdocs");

		Thread.sleep(1000);
		lineone_Address.clear();
		lineone_Address.sendKeys("Taljai society");

		Thread.sleep(1000);
		linetwo_Address.clear();
		linetwo_Address.sendKeys("Pune city");

		Thread.sleep(1000);
		cityName.clear();
		cityName.sendKeys("Pune");

		Select statesel = new Select(stateTxt);
		statesel.selectByIndex(6);

		Thread.sleep(1000);
		postCode.clear();
		postCode.sendKeys("41104");

		Select countrySel = new Select(countryTxt);
		countrySel.selectByIndex(1);

		Thread.sleep(1000);
		addressInformation.clear();
		addressInformation.sendKeys("Dhanakadi Pune");

		Thread.sleep(1000);
		phoneDetails.clear();
		phoneDetails.sendKeys("1234567890");

		Thread.sleep(1000);
		mobileNumber.clear();
		mobileNumber.sendKeys("8888980178");

		Thread.sleep(1000);
		futurerefEmail.clear();
		futurerefEmail.sendKeys("sayaleeshirishdixt1222@gmail.com");

		Thread.sleep(2000);

		submitClick.click();
		
		Thread.sleep(5000);
		signOut.click();
	}

}
