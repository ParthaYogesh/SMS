//3
package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile 
{
public static void main(String[] args) throws IOException
{
	
	// Convert the physical file into Java readable object
	FileInputStream fis=new FileInputStream("./src/test/resources/PY.Properties");
	
	
	//Create the Object for Properties
	Properties pro=new Properties();
	
	//Load the Keys
	pro.load(fis);
	
	//Fetch the Data
	String url=pro.getProperty("url").trim();
	
	String browser=pro.getProperty("browser").trim();
	
	
	System.out.println(url);
	System.out.println(browser);
	
}
}
