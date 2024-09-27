package baseclass;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertyutility.PropertyUtility;

public class BaseClass implements PropertyUtility
{
static public WebDriver driver;
String Path = "C:\\Users\\pc\\eclipse-workspace\\AmitAutomation\\testdata\\config.properties";

public void getlaunchurl(String Url)
{
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivek Yadav\\eclipse-workspace\\SoucDemo\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get(Url);
driver.manage().window().maximize();
}

@Override
public String getReadData(String key)
{
String value ="";
try
{
FileInputStream fis = new FileInputStream(Path);
Properties prop = new Properties();
prop.load(fis);
value = prop.getProperty(key);

}
catch (Exception e)
{
System.out.println("issue in the get read data" +e);
}
return value;

}
}


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseClass {
//	public static WebDriver driver = null;
//
//	public void getLaunchUrl() 
//	{
//		//System.setProperty("webdriver.chrome.driver",
//			//	"C:\\Users\\ROBIN\\Desktop\\Mavenpractise\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By
//				.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
//		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@name='login-button']")).click();
//	
//	
//		
//	}
//
//	/*@AfterTest  
//	public void teardown()
//	{
//		driver.quit();
//	}*/
//}