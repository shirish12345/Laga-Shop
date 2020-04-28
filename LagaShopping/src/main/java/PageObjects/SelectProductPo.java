package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductPo {
	
	
	WebDriver driver;
	

	public SelectProductPo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(linkText = "Women" )
	WebElement womanBtn;
	
	
	
	@FindBy(linkText = "Dresses" )
	WebElement dressSel;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div")
	WebElement selctProduct;
	
	
	
	
	public void selectProdct() throws InterruptedException
	{
		womanBtn.click();
		Thread.sleep(2000); 	
		dressSel.click();
		
		Thread.sleep(3000);
		
		System.out.println("Select Product:");
		Actions a = new Actions(driver);
		a.moveToElement(selctProduct).build().perform();
	
		WebElement cartBtn =selctProduct.findElement(By.linkText("Add to cart"));	
		Thread.sleep(4000);
		
		cartBtn.click();
		
		WebElement procedd = driver.findElement(By.linkText("Proceed to checkout"));
		procedd.click();
		
		
		
		/*WebElement prize= selctProduct.findElement(By.xpath("//*[@id=\\\"center_column\\\"]/ul/li[1]/div/div[2]/div[1]/span"));
		System.out.println("Peize :"+prize);
		Thread.sleep(3000);
		
		*/
		
		
	}

}
