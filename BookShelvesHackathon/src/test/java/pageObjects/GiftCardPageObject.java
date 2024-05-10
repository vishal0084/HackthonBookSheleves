package pageObjects;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utility.ScreenShots;

public class GiftCardPageObject extends BasePage {
	

	// constructor
	public GiftCardPageObject(WebDriver driver) throws IOException {
		super(driver);
	}

	ScreenShots ss=new ScreenShots(driver);
	
	// Locators

	// click on gift Card
	@FindBy(xpath = ("//ul[@class=\"featuredLinksBar__linkContainer\"]/li[3]/a"))
	WebElement gift_Card;

	// scrollDown
	@FindBy(xpath = "//h1[@class=\"_1bluI\"]")
	WebElement scrollGift;

	// click on birthday/anniversary action
	@FindBy(xpath = "//li[@class=\"_11b4v\"]//img[@alt=\"Birthday/Anniversary Gift Card by Urban Ladder\"]")
	WebElement birthday_Anniversary;

	// click on rupees
	@FindBy(xpath = "//div[@class=\"_3jn98 _23tqD _3k9Vm\"]/button[3]")
	WebElement click_Rupees;

	// click on button
	@FindBy(xpath = "//button[@class=\"_1IFIb _1fVSi action-button _1gIUf _1XfDi\"]")
	WebElement next_click;

	// recivername
	@FindBy(xpath = "//input[@id=\"ip_4036288348\"]")
	WebElement rName;

	// reciverEmail
	@FindBy(xpath = "//input[@id=\"ip_137656023\"]")
	WebElement rEmail;

	// reciverMobile
	@FindBy(xpath = "//input[@id=\"ip_3177473671\"]")
	WebElement rMob;

	// senderName
	@FindBy(xpath = "//input[@id=\"ip_1082986083\"]")
	WebElement sName;

	// senderEmail
	@FindBy(xpath = "//input[@id=\"ip_4081352456\"]")
	WebElement sEmail;

	// senderMobile
	@FindBy(xpath = "//input[@id=\"ip_2121573464\"]")
	WebElement sMob;

	// senderAddress
	@FindBy(xpath = "//input[@id=\"ip_2194351474\"]")
	WebElement sAddress;

	// senderPincode
	@FindBy(xpath = "//input[@id=\"ip_567727260\"]")
	WebElement sPincode;

	// senderCity
	@FindBy(xpath = "//input[@id=\"ip_1554905400\"]")
	WebElement sCity;

	// messagesending
	@FindBy(xpath = "//textarea[@id=\"ip_582840596\"]")
	WebElement send_Message;
	
	//submit
	@FindBy(xpath="//button[@class=\"_3Hxyv _1fVSi action-button _1gIUf _1XfDi\"]")
	WebElement submit;
	

	// Actions
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions act = new Actions(driver);

	public void sendGiftCard() throws InterruptedException, IOException {
		
		ss.ScreenShot("CardPage");
		gift_Card.click();
		js.executeScript("arguments[0].scrollIntoView();", scrollGift);
		Thread.sleep(5000);
		act.moveToElement(birthday_Anniversary).build().perform();
		Thread.sleep(5000);
		birthday_Anniversary.click();
		Thread.sleep(5000);
		click_Rupees.click();
		Thread.sleep(5000);
		next_click.click();
		Thread.sleep(5000);
		rName.sendKeys("Vishal Kumar");
		Thread.sleep(2000);
		rEmail.sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		rMob.sendKeys("8340230358");
		Thread.sleep(2000);
		sName.sendKeys("Deepak Kumar");
		Thread.sleep(2000);
		sEmail.sendKeys("deppak123@gmail.com");
		Thread.sleep(2000);
		sMob.sendKeys("9032466935");
		Thread.sleep(2000);
		sAddress.sendKeys("Odisa");
		Thread.sleep(2000);
		
		sPincode.sendKeys("751017");
		Thread.sleep(2000);
		send_Message.sendKeys("Hey,Many many returns of the day , enjoy ur day");
		
		Thread.sleep(5000);
		submit.click();
		ss.ScreenShot("DeatilsDescription");
		Thread.sleep(5000);
		
		

	}
}
