package TestCases;

import org.testng.annotations.Test;

import com.Base.BrowserLaunch;

import PageObjects.LoginPO;
import PageObjects.RegisterPO;
import PageObjects.SelectProductPo;

public class RegisterTest extends IndexTest {

	@Test
	public void registerCust() throws InterruptedException {

		RegisterPO rp = new RegisterPO(driver);
		rp.register();
		Thread.sleep(5000);
		LoginPO lp =new LoginPO(driver);
		lp.signIn();
		Thread.sleep(3000);
		
		SelectProductPo sp = new SelectProductPo(driver);
		sp.selectProdct();

	}

}
