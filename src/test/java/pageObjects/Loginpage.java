package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
       public WebDriver driver;
       public Loginpage(WebDriver driver) {
    	   this.driver=driver;
    	   PageFactory.initElements(driver,this);
    	 
       }
       
       @FindBy(xpath="//h2[normalize-space(text())='Shop Holiday Decor']")
       WebElement ShopHolidayDecor;
       @FindBy(xpath="//div[text()='European Cypress Christmas Tree']")
       WebElement Eurocypxmasstree;
     @FindBy(xpath="//button[@id='ProductSubmitButton-template--15535860809810__main']")
     WebElement Addtocartbtn;
     @FindBy(xpath="//h2[text()='Shop By Collection']")
     WebElement shopbycollection;
     @FindBy(xpath="//img[@src='//www.livelyroot.com/cdn/shop/collections/Best_Selling_Plants.jpg?v=1747198854&width=1080']")
		      WebElement Bestsellers;
    @FindBy(xpath="//img[@src=\"https://cdn.shopify.com/s/files/1/0068/4215/5090/t/115/assets/5724ee3406dc--PB-MT-SWP-WH-6IN1-kitchen.jpg\"]")
     WebElement Moneytreeplant;
    @FindBy(xpath="//label[text()='M']")
    WebElement sizeM;
    @FindBy(xpath="//button[@id=\"ProductSubmitButton-template--15535860809810__main\"]")
    		WebElement add2cart;
    @FindBy(xpath="//img[@src=\"//www.livelyroot.com/cdn/shop/collections/dogue-de-bordeaux-1047521_1280.jpg?v=1747198537&width=1080\"]")
     WebElement petfriendly;
  @FindBy(xpath="//img[@src=\"https://cdn.shopify.com/s/files/1/0068/4215/5090/t/115/assets/330c7420d760--PB-GUZ-ECO-MA-4IN1-kitchen.jpg\"]")
  WebElement Bromeliadguzmania;
     @FindBy(xpath="//button[@id=\"ProductSubmitButton-template--15535860809810__main\"]")
     WebElement Addtocart;
  
  
     public void ShopHolidayDecor1() {
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("arguments[0].scrollIntoView(true);",ShopHolidayDecor);
          Eurocypxmasstree.click();
          Addtocartbtn.click();
              }
     public void Shopbycollection() {
    	 driver.navigate().to("https://www.livelyroot.com/");
    	 JavascriptExecutor js1=(JavascriptExecutor)driver;
    	 js1.executeScript("arguments[0].scrollIntoView(true);",shopbycollection);
    	 Bestsellers.click();
    	 Moneytreeplant.click();
    	 sizeM.click();
    	 add2cart.click();
     }
     public void shopbycollection1() throws InterruptedException {
    	
    	 driver.navigate().to("https://www.livelyroot.com/");
    	 JavascriptExecutor js2=(JavascriptExecutor)driver;
    	 js2.executeScript("arguments[0].scrollIntoView(true);",shopbycollection);
    	 petfriendly.click();
    	 Bromeliadguzmania.click();
    	 Addtocart.click();
    	 
     }
     
}
