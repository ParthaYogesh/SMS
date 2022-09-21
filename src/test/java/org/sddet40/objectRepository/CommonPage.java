package org.sddet40.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sdet40.genericUtilty.WebDriverUtility;

public class CommonPage 
{
//Declaration
	
	@FindBy(xpath="//a[.='Contacts']") private WebElement contactsTab;
	@FindBy(xpath="/") private WebElement administrationIcon;
	@FindBy(xpath="//a[.='Sign Out']") private WebElement signoutLink;
		
	//Initialization all Element Variable
	
		public CommonPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Business Library
		
		public void ClickContactTab()
		{
			contactsTab.click();
		}
		
		public void signOutAction(WebDriverUtility  webDriverUtility, WebDriver driver)
		{
			webDriverUtility.MouseOverAction(driver, administrationIcon);
			signoutLink.click();
		}
}
