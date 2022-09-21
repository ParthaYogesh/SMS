package org.sddet40.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository 
{
@FindBy(xpath ="//input[@name='user_name']") private WebElement userNmeTextField;
@FindBy(xpath = "//input[@name='user_password']") private WebElement passwordTextField;
@FindBy(xpath = "//input[@id='submitButton']") private WebElement loginButton;
@FindBy(xpath = "//a[.='Contacts']") private WebElement contactsTab;



}
