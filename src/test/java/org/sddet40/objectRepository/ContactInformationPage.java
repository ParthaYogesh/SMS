package org.sddet40.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage 
{
	//Declaration
		@FindBy(xpath = "//span[@id='dtlview_Last Name']") private WebElement actualLastNameText;
		
		
		
		//Initialization
			public ContactInformationPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Business Library
			
			public String getLastName()
			{
				return actualLastNameText.getText();
			}
}
