package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage2 {
public WebDriver driver;
WebDriverWait wait;

public Loginpage2(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
@FindBy(xpath="//h2[text()='Shop By Collection']")WebElement Shopbycollection;
@FindBy(xpath="//a[contains(@href,'smart-watering-plants')]")WebElement smartwatering;
@FindBy(xpath="//div[text()='Money Tree Plant']")WebElement Moneytreeplant;
@FindBy(xpath="//label[text()='M']")WebElement sizeM;
@FindBy(xpath="(//button[@type='submit']//following-sibling::span)[3]")WebElement Addtocart;
@FindBy(xpath="//img[@alt='Best Selling Plants']")WebElement Bestsellingplants;
@FindBy(xpath="//div[text()='Indoor Olive Tree']")WebElement Indoorolivetree;
@FindBy(xpath="(//button[@type='submit']//following-sibling::span)[3]")WebElement add2cart;
@FindBy(xpath="//img[@alt='Easy House Plants']")WebElement easycareplant;
@FindBy(xpath="//div[text()='Golden Pothos Plant']//ancestor::div[contains(@class,'product')]//button[@type='submit']")WebElement GoldenPothosplant;
@FindBy(xpath="(//button[@type='submit'])[4]")WebElement Add2cartb;
@FindBy(xpath="//span[contains(text(),'Pet Friendly')]")WebElement Petfriendly;
@FindBy(xpath="//div[text()='Calathea Rattlesnake']//ancestor::div[contains(@class,'product')]//button[@type='submit']")WebElement Rattlesnake;
//@FindBy(xpath="//div[text()='Calathea Rattlesnake']")WebElement Rattlesnake;
@FindBy(xpath="(//button[@type='submit'])[4]")WebElement add2cartba;
public void shopbycollection() {
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].scrollIntoView(true);",Shopbycollection);
	smartwatering.click();
	wait.until(ExpectedConditions.elementToBeClickable(Moneytreeplant));
	Moneytreeplant.click();
	wait.until(ExpectedConditions.elementToBeClickable(Addtocart));
	Addtocart.click();
	driver.navigate().back();
	wait.until(ExpectedConditions.elementToBeClickable(Indoorolivetree));
	Indoorolivetree.click();
	 wait.until(ExpectedConditions.elementToBeClickable(add2cart));
	add2cart.click();
	}
public void shopbycollection1() {
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("arguments[0].scrollIntoView(true);",Shopbycollection);
	wait.until(ExpectedConditions.elementToBeClickable(easycareplant));
	easycareplant.click();
	js2.executeScript("arguments[0].scrollIntoView(true);",GoldenPothosplant);
	wait.until(ExpectedConditions.elementToBeClickable(GoldenPothosplant));
	GoldenPothosplant.click();
	js2.executeScript("arguments[0].scrollIntoView(true);",Add2cartb);
	wait.until(ExpectedConditions.elementToBeClickable(Add2cartb));
	Add2cartb.click();	
}
public void shopbycollection2() {
	JavascriptExecutor js3=(JavascriptExecutor)driver;
	js3.executeScript("arguments[0].scrollInToView(true);",Shopbycollection);
    wait.until(ExpectedConditions.elementToBeClickable(Petfriendly));
    Petfriendly.click();
    wait.until(ExpectedConditions.elementToBeClickable(Rattlesnake));
    Rattlesnake.click();
    wait.until(ExpectedConditions.elementToBeClickable( add2cartba));
    add2cartba.click();
    

}
}