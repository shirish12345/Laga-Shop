package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {

	public static WebDriver driver;

	@Test
	public static void browserLaunch() {
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiridix\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*
	 * public static WebDriver initializeDriver() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\shiridix\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 * driver= new ChromeDriver();
	 * driver.get("http://automationpractice.com/index.php");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); return
	 * driver;
	 * 
	 * }
	 */
}
