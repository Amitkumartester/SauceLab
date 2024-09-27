package saucedemotest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import baseclass.BaseClass;
import saucedemo.PageClass1;

public class SauceDemo_test extends BaseClass
{
	PageClass1 ob;
@BeforeTest
public void SauceDemourl()
{
getlaunchurl(getReadData("Url"));
ob = new PageClass1();
}

@Test(priority = 1)
public void fillonusername()
{
ob.fillonusername();
}

@Test(priority = 2)
public void fillonpassword()
{
ob.fillonpassword();
}

@Test(priority = 3)
public void clickonloginbutton()
{
ob.clickonloginbutton();
}

@Test(priority = 4)
public void clickonSauceLabsFleeceJacket()
{
ob.clickonSauceLabsFleeceJacket();
}

@Test(priority = 5)
public void clickonaddtocart()
{
ob.clickonaddtocart();
}

@Test(priority = 6)
public void clickongotocart()
{
ob.clickongotocart();
}

@Test(priority = 7)
public void clickoncheckout()
{
ob.clickoncheckout();

}

@Test(priority = 8)
public void clickonfillfirstname()
{
ob.clickonfillfirstname();

}

@Test(priority = 9)
public void clickonfilllastname()
{
ob.clickonfilllastname();

}

@Test(priority = 10)
public void clickonfillzipcode()
{
ob.clickonfillzipcode();

}

@Test(priority = 11)
public void clickoncontinuebtn()
{
ob.clickoncontinuebtn();

}

@Test(priority = 12)
public void clickonfinishbtn()
{
ob.clickonfinishbtn();
}

}



//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import baseclass.BaseClass;
//import saucedemo.PageClass1;
//
//
//public class Sauce_Lab_Test extends BaseClass {
//	PageClass1 ob;
//
//	@BeforeTest
//	public void getlaunchUrl() {
//		getLaunchUrl();
//		ob = new PageClass1();
//	}
//
//
//	@Test(priority = 1)
//	public void sauceClick(){
//		ob.sauce_Lab_Backpack();
//	}
//
//	@Test(priority = 2)
//	public void clickaddtocart() {
//		ob.click_add_cart();
//	}
//
//	
//
//
//}
