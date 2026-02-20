package testCases;

import org.testng.annotations.*;

import base.Baseclass;
import pageObjects.Loginpage1;

public class TC2Login extends Baseclass{
	Loginpage1 lr1;
	@Test(priority=1)
 public void LRshopbyplantype() {
	 lr1=new Loginpage1(driver);
		lr1.shopByplanttype();
		log.info("purplephalaenopsisorchid added to cart successfully");
 }
	@Test(priority=2)
	public void LRShopbyplanttype2() {
		 lr1=new Loginpage1(driver);
		 lr1.shopbyplanttype2();
		 log.info("AirplantgrabBag is added to cart succesfully");
	}
	@Test(priority=3)
	public void LrShopbplantype3() {
		lr1=new Loginpage1(driver);
		 lr1.shopbyplantype3();
		 log.info("Pineappleplant is added to cart successfully");
	}
	@Test(priority=4)
   public void Lrshopbyplantype4() {
	   lr1=new Loginpage1(driver);
	   lr1.shopbyplantype4();
	   log.info("Hoyaheartplant is added to cart");
	   log.info("Redchristmascactus plant was clicked");
   }
}
