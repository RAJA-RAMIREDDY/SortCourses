package resources_E_learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base {


	  public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\RAMRAJA\\Downloads\\E-learning\\MajorProject\\src\\main\\java\\resources_E_learning\\data.properties");

prop.load(fis);
//String browserName=prop.getProperty("browser");
//System.out.println(browserName);
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMRAJA\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");  
driver= new ChromeDriver();

/*if(browserName.equals("chrome"))
{
    	//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}*/

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}
}


