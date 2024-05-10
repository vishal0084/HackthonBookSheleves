package testCases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pageObjects.HomePageObjects;

@Listeners(utility.ExtentReportManager.class)
public class TC001__HomePage extends BaseClass {

	@Test(priority = 1)
	public void clickOnBookShelves() throws InterruptedException, IOException {

		try {

			HomePageObjects HPO = new HomePageObjects(driver);
			HPO.clickOn();

			Thread.sleep(5000);
			HPO.hoverAndClickOpen();

			Thread.sleep(5000);
			HPO.clickOnStock();
			Thread.sleep(5000);

			HPO.getAllDetails();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
