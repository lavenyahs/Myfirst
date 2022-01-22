package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;

public class FacebookTest extends BaseClass{

	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	public FacebookTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		launchBrowser();
		driver.get("https://www.facebook.com");
		//ExtentManager.reports.createTest("Browser Launched" ).log(Status.PASS, "Google Home Page opened");
		log.info("Browser opened");
		System.out.println("This is Git Demo 11 develop");
		System.out.println("This is Git Demo 22");
		System.out.println("Gitstuff change 1");
		System.out.println("Gitstuff change 2 develop");
	}
	
	@Test
	public void openGoogle() {
		
		Assert.assertEquals(driver.getTitle(), "Google");
		//ExtentManager.reports.createTest("Google Verification").log(Status.PASS, "Google Verify Title Passed");
		log.info("please print");
		log.info("Title verified");
		System.out.println("This is Git Demo 3 develop");
		System.out.println("This is Git Demo 4");
		System.out.println("Gitstuff change 3");
		System.out.println("Gitstuff change 4 develop");
	}
}

