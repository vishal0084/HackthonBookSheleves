package testCases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseTest.BaseClass;
import pageObjects.CollectionDataPageObject;


@Listeners(utility.ExtentReportManager.class)
public class TC002_CollectionPage extends BaseClass {

	@Test(priority = 1)
	public void validationOnCollections() throws InterruptedException, IOException {

		try {

			CollectionDataPageObject CDO = new CollectionDataPageObject(driver);

			CDO.goToCollections();
			CDO.takeAllSubMenu();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
