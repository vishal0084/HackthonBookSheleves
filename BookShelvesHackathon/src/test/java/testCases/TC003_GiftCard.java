package testCases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pageObjects.GiftCardPageObject;

@Listeners(utility.ExtentReportManager.class)
public class TC003_GiftCard extends BaseClass {

	@Test(priority=1)
	public void validateGiftCard() throws InterruptedException, IOException {
		
		
		try {
			
			GiftCardPageObject GCPO = new GiftCardPageObject(driver);
			GCPO.sendGiftCard();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
