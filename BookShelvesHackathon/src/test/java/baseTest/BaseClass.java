package baseTest;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public Properties p;

	@BeforeClass
	@Parameters({"browser"})
	public void setup(String browser) throws IOException {
		// loading properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
			else if(browser.equals("Edge")){
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else
			{
				System.out.println("Choose correct browser");
			}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(p.getProperty("appURL"));

	}

	// Quit the browser
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		driver.quit();
	}

}
