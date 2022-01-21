package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class OpenFacebook extends BaseClass{

	@FindBy(xpath="//*[@class='_97w4']")
	WebElement forgotPwd;
	
	public OpenFacebook() {
		PageFactory.initElements(driver, this);
	}
	
	public void FacebookPassword() {
		forgotPwd.click();
	}
}
