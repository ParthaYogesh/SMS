package org.sdet40.genericUtilty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility 
{
public WebDriver LaunchBrowser(String browser)
{
	WebDriver driver=null;
	
	switch(browser)
	{
	 case "Chrome":
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   break;

		  case "Firefox":
		   WebDriverManager.chromedriver().setup();
		   driver = new FirefoxDriver();
		   break;

		  case "IE":
		   WebDriverManager.chromedriver().setup();
		   driver = new InternetExplorerDriver();
		   break;

		  default:
		   System.out.println("please! enter valid browser key...");
		   break;
	}
	return driver;
}

public void maximizeBrowser(WebDriver driver)
{
	driver.manage().window().maximize();
}

public void WaitpageTillgetLoad(WebDriver driver, Long longtimeout)
{
	driver.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);
}

public void NavigateAppllication(WebDriver driver, String Url)
{
	driver.get(Url);
}

public WebDriver OpenBrowserWithApplication(String browser, Long Longtimeout, String Url)
{
	WebDriver driver=LaunchBrowser(browser);
	maximizeBrowser(driver);
	WaitpageTillgetLoad(driver, Longtimeout);
	NavigateAppllication(driver, Url);
	return driver;
	
}
public void MouseOverAction(WebDriver driver, WebElement element)
{
	new Actions(driver).moveToElement(element).perform();
}

public void DoubleClick(WebDriver driver, WebElement element)
{
	new Actions(driver).doubleClick().perform();
}

public void DoubleClick(WebDriver driver)
{
	new Actions(driver).doubleClick().perform();
}

public void CloseBrowser(WebDriver driver)
{
	driver.quit();
}
}
