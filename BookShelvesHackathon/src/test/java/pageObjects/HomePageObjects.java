package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utility.ScreenShots;

public class HomePageObjects extends BasePage {

	// constructor
	public HomePageObjects(WebDriver driver) throws IOException {
		super(driver);
	}

	ScreenShots ss=new ScreenShots(driver);
	
	// Locater

	// bookshelves
	@FindBy(xpath = "//h4[text()='Bookshelves']")
	WebElement logo_bookshelves;

	// click to storageType
	@FindBy(xpath = "//li[@data-group=\"storage type\"]/div[1]")
	WebElement storageType;

	// click on open
	@FindBy(xpath = "//li[@data-option-key=\"Open\"]/label")
	WebElement button_open;

	// click on out for stock
	@FindBy(xpath = "//div[@class='option']//input[@id='filters_availability_In_Stock_Only']")
	WebElement stock_only;

	// all item
	@FindBy(xpath = "//li[contains(@class, 'product')]")
	List<WebElement> all_Product;
	
	//click on close
	@FindBy(xpath="//div[@class=\"vert-container\"]/div[2]/a")
	WebElement close_click;


	// Action

	public void clickOn() throws InterruptedException, IOException {
		ss.ScreenShot("Home");
		logo_bookshelves.click();
		Thread.sleep(3000);
		close_click.click();
	}

	public void hoverAndClickOpen() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(storageType).build().perform();
		button_open.click();
	}

	public void clickOnStock() throws IOException {
		stock_only.click();
		ss.ScreenShot("Filter");
	}

	public void getAllDetails() throws InterruptedException, IOException {
		System.out.println("Name & Price of first 3 Bookshelves below Rs. 15000 with open storage type:");
		int count=0;
		for (WebElement shelf : all_Product) {
			String name = shelf.findElement(By.xpath(".//div[contains(@class, 'product-title')]//span")).getText()
					.trim();
			
			String price = shelf.findElement(By.xpath(".//div[contains(@class, 'price-number')]//span")).getText()
					.trim();
			int priceValue = Integer.parseInt(price.replaceAll("[^0-9]", ""));
			if (priceValue < 15000) {
				System.out.println((count + 1) + ". " + name + " - " + price);
				count++;
			}
			if (count >= 3) {
				break;
			}
		}

	}

}
