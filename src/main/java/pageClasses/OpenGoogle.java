package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class OpenGoogle extends BaseClass{
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchTextBox;
	
	@FindBy(xpath="//input[@class='gNO89b']")
	WebElement searchButton;
	
	public OpenGoogle()
	{
		
		PageFactory.initElements(driver, this);
				
	}
	
	public void GoogleSearch()
	{
		searchTextBox.sendKeys("omicron");
		searchButton.click();
		
	}	

}
