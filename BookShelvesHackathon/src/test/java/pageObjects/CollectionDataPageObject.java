package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.ScreenShots;

public class CollectionDataPageObject extends BasePage {

	
	// constructor
		public CollectionDataPageObject(WebDriver driver) throws IOException {
			super(driver);
		}
		
		ScreenShots ss=new ScreenShots(driver);
		
	//Locators
		
		//click on gift Card
		@FindBy(xpath=("//ul[@class=\"featuredLinksBar__linkContainer\"]/li[3]/a"))
		WebElement gift_Card;
		
		//click on stores
		@FindBy(xpath="//ul[@class=\"_19wbI\"]/li/a[@class=\"_1otc2\"][normalize-space()=\"Stores\"]")
		WebElement stores;
		
		//click on collections
		@FindBy(xpath="//ol[@class=\"_7vESp _1HSQd\"]/li[2]/a")
		WebElement collections;
		
		//collect all sub menu
		@FindBy(xpath=".//div[@class='row no-padding']")
		List<WebElement> all_subMenu;
		
	//Actions
		
		public void goToCollections() throws InterruptedException, IOException {
			ss.ScreenShot("HomePage");
			gift_Card.click();
			Thread.sleep(2000);
			stores.click();
			Thread.sleep(2000);
			ss.ScreenShot("Collections");
			collections.click();
			
		}
		
		public void takeAllSubMenu() {
			System.out.println("There are all Sub-Menu of the Collections :");
			for(WebElement subMenu : all_subMenu) {
				System.out.println(subMenu.getText().trim());
			}
		}
}
