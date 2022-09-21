package org.sddet40.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy(xpath ="//input[@name='user_name']") private WebElement userNmeTextField;
	@FindBy(xpath = "//input[@name='user_password']") private WebElement passwordTextField;
	@FindBy(xpath = "//input[@id='submitButton']") private WebElement loginButton;
	
	
	//Initialization all Element Variable
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Business Library
	
	public void LoginAction(String UserName, String Password)
	{
		userNmeTextField.sendKeys(UserName);
		passwordTextField.sendKeys(Password);
		loginButton.click();
	}
}
