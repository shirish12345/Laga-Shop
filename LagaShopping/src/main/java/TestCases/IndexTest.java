package TestCases;

import org.testng.annotations.Test;

import com.Base.BrowserLaunch;

import PageObjects.IndexPO;

public class IndexTest extends BrowserLaunch{
	

	@Test
	public void test1() throws InterruptedException {
		
		
		IndexPO ip =  new IndexPO(driver);
		ip.clicksignin();
		
		
	}
}
