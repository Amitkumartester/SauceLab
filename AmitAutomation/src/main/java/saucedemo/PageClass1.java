package saucedemo;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class PageClass1 extends BaseClass
{

{
PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//*[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement loginbtn;

    @FindBy(xpath = "//*[text()='Sauce Labs Fleece Jacket']")
    private WebElement SauceLabsFleeceJacket;
   
    @FindBy(xpath = "//*[@id='add-to-cart']")
    private WebElement addtocart;
   
   
    @FindBy(xpath = "//*[@data-test='shopping-cart-badge']")
    private WebElement gotocart;
   
    @FindBy(xpath = "//*[@id='checkout']")
    private WebElement checkout;
   
    @FindBy(xpath = "//*[@id='first-name']")
    private WebElement fillfirstname;
   
    @FindBy(xpath = "//*[@id='last-name']")
    private WebElement filllastname;
   
    @FindBy(xpath = "//*[@id='postal-code']")
    private WebElement fillzipcode;

    @FindBy(xpath = "//*[@id='continue']")
    private WebElement continuebtn;
   
    @FindBy(xpath = "//*[@id='finish']")
    private WebElement finishbtn;
   
    public String Data="C:\\Users\\pc\\eclipse-workspace\\AmitAutomation\\testdata\\config.properties";
    
    public void fillonusername()
    {
    	username.sendKeys(getReadData("username"));
    }
   
    public void fillonpassword()
    {
    	password.sendKeys(getReadData("password"));
    }
   
    public void clickonloginbutton()
    {
    loginbtn.click();
    }
   
    public void clickonSauceLabsFleeceJacket()
    {
    SauceLabsFleeceJacket.click();
    }
   
    public void clickonaddtocart()
    {
    addtocart.click();
    }
   
    public void clickongotocart()
    {
    gotocart.click();
    }
   
    public void clickoncheckout()
    {
    checkout.click();
    }
   
    public void clickonfillfirstname()
    {
    fillfirstname.sendKeys(getReadData("Firstname"));
    }
   
    public void clickonfilllastname()
    {
    filllastname.sendKeys(getReadData("Lastname"));
    }
   
    public void clickonfillzipcode()
    {
   
    try
    {
    Thread.sleep(3000);
    fillzipcode.sendKeys(getReadData("Zipcode"));

} catch (Exception e)
    {
// TODO: handle exception
}
    }
   
    public void clickoncontinuebtn()
    {
    try
    {
    Thread.sleep(3000);
    continuebtn.click();

} catch (Exception e)
    {
// TODO: handle exception
}
    }
   
    /*   public void printui()
    {
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

       
  /*     try
       {
      FileUtils.copyFile(screenshot, new File("screenshot.png"));
      System.out.println("Full page screenshot saved.");
     

} catch (Exception e)
       {
e.printStackTrace();
       }
    }
   */
    public void clickonfinishbtn()
    {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", finishbtn);
    try
    {
    Thread.sleep(3000);
        finishbtn.click();

}
    catch (Exception e)
    {
// TODO: handle exception
}
    }



}
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import baseclass.BaseClass;
//
//public class PageClass1 extends BaseClass
//{
//	public PageClass1() { 
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
//	private WebElement click_sauce_lab_backpack;
//	
//	@FindBy(xpath ="//a[@data-test='shopping-cart-link']")
//	private WebElement click_add_to_cart ;
//	
//	
//	
//	public void sauce_Lab_Backpack()
//	{
//		
//		click_sauce_lab_backpack.click();
//	
//		
//	}
//	public void  click_add_cart()
//	{
//		
//		click_add_to_cart.click();
//		
//		driver.navigate().back();
//		
//	}
//
//}
