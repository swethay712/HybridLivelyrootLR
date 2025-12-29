package testCases;

import org.testng.annotations.*;

import base.Baseclass;
import pageObjects.Loginpage;

public class TC1Login extends Baseclass {
	Loginpage lr;
	@Test(priority=1)
	public void LRShopHolidayDecor() {
		lr=new Loginpage(driver);
		lr.ShopHolidayDecor1();
		log.info("EuropeanChristmastree added to cart successfully");
	}
	@Test(priority=2)
	public void LRShopbycollection() throws InterruptedException {
		lr=new Loginpage(driver);
		lr.Shopbycollection();
		log.info("MoneyTreeplant is added to cart successfully");
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void LRshopbycollection1() throws InterruptedException  {
		lr=new Loginpage(driver);
		lr.shopbycollection1();
		log.info("Bromeliad guzmania is added to cart successfully");
	}

}
