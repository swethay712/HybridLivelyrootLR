package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage1 {
  public WebDriver driver;
  public Loginpage1(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath="//h2[normalize-space(text())='Shop By Plant Type']")
		  WebElement Shopbyplantype;
@FindBy(xpath="//img[@src='//www.livelyroot.com/cdn/shop/collections/Pl_3in_3_pack_Assorted-Phalaenopsis-Orchid_Orange-Eco-Pots_01.jpg?v=1746674567&width=1080']")
         WebElement Orchids;
@FindBy(xpath="//img[@src='https://cdn.shopify.com/s/files/1/0068/4215/5090/t/115/assets/57e3f3ae22e0--Pl-5in-purple-phalaenopsis-orchid-White-Eco-Pot-01.jpg']")
         WebElement purplephalaenopsisorchid;
@FindBy(xpath="//button[@id='ProductSubmitButton-template--15535860809810__main']")
         WebElement ADDd2cart;
@FindBy(xpath="//img[@src='//www.livelyroot.com/cdn/shop/collections/tillandsia_livelyroot_airplants.jpg?v=1747194266&width=1080']")
         WebElement Airplants;
@FindBy(xpath="//img[@src='https://cdn.shopify.com/s/files/1/0068/4215/5090/t/115/assets/11952033c97c--pl-CaputMadusae-Airplant.jpg']")
        WebElement AirplantgrabBag;
@FindBy(xpath="//button[@id='ProductSubmitButton-template--15515883700306__main']")
         WebElement Add2cart1;
@FindBy(xpath="//button[@name='checkout']")
         WebElement checkout;
@FindBy(xpath="//img[@src='//www.livelyroot.com/cdn/shop/collections/Bromeliad_LRTerra_1.jpg?v=1746676215&width=1080']")
            WebElement Bromeliads;
@FindBy(xpath="//div[text()='Pineapple Plant']")
             WebElement Pineappleplant;
@FindBy(xpath="//img[@alt='Succulent Plants']")
            WebElement Succulentplant;
@FindBy(xpath="//div[text()='Hoya Heart Plant']")
             WebElement Hoyaheartplant;
@FindBy(xpath="//button[@name='add']")
              WebElement add2cart2;
@FindBy(xpath="//div[text()='Red Christmas Cactus']")
                    WebElement RedChrismascactus;
@FindBy(xpath="//button[@type='submit']//span[normalize-space(text())='Add to cart']")
                      WebElement add2cart1a;
@FindBy(xpath="//div[normalize-space(text())='String of Pearls Plant']")
                      WebElement Strinfofpearlsplant;


public void shopByplanttype() {
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("arguments[0].scrollIntoView(true);",Shopbyplantype);
	Orchids.click();
	purplephalaenopsisorchid.click();
	ADDd2cart.click();
	}
public void shopbyplanttype2() {
	driver.navigate().to("https://www.livelyroot.com/?srsltid=AfmBOorREGxfPXdD5-3IArBsc0GLelnVIVrEUQjmz5fLujlnCEILTIQm");
		JavascriptExecutor js3=(JavascriptExecutor)driver;
	js3.executeScript("arguments[0].scrollIntoView(true);",Shopbyplantype);
	 Airplants.click();
	 AirplantgrabBag.click();
	 Add2cart1.click();
	 checkout.click();
}
public void shopbyplantype3() {
	driver.navigate().to("https://www.livelyroot.com/?srsltid=AfmBOorREGxfPXdD5-3IArBsc0GLelnVIVrEUQjmz5fLujlnCEILTIQm");
	JavascriptExecutor js4=(JavascriptExecutor)driver;
	js4.executeScript("arguments[0].scrollIntoView(true);",Shopbyplantype);
	Bromeliads.click();
     Pineappleplant.click();
}
public void shopbyplantype4() {
	driver.navigate().to("https://www.livelyroot.com/?srsltid=AfmBOorREGxfPXdD5-3IArBsc0GLelnVIVrEUQjmz5fLujlnCEILTIQm");
	    JavascriptExecutor js5 = (JavascriptExecutor) driver;
	    js5.executeScript("arguments[0].scrollIntoView(true);",Shopbyplantype);
	    Succulentplant.click();
	    Hoyaheartplant.click();
	    add2cart2.click();
	    driver.navigate().back();
	    RedChrismascactus.click();
	    add2cart1a.click();
	    
}

}